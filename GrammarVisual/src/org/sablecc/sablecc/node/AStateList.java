/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import java.util.*;
import org.sablecc.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class AStateList extends PStateList
{
    private TId _id_;
    private PTransition _transition_;
    private final LinkedList<PStateListTail> _stateLists_ = new LinkedList<PStateListTail>();

    public AStateList()
    {
        // Constructor
    }

    public AStateList(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PTransition _transition_,
        @SuppressWarnings("hiding") List<PStateListTail> _stateLists_)
    {
        // Constructor
        setId(_id_);

        setTransition(_transition_);

        setStateLists(_stateLists_);

    }

    @Override
    public Object clone()
    {
        return new AStateList(
            cloneNode(this._id_),
            cloneNode(this._transition_),
            cloneList(this._stateLists_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStateList(this);
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

    public PTransition getTransition()
    {
        return this._transition_;
    }

    public void setTransition(PTransition node)
    {
        if(this._transition_ != null)
        {
            this._transition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transition_ = node;
    }

    public LinkedList<PStateListTail> getStateLists()
    {
        return this._stateLists_;
    }

    public void setStateLists(List<PStateListTail> list)
    {
        this._stateLists_.clear();
        this._stateLists_.addAll(list);
        for(PStateListTail e : list)
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
            + toString(this._id_)
            + toString(this._transition_)
            + toString(this._stateLists_);
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

        if(this._transition_ == child)
        {
            this._transition_ = null;
            return;
        }

        if(this._stateLists_.remove(child))
        {
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

        if(this._transition_ == oldChild)
        {
            setTransition((PTransition) newChild);
            return;
        }

        for(ListIterator<PStateListTail> i = this._stateLists_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStateListTail) newChild);
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
