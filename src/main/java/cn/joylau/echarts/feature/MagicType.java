/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.feature;


import cn.joylau.echarts.code.Magic;
import cn.joylau.echarts.series.Funnel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JoyLau
 */
public class MagicType extends Feature {
    private Option option;

    /**
     * 构造函数,参数:magics
     *
     * @param magics
     */
    public MagicType(Magic... magics) {
        this.show(true);
        Map title = new HashMap<String, String>();
        title.put("line", "折线图切换");
        title.put("bar", "柱形图切换");
        title.put("stack", "堆积");
        title.put("tiled", "平铺");
        this.title(title);
        if (magics == null || magics.length == 0) {
            this.type(new Object[]{Magic.bar, Magic.line, Magic.stack, Magic.tiled});
        } else {
            this.type(magics);
        }
    }

    /**
     * 设置Option
     *
     * @param option
     * @return
     */
    public Feature option(Option option) {
        this.option = option;
        return this;
    }

    /**
     * 获取Option
     *
     * @return
     */
    public Option option() {
        return this.option;
    }

    /**
     * 获取option值
     *
     * @return
     */
    public Option getOption() {
        return option;
    }

    /**
     * 设置option
     *
     * @param option
     */
    public void setOption(Option option) {
        this.option = option;
    }

    /**
     * 内部类 Option
     */
    public static class Option {
        private Funnel funnel;

        /**
         * 设置funnel值
         *
         * @param funnel
         */
        public Option funnel(Funnel funnel) {
            this.funnel = funnel;
            return this;
        }

        /**
         * 获取funnel值
         */
        public Funnel funnel() {
        return this.funnel;
    }

        /**
         * 获取funnel值
         */
	public Funnel getFunnel() {
        return funnel;
    }

        /**
         * 设置funnel值
         *
         * @param funnel
         */
        public void setFunnel(Funnel funnel) {
            this.funnel = funnel;
        }
    }
}
