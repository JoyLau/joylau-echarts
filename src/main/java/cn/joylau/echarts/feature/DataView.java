/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.feature;

/**
 * @author JoyLau
 */
public class DataView extends Feature {
    /**
     * 构造函数
     */
    public DataView() {
        this.show(true);
        this.title("数据视图");
        this.readOnly(false);
        this.lang(new String[]{"数据视图", "关闭", "刷新"});
    }
}
