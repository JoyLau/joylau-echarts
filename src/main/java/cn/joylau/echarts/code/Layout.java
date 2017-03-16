/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.code;

/**
 * 图的布局 - graph
 *
 * @author JoyLau
 */
public enum Layout {
    none,//不采用任何布局，使用节点中提供的 x， y 作为节点的位置
    circular,//采用环形布局
    force,//采用力引导布局
}
