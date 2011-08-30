/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class TPackage extends Token
{
    public TPackage()
    {
        super.setText("Package");
    }

    public TPackage(int line, int pos)
    {
        super.setText("Package");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPackage(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPackage(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPackage text.");
    }
}
