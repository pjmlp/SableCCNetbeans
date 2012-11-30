/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.parser;

import org.sableccsupport.scclexer.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}