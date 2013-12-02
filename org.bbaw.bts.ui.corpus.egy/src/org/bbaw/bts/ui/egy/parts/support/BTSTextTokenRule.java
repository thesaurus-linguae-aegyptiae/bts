package org.bbaw.bts.ui.egy.parts.support;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordPatternRule;

public class BTSTextTokenRule extends WordPatternRule
{

	private int fCount;

	public BTSTextTokenRule(IWordDetector detector, String startSequence, String endSequence, IToken token)
	{
		super(detector, startSequence, endSequence, token);
		// TODO Auto-generated constructor stub
	}

	protected boolean endSequenceDetected(ICharacterScanner scanner)
	{
		fCount++;

		if (scanner.read() == ' ') return fCount > 1;

		scanner.unread();
		return false;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner)
	{
		return evaluate(scanner, false);
	}

	public IToken evaluate(ICharacterScanner scanner, boolean resume)
	{
		if (fColumn == UNDEFINED) return doEvaluate(scanner, resume);

		int c = scanner.read();
		scanner.unread();
		if (c != " ".toCharArray()[0]) return (fColumn == scanner.getColumn() ? doEvaluate(scanner, resume)
				: Token.UNDEFINED);
		return Token.UNDEFINED;
	}

	protected IToken doEvaluate(ICharacterScanner scanner, boolean resume)
	{

		if (resume)
		{

			if (endSequenceDetected(scanner)) return fToken;

		} else
		{

			int c = scanner.read();
			//			System.out.println((int) (" ".toCharArray()[0]));
			if (c == (int) " ".toCharArray()[0])
			{
				if (sequenceDetected(scanner, fStartSequence, fBreaksOnEOF))
				{
					if (endSequenceDetected(scanner)) return fToken;
				}
			}
		}

		scanner.unread();
		return Token.UNDEFINED;
	}

	/*
	 * @see
	 * org.eclipse.jface.text.rules.PatternRule#sequenceDetected(org.eclipse
	 * .jface.text.rules.ICharacterScanner, char[], boolean)
	 */
	protected boolean sequenceDetected(ICharacterScanner scanner, char[] sequence, boolean eofAllowed)
	{
		fCount = 0;
		for (int i = 1; i < sequence.length; i++)
		{
			int c = scanner.read();
			if (c == ICharacterScanner.EOF && eofAllowed)
			{
				return true;
			} else if (c == " ".toCharArray()[0])
			{
				// Non-matching character detected, rewind the scanner back to the start.
				// Do not unread the first character.
				scanner.unread();
				for (int j = i - 1; j > 0; j--)
					scanner.unread();
				return false;
			}
		}

		return true;
	}
}
