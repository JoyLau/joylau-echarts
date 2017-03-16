/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.axis;


import cn.joylau.echarts.style.LineStyle;

import java.io.Serializable;

/**
 * 坐标轴线
 *
 * @author JouLau
 */
public class AxisLine implements Serializable {

    private static final long serialVersionUID = -7486014114670118509L;

    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show;
    /**
     * 定位到垂直方向的0值坐标上
     */
    private Boolean onZero;
    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see cn.joylau.echarts.style.LineStyle
     */
    private LineStyle lineStyle;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public AxisLine show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取onZero值
     */
    public Boolean onZero() {
        return this.onZero;
    }

    /**
     * 设置onZero值
     *
     * @param onZero
     */
    public AxisLine onZero(Boolean onZero) {
        this.onZero = onZero;
        return this;
    }

    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see cn.joylau.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public AxisLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * 获取show值
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获取onZero值
     */
    public Boolean getOnZero() {
        return onZero;
    }

    /**
     * 设置onZero值
     *
     * @param onZero
     */
    public void setOnZero(Boolean onZero) {
        this.onZero = onZero;
    }
}
