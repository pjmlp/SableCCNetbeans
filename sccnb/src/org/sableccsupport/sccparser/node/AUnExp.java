/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.sccparser.node;

import org.sableccsupport.sccparser.analysis.*;

@SuppressWarnings("nls")
public final class AUnExp extends PUnExp
{
    private PBasic _basic_;
    private PUnOp _unOp_;

    public AUnExp()
    {
        // Constructor
    }

    public AUnExp(
        @SuppressWarnings("hiding") PBasic _basic_,
        @SuppressWarnings("hiding") PUnOp _unOp_)
    {
        // Constructor
        setBasic(_basic_);

        setUnOp(_unOp_);

    }

    @Override
    public Object clone()
    {
        return new AUnExp(
            cloneNode(this._basic_),
            cloneNode(this._unOp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnExp(this);
    }

    public PBasic getBasic()
    {
        return this._basic_;
    }

    public void setBasic(PBasic node)
    {
        if(this._basic_ != null)
        {
            this._basic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basic_ = node;
    }

    public PUnOp getUnOp()
    {
        return this._unOp_;
    }

    public void setUnOp(PUnOp node)
    {
        if(this._unOp_ != null)
        {
            this._unOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unOp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._basic_)
            + toString(this._unOp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._basic_ == child)
        {
            this._basic_ = null;
            return;
        }

        if(this._unOp_ == child)
        {
            this._unOp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._basic_ == oldChild)
        {
            setBasic((PBasic) newChild);
            return;
        }

        if(this._unOp_ == oldChild)
        {
            setUnOp((PUnOp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}