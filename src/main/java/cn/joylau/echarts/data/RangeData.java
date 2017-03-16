/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.data;

import java.io.Serializable;

/**
 * 描述信息
 *
 * @author JoyLau
 */
public class RangeData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer end;

    private String label;
    private Object color;

    /**
     * 构造函数
     */
    public RangeData() {
    }

    /**
     * 构造函数,参数:start,end
     *
     * @param start
     * @param end
     */
    public RangeData(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    /**
     * 设置start值
     *
     * @param start
     */
    public RangeData start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 获取start值
     */
    public Integer start() {
        return this.start;
    }

    /**
     * 设置end值
     *
     * @param end
     */
    public RangeData end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * 获取end值
     */
	public Integer end() {
        return this.end;
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public RangeData label(String label) {
        this.label = label;
        return this;
    }

    /**
     * 获取label值
     */
    public String label() {
        return this.label;
    }

    /**
     * 设置color值
     *
     * @param color
     */
	public RangeData color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 获取start值
	 */
	public Integer getStart() {
        return start;
    }

    /**
     * 设置start值
     *
     * @param start
     */
	public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获取end值
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * 设置end值
     *
     * @param end
     */
	public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * 获取label值
	 */
	public String getLabel() {
        return label;
    }

    /**
     * 设置label值
     *
     * @param label
     */
	public void setLabel(String label) {
        this.label = label;
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
