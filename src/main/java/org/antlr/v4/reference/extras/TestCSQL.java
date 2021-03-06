package org.antlr.v4.reference.extras; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;

public class TestCSQL {
	public static void main(String[] args) throws Exception {
		CharStream in = null;
		if ( args.length>0 ) in = CharStreams.fromFileName(args[0]);
		else in = CharStreams.fromStream(System.in);

		CharsAsTokens fauxLexer = new CharsAsTokens(in, CSQL.tokenNames);
		CommonTokenStream tokens = new CommonTokenStream(fauxLexer);
		CSQL parser = new CSQL(tokens);
		ParserRuleContext tree = parser.prog();
		System.out.println(tree.toStringTree(parser));
		Trees.inspect(tree,parser);
	}
}
