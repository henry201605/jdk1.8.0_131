/*
 * Copyright (c) 1996, 2003, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.util;

/**
 * <p>
 * The root class from which all event state objects shall be derived.
 * <p>
 * All Events are constructed with a reference to the object, the "source",
 * that is logically deemed to be the object upon which the Event in question
 * initially occurred upon.
 *
 * @since JDK1.1
 */
//事件对象
public class EventObject implements java.io.Serializable {

    private static final long serialVersionUID = 5516075349620653480L;

    /**
     * The object on which the Event initially occurred.
     * 事件源
     */
    protected transient Object  source;

    /**
     * Constructs a prototypical Event.
     *
     * @param    source  事件源  The object on which the Event initially occurred.
     * @exception  IllegalArgumentException  if source is null.
     * 构造器初始化
     */
    public EventObject(Object source) {
        if (source == null)
            throw new IllegalArgumentException("null source");
        //事件源
        this.source = source;
    }

    /**
     * The object on which the Event initially occurred.
     *事件到达时，获取Source
     * @return   The object on which the Event initially occurred.
     */
    public Object getSource() {
        return source;
    }

    /**
     * Returns a String representation of this EventObject.
     *返回当前的事件对象
     * @return  A a String representation of this EventObject.
     */
    public String toString() {
        return getClass().getName() + "[source=" + source + "]";
    }
}
