package org.antlr.v4.reference.tour;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Col {
  public static void main(String[] args) throws Exception {
    CharStream input = CharStreams.fromStream(System.in);
    RowsLexer lexer = new RowsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    int col = Integer.valueOf(args[0]);
    RowsParser parser = new RowsParser(tokens, col); // pass column number!
    parser.setBuildParseTree(false); // don't waste time bulding a tree
    parser.file(); // parse
  }
}
