/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.sccparser.node;

import org.sableccsupport.sccparser.analysis.*;

@SuppressWarnings("nls")
public final class TTree extends Token
{
    public TTree()
    {
        super.setText("Tree");
    }

    public TTree(int line, int pos)
    {
        super.setText("Tree");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTree(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTree(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTree text.");
    }
}
