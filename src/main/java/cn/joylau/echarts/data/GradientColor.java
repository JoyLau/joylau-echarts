/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.data;

/**
 * 可以是一个包含 offset 和 color 的 Object 的数组，如 [{ offset: 0.2, color: 'blue' }, { offset 0.8, color: 'cyan' }]；也可以是一个颜色字符串的数组如 ['blue', 'cyan', 'lime', 'yellow', 'red']，颜色将均匀分布
 *
 * @author JoyLau
 */
public class GradientColor {
    private Double offset;
    private Object color;

    /**
     * 构造函数,参数:offset,color
     *
     * @param offset
     * @param color
     */
    public GradientColor(Double offset, Object color) {
        this.offset = offset;
        this.color = color;
    }

    /**
     * 获取offset值
     */
    public Double offset() {
        return this.offset;
    }

    /**
     * 设置offset值
     *
     * @param offset
     */
    public GradientColor offset(Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public GradientColor color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取offset值
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * 设置offset值
     *
     * @param offset
     */
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }
}
