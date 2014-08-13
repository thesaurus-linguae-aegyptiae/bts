package org.bbaw.bts.ui.main.handlers;

/* 
 * Handler to open up a configured preferences dialog.
 * Written by Brian de Alwis, Manumitting Technologies.
 * Placed in the public domain.
 */

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.bbaw.bts.corpus.text.egy.ui.EgyDslExecutableExtensionFactory;
import org.bbaw.bts.corpus.text.egy.ui.internal.EgyDslActivator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtext.builder.preferences.BuilderPreferencePage;
import org.eclipse.xtext.ui.editor.templates.XtextTemplatePreferencePage;

import com.google.inject.Injector;

public class ShowPreferenceDialogHandler {
	public static final String PREFS_PAGE_XP = "org.eclipse.ui.preferencePages";
	protected static final String ELMT_PAGE = "page"; // $NON-NLS-1$
	protected static final String ATTR_ID = "id"; // $NON-NLS-1$
	protected static final String ATTR_CATEGORY = "category"; // $NON-NLS-1$
	protected static final String ATTR_CLASS = "class"; // $NON-NLS-1$
	protected static final String ATTR_NAME = "name"; // $NON-NLS-1$

	@Inject
	@Named(IServiceConstants.ACTIVE_SHELL)
	protected Shell shell;

	@Inject
	protected IEclipseContext context;
	@Inject
	protected Logger logger;
	@Inject
	protected IExtensionRegistry registry;
	private Injector injector;

	private Set<String> suppressedPagesCache;

	@Execute
	public void execute(MApplication app) {
		PreferenceManager pm = configurePreferences();
		PreferenceDialog dialog = new PreferenceDialog(shell, pm);
		dialog.setPreferenceStore(new ScopedPreferenceStore(
				InstanceScope.INSTANCE, "org.bbaw.bts.app"));
		dialog.create();
		dialog.getTreeViewer().setComparator(new ViewerComparator());
		dialog.getTreeViewer().expandAll();
		dialog.open();
	}

	private PreferenceManager configurePreferences() {
		initializeCache();
		PreferenceManager pm = new PreferenceManager();
		IContributionFactory factory = context.get(IContributionFactory.class);

		fillContext();
		for (IConfigurationElement elmt : registry
				.getConfigurationElementsFor(PREFS_PAGE_XP)) {
			if (!elmt.getName().equals(ELMT_PAGE)) {
				logger.warn("unexpected element: {0}", elmt.getName());
				continue;
			} else if (isEmpty(elmt.getAttribute(ATTR_ID))
					|| isEmpty(elmt.getAttribute(ATTR_NAME))) {
				logger.warn("missing id and/or name: {}",
						elmt.getNamespaceIdentifier());
				continue;
			}
			PreferenceNode pn = null;
			System.out.println(elmt.getNamespaceIdentifier());
			if (suppressedPagesCache.contains(elmt.getNamespaceIdentifier())) {
				continue;
			}
			if (elmt.getAttribute(ATTR_CLASS) != null) {
				IPreferencePage page = null;
				System.out.println(elmt.getAttribute(ATTR_CLASS));
				try {
					String classUri = elmt.getAttribute(ATTR_CLASS);
					if (classUri
							.startsWith("org.bbaw.bts.corpus.text.egy.ui.EgyDslExecutableExtensionFactory")) {
						classUri = classUri
.substring(65, classUri.length());
						System.out.println(classUri);
					}
 else if (classUri.contains(":")) {
						classUri = classUri.substring(
								classUri.indexOf(":") + 1, classUri.length());
						System.out.println("cut uri " + classUri);
					}

					String prefPageURI = getClassURI(
							elmt.getNamespaceIdentifier(), classUri);
					Object object = factory.create(prefPageURI, context);
					
					if (!(object instanceof IPreferencePage)) {
						logger.error(
								"Expected instance of IPreferencePage: {0}",
								elmt.getAttribute(ATTR_CLASS));
						continue;
					}
					if (page instanceof BuilderPreferencePage) {
						continue;
					}
					page = (IPreferencePage) object;
				} catch (ClassNotFoundException e) {
					logger.error(e);
					continue;
				}
				ContextInjectionFactory.inject(page, context);
				if (elmt.getNamespaceIdentifier().equals(
						"org.bbaw.bts.corpus.text.egy.egydsl.ui")
						|| page instanceof XtextTemplatePreferencePage) {
//					EgyDslActivator activator = EgyDslActivator.getInstance();
//					injector = activator
//							.getInjector(EgyDslActivator.ORG_BBAW_BTS_CORPUS_TEXT_EGY_EGYDSL);
//					injector.injectMembers(page);
				}
				if ((page.getTitle() == null || page.getTitle().isEmpty())
						&& elmt.getAttribute(ATTR_NAME) != null) {
					page.setTitle(elmt.getAttribute(ATTR_NAME));
				}
				pn = new PreferenceNode(elmt.getAttribute(ATTR_ID), page);
			} else {
				pn = new PreferenceNode(elmt.getAttribute(ATTR_ID),
						new EmptyPreferencePage(elmt.getAttribute(ATTR_NAME)));
			}
			if (isEmpty(elmt.getAttribute(ATTR_CATEGORY))) {
				pm.addToRoot(pn);
			} else {
				IPreferenceNode parent = findNode(pm,
						elmt.getAttribute(ATTR_CATEGORY));
				if (parent == null) {
					pm.addToRoot(pn);
				} else {
					parent.add(pn);
				}
			}
		}

		return pm;
	}

	private void fillContext() {
		IPreferenceStore store = PlatformUI.getPreferenceStore();
		context.set(IPreferenceStore.class, store);

	}

	private void initializeCache() {
		suppressedPagesCache = new HashSet<String>();
		suppressedPagesCache.add("org.eclipse.ui.ide");
		suppressedPagesCache.add("org.eclipse.jdt.ui");
		suppressedPagesCache.add("org.eclipse.jdt.debug.ui");
		suppressedPagesCache.add("org.eclipse.debug.ui");
		suppressedPagesCache.add("org.eclipse.help.ui");
		suppressedPagesCache.add("org.eclipse.e4.tools.css.editor.ui");

		suppressedPagesCache.add("org.eclipse.ui.editors");
		suppressedPagesCache.add("org.eclipse.pde.ui");
		suppressedPagesCache.add("org.eclipse.team.ui");
		suppressedPagesCache.add("org.eclipse.ui.externaltools");
		suppressedPagesCache.add("org.eclipse.ui.trace");
		suppressedPagesCache.add("org.eclipse.ant.ui");
		suppressedPagesCache.add("org.eclipse.compare");

		suppressedPagesCache.add("org.eclipse.e4.tools.emf.editor3x");
		suppressedPagesCache.add("org.eclipse.jdt.junit");
		suppressedPagesCache.add("org.eclipse.search");
		suppressedPagesCache.add("org.eclipse.equinox.security.ui");
		suppressedPagesCache.add("org.eclipse.xtext.xtext.ui");

	}

	private IPreferenceNode findNode(PreferenceManager pm, String categoryId) {
		for (Object o : pm.getElements(PreferenceManager.POST_ORDER)) {
			if (o instanceof IPreferenceNode
					&& ((IPreferenceNode) o).getId().equals(categoryId)) {
				return (IPreferenceNode) o;
			}
		}
		return null;
	}

	private String getClassURI(String definingBundleId, String spec)
			throws ClassNotFoundException {
		if (spec.startsWith("platform:")) {
			return spec;
		} // $NON-NLS-1$
		if (spec.startsWith("org.bbaw.bts.corpus.text.btsdsl.ui.BTSExecutableExtensionFactory:")) {
			spec = spec.split(":")[1];
		} // $N
		return "platform:/plugin/" + definingBundleId + '/' + spec;
	}

	private boolean isEmpty(String value) {
		return value == null || value.trim().isEmpty();
	}

	static class EmptyPreferencePage extends PreferencePage {

		public EmptyPreferencePage(String title) {
			setTitle(title);
			noDefaultAndApplyButton();
		}

		@Override
		protected Control createContents(Composite parent) {
			return new Label(parent, SWT.NONE);
		}

	}

}
