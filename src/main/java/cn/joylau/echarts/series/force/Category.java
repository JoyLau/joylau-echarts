/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.series.force;


import cn.joylau.echarts.style.ItemStyle;

import java.io.Serializable;

/**
 * 力导向图中节点的分类
 *
 * @author JoyLau
 */
public class Category implements Serializable {

    private static final long serialVersionUID = 5805816011061262622L;

    /**
     * 类目名称
     */
    private String name;
    /**
     * 所有该类目的节点的形状, 详见 symbolList
     *
     */
    private Object symbol;
    /**
     * 所有该类目的节点的大小
     */
    private Object symbolSize;
    /**
     * 该类目节点标记的旋转角度
     */
    private Integer symbolRotate;
    /**
     * 该类目节点标记相对于原本位置的偏移
     */
    private Object[] symbolOffset;
    /**
     * 所有该类目的节点是否能被拖拽
     */
    private Boolean draggable;
    /**
     * 详见 itemStyle
     *
     */
    private ItemStyle itemStyle;
    /**
     * 详见 itemStyle
     *
     */
    private ItemStyle label;

    /**
     * 构造函数
     */
    public Category() {
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Category(String name) {
        this.name = name;
    }

    public Integer symbolRotate() {
        return this.symbolRotate;
    }

    public Category symbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    public Object[] symbolOffset() {
        return this.symbolOffset;
    }

    public Category symbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
        return this;
    }

    public Category symbolOffset(Object o1, Object o2) {
        this.symbolOffset = new Object[]{o1, o2};
        return this;
    }

    public ItemStyle label() {
        if (this.label == null) {
            this.label = new ItemStyle();
        }
        return this.label;
    }

    public Category label(ItemStyle label) {
        this.label = label;
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
    public Category name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public Category symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public Category symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取draggable值
     */
    public Boolean draggable() {
        return this.draggable;
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public Category draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    /**
     * 详见 itemStyle
     *
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
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
     * 获取symbol值
     */
    public Object getSymbol() {
        return symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取symbolSize值
     */
    public Object getSymbolSize() {
        return symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    /**
     * 获取draggable值
     */
    public Boolean getDraggable() {
        return draggable;
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public void setDraggable(Boolean draggable) {
        this.draggable = draggable;
    }

    public Integer getSymbolRotate() {
        return symbolRotate;
    }

    public void setSymbolRotate(Integer symbolRotate) {
        this.symbolRotate = symbolRotate;
    }

    public Object[] getSymbolOffset() {
        return symbolOffset;
    }

    public void setSymbolOffset(Object[] symbolOffset) {
        this.symbolOffset = symbolOffset;
    }

    public ItemStyle getLabel() {
        return label;
    }

    public void setLabel(ItemStyle label) {
        this.label = label;
    }
}
