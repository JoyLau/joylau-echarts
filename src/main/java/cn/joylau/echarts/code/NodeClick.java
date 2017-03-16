/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.code;

/**
 * 点击节点
 *
 * @author JoyLau
 */
public enum NodeClick {
    zoomToNode, //点击节点后缩放到节点。
    link,       //如果节点数据中有 link 点击节点后会进行超链接跳转。
}
