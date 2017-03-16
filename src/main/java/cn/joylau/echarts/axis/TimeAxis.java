/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.axis;


import cn.joylau.echarts.code.AxisType;

/**
 * 时间型坐标轴用法同数值型，只是目标处理和格式化显示时会自动转变为时间，并且随着时间跨度的不同自动切换需要显示的时间粒度
 *
 * @author JoyLau
 */
public class TimeAxis extends ValueAxis {
    /**
     * 构造函数
     */
    public TimeAxis() {
        this.type(AxisType.time);
    }
}
