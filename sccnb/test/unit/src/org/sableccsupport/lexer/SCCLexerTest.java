/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sableccsupport.lexer;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.lib.lexer.test.LexerTestUtilities;

/**
 *
 * @author phucluoi
 */
public class SCCLexerTest extends TestCase {

	public SCCLexerTest(String testName) {
		super(testName);
	}

	protected void setUp() throws java.lang.Exception {
	}

	protected void tearDown() throws java.lang.Exception {
	}

	public void test() {
		String commentText = "/* test comment  */";
		String text = "Package abc.xyz;\nH\n";// + commentText + "def public publica publi static x";

		TokenHierarchy<?> hi = TokenHierarchy.create(text, SCCLexerTokenId.getLanguage());
		TokenSequence<?> ts = hi.tokenSequence();

		int offset = 0;
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.PACKAGE, "Package", offset);

		offset += "Package".length();
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.BLANK, " ", offset);

		offset++;
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.PKG_ID, "abc", offset);

		offset += "abc".length();
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.DOT, ".", offset);


		offset++;
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.PKG_ID, "xyz", offset);

		offset+= "xyz".length();
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.SEMICOLON, ";", offset);
		
		offset+= ";".length();
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.BLANK, "\n", offset);


		offset+= "\n".length();
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts, SCCLexerTokenId.ERROR, "H\n", offset);
		/*
		assertTrue(ts.moveNext());
		offset = commentTextStartOffset;
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.BLOCK_COMMENT, commentText, offset);
		offset += commentText.length();
		int commentIndex = ts.index();

		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.IDENTIFIER, "def", offset);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.WHITESPACE, " ", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.PUBLIC, "public", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.WHITESPACE, " ", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.IDENTIFIER, "publica", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.WHITESPACE, " ", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.IDENTIFIER, "publi", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.WHITESPACE, " ", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.STATIC, "static", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.WHITESPACE, " ", -1);
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.IDENTIFIER, "x", -1);
		assertFalse(ts.moveNext());
		 */
		// Go back to block comment
/*
		assertEquals(0, ts.moveIndex(commentIndex));
		assertTrue(ts.moveNext());
		LexerTestUtilities.assertTokenEquals(ts,SCCLexerTokenId.BLOCK_COMMENT, commentText, commentTextStartOffset);

		// Test embedded token sequence
		TokenSequence<?> embedded = ts.embedded();
		assertNotNull("Null embedded sequence", embedded);
		assertTrue(embedded.moveNext());
		offset = commentTextStartOffset + 2; // skip "/*"
		LexerTestUtilities.assertTokenEquals(embedded,TestPlainTokenId.WHITESPACE, " ", offset);
		offset += 1;
		assertTrue(embedded.moveNext());
		LexerTestUtilities.assertTokenEquals(embedded,TestPlainTokenId.WORD, "test", offset);
		offset += 4;
		assertTrue(embedded.moveNext());
		LexerTestUtilities.assertTokenEquals(embedded,TestPlainTokenId.WHITESPACE, " ", offset);
		offset += 1;
		assertTrue(embedded.moveNext());
		LexerTestUtilities.assertTokenEquals(embedded,TestPlainTokenId.WORD, "comment", offset);
		offset += 7;
		assertTrue(embedded.moveNext());
		LexerTestUtilities.assertTokenEquals(embedded,TestPlainTokenId.WHITESPACE, "  ", offset);
		assertFalse(embedded.moveNext());
		 */
	}
}
