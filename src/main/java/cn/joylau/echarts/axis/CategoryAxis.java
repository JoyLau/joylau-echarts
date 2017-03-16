/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.axis;


import cn.joylau.echarts.code.AxisType;

/**
 * 类目轴
 *
 * @author JoyLau
 */
public class CategoryAxis extends Axis<CategoryAxis> {

    /**
     * 构造函数
     */
    public CategoryAxis() {
        this.type(AxisType.category);
    }

}
