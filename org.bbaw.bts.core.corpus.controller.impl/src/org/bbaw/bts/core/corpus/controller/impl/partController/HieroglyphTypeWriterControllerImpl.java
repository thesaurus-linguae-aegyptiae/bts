package org.bbaw.bts.core.corpus.controller.impl.partController;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.inject.Inject;

import jsesh.hieroglyphs.CompositeHieroglyphsManager;
import jsesh.hieroglyphs.PossibilitiesList;
import jsesh.hieroglyphs.Possibility;
import jsesh.mdc.MDCSyntaxError;
import jsesh.mdc.utils.MDCNormalizer;

import org.bbaw.bts.btsmodel.UserActionCounter;
import org.bbaw.bts.core.corpus.controller.partController.HieroglyphTypeWriterController;
import org.bbaw.bts.core.services.UserActionCounterService;

public class HieroglyphTypeWriterControllerImpl implements
		HieroglyphTypeWriterController {

	@Inject
	private UserActionCounterService actionCounterService;

	private CompositeHieroglyphsManager hieroglyphManager = new CompositeHieroglyphsManager()
			.getInstance();
	private Comparator<UserActionCounter> counterComparator;

	private MDCNormalizer mdcNormalizer = new MDCNormalizer();

	@Override
	public String getHieroglypheProposalsAsMdCString(String code,
			Map counterCacheMap) {
		List<UserActionCounter> counters = actionCounterService
				.getCountersForPrefix(code);
		// due to scattered cache map system loaded resources are not cached
		// when loaded through emf
		if (counterCacheMap != null) {
			for (UserActionCounter c : counters) {
				if (!counterCacheMap.containsKey(c.eResource().getURI())) {

					counterCacheMap.put(c.eResource().getURI(), c.eResource());
				}
			}
		}

		if (!counters.isEmpty()) {
			Collections.sort(counters, getComparator());
		}
		String mdc = transformProposalsToString(counters);
		if (counters.size() > 9) {
			return mdc;
		} else {
			String c = code.substring(0,1).toUpperCase();
			if (code.length() > 1)
			{
				c += code.substring(1, code.length());
			}
			PossibilitiesList list = hieroglyphManager
					.getCodesStartingWith(c);

			int start = counters.size() + 1;
			for (int i = 0; i < list.asList().size() && i < 10; i++) {
				Possibility pos = list.asList().get(i);
				// String prop = pos.getCode();// + "-\"" + i +
				// "\"";
				if (pos != null && !"".equals(pos.getCode())
						&& !countersContain(counters, pos.getCode())) {
					int index = start + i;
					mdc += "-" + pos.getCode() + "-\"" + pos.getCode() + "\"\""
							+ index + "\"\\red";
				}
			}
		}
		return mdc;
	}

	private boolean countersContain(List<UserActionCounter> counters,
			String code) {
		if (counters != null) {
			for (UserActionCounter c : counters) {
				if (c.get_id() != null && c.get_id().equals(code)) {
					return true;
				}
			}
		}
		return false;
	}

	private String transformProposalsToString(
			List<UserActionCounter> counters) {
		String mdc = "";

		for (int i = 0; i < counters.size() && i < 10; i++) {
			UserActionCounter counter = counters.get(i);
			// String prop = pos.getCode();// + "-\"" + i +
			// "\"";
			if (counter != null && !"".equals(counter.get_id())) {
				mdc += "-" + counter.get_id().toUpperCase() + "-\""
						+ counter.get_id().toUpperCase()
 + "\"\"" + (i + 1)
						+ "\"\\red";
			}
		}
		return mdc;
	}

	private Comparator<? super UserActionCounter> getComparator() {
		if (counterComparator == null)
		{
			counterComparator = new Comparator<UserActionCounter>(){

				private Date now = Calendar.getInstance().getTime();
				@Override
				public int compare(UserActionCounter o1,
						UserActionCounter o2) {
					if (o1 != null && o2 != null)
					{
						int di1 = 5;
						if (o1.getDateOfLastSelection() != null) {
							di1 = getMonthsBetweenDates(
									o1.getDateOfLastSelection(), now);
						}
						int di2 = 5;
						int c1 = o1.getCounter() / di1;
						if (o2.getDateOfLastSelection() != null) {
							di2 = getMonthsBetweenDates(
									o2.getDateOfLastSelection(), now);
						}
						int c2 = o2.getCounter() / di2;
						return c2 - c1;
					}
					return 0;
				}


				/**
				 * Gets number of months between two dates.
				 * <p>
				 * Months are calculated as following:
				 * </p>
				 * <p>
				 * After calculating number of months from years and months from
				 * two dates, if there are still any extra days, it will be
				 * considered as one more month. For ex, Months between
				 * 2012-01-01 and 2013-02-06 will be 14 as Total Months = Months
				 * from year difference are 12 + Difference between months in
				 * dates is 1 + one month since day 06 in enddate is greater
				 * than day 01 in startDate.
				 * </p>
				 * 
				 * @param startDate
				 * @param endDate
				 * @return
				 */
				public int getMonthsBetweenDates(Date startDate, Date endDate) {
					if (startDate.getTime() > endDate.getTime()) {
						Date temp = startDate;
						startDate = endDate;
						endDate = temp;
					}
					Calendar startCalendar = Calendar.getInstance();
					startCalendar.setTime(startDate);
					Calendar endCalendar = Calendar.getInstance();
					endCalendar.setTime(endDate);

					int yearDiff = endCalendar.get(Calendar.YEAR)
							- startCalendar.get(Calendar.YEAR);
					int monthsBetween = endCalendar.get(Calendar.MONTH)
							- startCalendar.get(Calendar.MONTH) + 12 * yearDiff;

					if (endCalendar.get(Calendar.DAY_OF_MONTH) >= startCalendar
							.get(Calendar.DAY_OF_MONTH))
						monthsBetween = monthsBetween + 1;
					return monthsBetween;

				}

			};
		}
		return counterComparator;
	}

	@Override
	public void updateGraphicSelectionCounter(String beforeImageMdC,
			String newMdC) {
		StringTokenizer oldtok = new StringTokenizer(beforeImageMdC, ":-<>*");
		Set<String> oldMap = new HashSet<String>();
		StringTokenizer newtok = new StringTokenizer(newMdC, ":-<>*");
		List<String> toAdd = new Vector<String>();

		while (oldtok.hasMoreTokens()) {
			oldMap.add(oldtok.nextToken());
		}
		String s;
		String normalized;
		while (newtok.hasMoreTokens()) {
			s = newtok.nextToken();
			if ("//".equals(s)) continue; // destruction // is not important
			try {
				normalized = mdcNormalizer.normalize(s);
			} catch (MDCSyntaxError e) {
				normalized = s;
			}
			if (!(oldMap.contains(s) || oldMap.contains(normalized))) {
				toAdd.add(normalized);
			}
		}
		actionCounterService.updateCounters(toAdd);
	}
}
