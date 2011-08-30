/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class AQMarkUnOp extends PUnOp
{
    private TQMark _qMark_;

    public AQMarkUnOp()
    {
        // Constructor
    }

    public AQMarkUnOp(
        @SuppressWarnings("hiding") TQMark _qMark_)
    {
        // Constructor
        setQMark(_qMark_);

    }

    @Override
    public Object clone()
    {
        return new AQMarkUnOp(
            cloneNode(this._qMark_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQMarkUnOp(this);
    }

    public TQMark getQMark()
    {
        return this._qMark_;
    }

    public void setQMark(TQMark node)
    {
        if(this._qMark_ != null)
        {
            this._qMark_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qMark_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qMark_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._qMark_ == child)
        {
            this._qMark_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._qMark_ == oldChild)
        {
            setQMark((TQMark) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
