/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class AHelperDef extends PHelperDef
{
    private TId _id_;
    private PRegExp _regExp_;

    public AHelperDef()
    {
        // Constructor
    }

    public AHelperDef(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PRegExp _regExp_)
    {
        // Constructor
        setId(_id_);

        setRegExp(_regExp_);

    }

    @Override
    public Object clone()
    {
        return new AHelperDef(
            cloneNode(this._id_),
            cloneNode(this._regExp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHelperDef(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PRegExp getRegExp()
    {
        return this._regExp_;
    }

    public void setRegExp(PRegExp node)
    {
        if(this._regExp_ != null)
        {
            this._regExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._regExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._regExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._regExp_ == child)
        {
            this._regExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._regExp_ == oldChild)
        {
            setRegExp((PRegExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
