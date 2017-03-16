/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.data;


import cn.joylau.echarts.style.TextStyle;

import java.io.Serializable;

/**
 * 自定义样式的数据 - 适用于axis.data
 *
 * @author JoyLau
 */
public class AxisData implements Serializable {

    private static final long serialVersionUID = -6515942952591477027L;

    /**
     * 值
     */
    private Object value;
    /**
     * 特殊样式
     *
     * @see cn.joylau.echarts.style.TextStyle
     */
    private TextStyle textStyle;

    /**
     * 构造函数,参数:value
     *
     * @param value
     */
    public AxisData(Object value) {
        this.value = value;
    }

    /**
     * 构造函数,参数:value,textStyle
     *
     * @param value
     * @param textStyle
     */
    public AxisData(Object value, TextStyle textStyle) {
        this.value = value;
        this.textStyle = textStyle;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public AxisData value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public AxisData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取value值
     */
    public Object getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle getTextStyle() {
        return textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
