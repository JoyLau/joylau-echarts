/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.data;

import java.io.Serializable;

/**
 * 饼图
 *
 * @author JoyLau
 */
public class PieData implements Serializable {

    private static final long serialVersionUID = -2573889018261931162L;

    private Object value;
    private String name;

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public PieData(String name, Object value) {
        this.value = value;
        this.name = name;
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
    public PieData value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public PieData name(String name) {
        this.name = name;
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
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
