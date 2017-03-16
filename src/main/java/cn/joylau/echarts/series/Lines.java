/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.series;


import cn.joylau.echarts.code.SeriesType;

/**
 * 线图
 * 用于带有起点和终点信息的线数据的绘制，主要用于地图上的航线，路线的可视化
 *
 * @author JoyLau
 */
public class Lines extends Series<Lines> {

    private Effect effect;

    /**
     * 构造函数
     */
    public Lines() {
        this.type(SeriesType.lines);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Lines(String name) {
        super(name);
        this.type(SeriesType.lines);
    }

    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }

    public Lines effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }
}
