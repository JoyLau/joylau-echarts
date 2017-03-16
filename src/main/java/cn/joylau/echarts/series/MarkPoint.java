/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.series;


import cn.joylau.echarts.AbstractData;
import cn.joylau.echarts.style.ItemStyle;

/**
 * Description: MarkPoint
 *
 * @author JoyLau
 */
public class MarkPoint extends AbstractData<MarkPoint> {
    /**
     * 标注类型
     *
     */
    private Object symbol;
    /**
     * 标注大小
     *
     */
    private Object symbolSize;
    /**
     * 标注图形旋转角度
     *
     */
    private Object symbolRoate;
    /**
     * 是否启动大规模标注模式
     */
    private Boolean large;
    /**
     * 标注图形炫光特效
     *
     */
    private Effect effect;
    /**
     * 标注图形样式属性
     *
     */
    private ItemStyle itemStyle;
    /**
     * 地图特有，标注图形定位坐标
     *
     */
    private GeoCoord geoCoord;

    /**
     * 设置effect值
     *
     * @param effect
     */
    public MarkPoint effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public MarkPoint itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
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
    public MarkPoint symbol(Object symbol) {
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
    public MarkPoint symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取symbolRoate值
     */
    public Object symbolRoate() {
        return this.symbolRoate;
    }

    /**
     * 设置symbolRoate值
     *
     * @param symbolRoate
     */
    public MarkPoint symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }

    /**
     * 获取large值
     */
    public Boolean large() {
        return this.large;
    }

    /**
     * 设置large值
     *
     * @param large
     */
    public MarkPoint large(Boolean large) {
        this.large = large;
        return this;
    }

    /**
     * 标注图形炫光特效
     *
     * @see cn.joylau.echarts.series.Effect
     */
    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }

    /**
     * 标线图形样式属性
     *
     * @see cn.joylau.echarts.style.ItemStyle
     * @see cn.joylau.echarts.series.Series#itemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    /**
     * 获取geoCoord值
     */
    public GeoCoord geoCoord() {
        if (this.geoCoord == null) {
            this.geoCoord = new GeoCoord();
        }
        return this.geoCoord;
    }

    /**
     * 设置name,x,y值
     *
     * @param name
     * @param x
     * @param y
     */
    public MarkPoint geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
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
     * 获取effect值
     */
    public Effect getEffect() {
        return effect;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public void setEffect(Effect effect) {
        this.effect = effect;
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
     * 获取symbolRoate值
     */
    public Object getSymbolRoate() {
        return symbolRoate;
    }

    /**
     * 设置symbolRoate值
     *
     * @param symbolRoate
     */
    public void setSymbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
    }

    /**
     * 获取large值
     */
    public Boolean getLarge() {
        return large;
    }

    /**
     * 设置large值
     *
     * @param large
     */
    public void setLarge(Boolean large) {
        this.large = large;
    }

    /**
     * 获取geoCoord值
     */
    public GeoCoord getGeoCoord() {
        return geoCoord;
    }

    /**
     * 设置geoCoord值
     *
     * @param geoCoord
     */
    public void setGeoCoord(GeoCoord geoCoord) {
        this.geoCoord = geoCoord;
    }
}
