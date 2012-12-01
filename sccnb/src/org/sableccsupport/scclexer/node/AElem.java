/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sableccsupport.scclexer.node;

import org.sableccsupport.scclexer.analysis.*;

@SuppressWarnings("nls")
public final class AElem extends PElem
{
    private TId _elemName_;
    private PSpecifier _specifier_;
    private TId _id_;
    private PUnOp _unOp_;

    public AElem()
    {
        // Constructor
    }

    public AElem(
        @SuppressWarnings("hiding") TId _elemName_,
        @SuppressWarnings("hiding") PSpecifier _specifier_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PUnOp _unOp_)
    {
        // Constructor
        setElemName(_elemName_);

        setSpecifier(_specifier_);

        setId(_id_);

        setUnOp(_unOp_);

    }

    @Override
    public Object clone()
    {
        return new AElem(
            cloneNode(this._elemName_),
            cloneNode(this._specifier_),
            cloneNode(this._id_),
            cloneNode(this._unOp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElem(this);
    }

    public TId getElemName()
    {
        return this._elemName_;
    }

    public void setElemName(TId node)
    {
        if(this._elemName_ != null)
        {
            this._elemName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elemName_ = node;
    }

    public PSpecifier getSpecifier()
    {
        return this._specifier_;
    }

    public void setSpecifier(PSpecifier node)
    {
        if(this._specifier_ != null)
        {
            this._specifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._specifier_ = node;
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
            + toString(this._elemName_)
            + toString(this._specifier_)
            + toString(this._id_)
            + toString(this._unOp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elemName_ == child)
        {
            this._elemName_ = null;
            return;
        }

        if(this._specifier_ == child)
        {
            this._specifier_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
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
        if(this._elemName_ == oldChild)
        {
            setElemName((TId) newChild);
            return;
        }

        if(this._specifier_ == oldChild)
        {
            setSpecifier((PSpecifier) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
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
