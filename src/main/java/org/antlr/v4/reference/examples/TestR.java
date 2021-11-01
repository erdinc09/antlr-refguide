package org.antlr.v4.reference.examples;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

public class TestR {
  public static void main(String[] args) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    RLexer lexer = new RLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    RParser parser = new RParser(tokens);
    parser.setBuildParseTree(true);
    RuleContext tree = parser.prog();
    Trees.inspect(tree, parser);
    Trees.save(tree, parser, "/tmp/R.ps");
    System.out.println(tree.toStringTree(parser));
  }
}
