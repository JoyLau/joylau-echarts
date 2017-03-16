/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.data;


import cn.joylau.echarts.style.ItemStyle;

import java.io.Serializable;

/**
 * 词云
 *
 * @author JoyLau
 */
public class WordCloudData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer value;
    private ItemStyle itemStyle;

    /**
     * 构造函数
     */
    public WordCloudData() {
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public WordCloudData(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public WordCloudData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public WordCloudData value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 获取value值
     */
	public Integer value() {
        return this.value;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public WordCloudData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取itemStyle值
     */
	public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
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

    /**
     * 获取value值
	 */
	public Integer getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
	public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取itemStyle值
     */
	public ItemStyle getItemStyle() {
        return itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
