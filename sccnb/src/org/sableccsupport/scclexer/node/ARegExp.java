/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import java.util.*;
import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class ARegExp extends PRegExp
{
    private final LinkedList<PConcat> _concats_ = new LinkedList<PConcat>();

    public ARegExp()
    {
        // Constructor
    }

    public ARegExp(
        @SuppressWarnings("hiding") List<?> _concats_)
    {
        // Constructor
        setConcats(_concats_);

    }

    @Override
    public Object clone()
    {
        return new ARegExp(
            cloneList(this._concats_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARegExp(this);
    }

    public LinkedList<PConcat> getConcats()
    {
        return this._concats_;
    }

    public void setConcats(List<?> list)
    {
        for(PConcat e : this._concats_)
        {
            e.parent(null);
        }
        this._concats_.clear();

        for(Object obj_e : list)
        {
            PConcat e = (PConcat) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._concats_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._concats_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._concats_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PConcat> i = this._concats_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PConcat) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
