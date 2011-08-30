/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class AOperationSet extends PSet
{
    private PBasic _left_;
    private PBinOp _binOp_;
    private PBasic _right_;

    public AOperationSet()
    {
        // Constructor
    }

    public AOperationSet(
        @SuppressWarnings("hiding") PBasic _left_,
        @SuppressWarnings("hiding") PBinOp _binOp_,
        @SuppressWarnings("hiding") PBasic _right_)
    {
        // Constructor
        setLeft(_left_);

        setBinOp(_binOp_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AOperationSet(
            cloneNode(this._left_),
            cloneNode(this._binOp_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperationSet(this);
    }

    public PBasic getLeft()
    {
        return this._left_;
    }

    public void setLeft(PBasic node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PBinOp getBinOp()
    {
        return this._binOp_;
    }

    public void setBinOp(PBinOp node)
    {
        if(this._binOp_ != null)
        {
            this._binOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._binOp_ = node;
    }

    public PBasic getRight()
    {
        return this._right_;
    }

    public void setRight(PBasic node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._binOp_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._binOp_ == child)
        {
            this._binOp_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PBasic) newChild);
            return;
        }

        if(this._binOp_ == oldChild)
        {
            setBinOp((PBinOp) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PBasic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
