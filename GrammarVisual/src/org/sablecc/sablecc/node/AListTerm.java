/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AListTerm extends PTerm
{
    private TLBkt _lBkt_;
    private final LinkedList<PListTerm> _listTerms_ = new LinkedList<PListTerm>();

    public AListTerm()
    {
        // Constructor
    }

    public AListTerm(
        @SuppressWarnings("hiding") TLBkt _lBkt_,
        @SuppressWarnings("hiding") List<PListTerm> _listTerms_)
    {
        // Constructor
        setLBkt(_lBkt_);

        setListTerms(_listTerms_);

    }

    @Override
    public Object clone()
    {
        return new AListTerm(
            cloneNode(this._lBkt_),
            cloneList(this._listTerms_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListTerm(this);
    }

    public TLBkt getLBkt()
    {
        return this._lBkt_;
    }

    public void setLBkt(TLBkt node)
    {
        if(this._lBkt_ != null)
        {
            this._lBkt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBkt_ = node;
    }

    public LinkedList<PListTerm> getListTerms()
    {
        return this._listTerms_;
    }

    public void setListTerms(List<PListTerm> list)
    {
        this._listTerms_.clear();
        this._listTerms_.addAll(list);
        for(PListTerm e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBkt_)
            + toString(this._listTerms_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBkt_ == child)
        {
            this._lBkt_ = null;
            return;
        }

        if(this._listTerms_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBkt_ == oldChild)
        {
            setLBkt((TLBkt) newChild);
            return;
        }

        for(ListIterator<PListTerm> i = this._listTerms_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PListTerm) newChild);
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
