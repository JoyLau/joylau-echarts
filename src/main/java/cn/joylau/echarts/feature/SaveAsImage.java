/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.feature;

/**
 * @author JoyLau
 */
public class SaveAsImage extends Feature {
    /**
     * 构造函数
     */
    public SaveAsImage() {
        this.show(true);
        this.title("保存为图片");
        this.type("png");
        this.lang(new String[]{"点击保存"});
    }
}
