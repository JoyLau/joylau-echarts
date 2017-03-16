/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts;

import java.util.HashMap;
import java.util.Map;

/**
 * 缩放漫游组件，仅对地图有效
 *
 * @author JoyLau
 */
public class RoamController extends Basic<RoamController> implements Component {
    private String fillerColor;
    private String handleColor;
    private Integer step;
    private Map<String, Boolean> mapTypeControl;

    /**
     * 获取fillerColor值
     */
    public String fillerColor() {
        return this.fillerColor;
    }

    /**
     * 设置fillerColor值
     *
     * @param fillerColor
     */
    public RoamController fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    /**
     * 获取handleColor值
     */
    public String handleColor() {
        return this.handleColor;
    }

    /**
     * 设置handleColor值
     *
     * @param handleColor
     */
    public RoamController handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    /**
     * 获取step值
     */
    public Integer step() {
        return this.step;
    }

    /**
     * 设置step值
     *
     * @param step
     */
    public RoamController step(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * 获取mapTypeControl值
     */
    public Map<String, Boolean> mapTypeControl() {
        return this.mapTypeControl;
    }

    /**
     * 设置mapTypeControl值
     *
     * @param key   地名
     * @param value true|false
     */
    public RoamController mapTypeControl(String key, Boolean value) {
        if (this.mapTypeControl == null) {
            this.mapTypeControl = new HashMap<String, Boolean>();
        }
        this.mapTypeControl.put(key, value);
        return this;
    }

    /**
     * 获取fillerColor值
     */
    public String getFillerColor() {
        return fillerColor;
    }

    /**
     * 设置fillerColor值
     *
     * @param fillerColor
     */
    public void setFillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
    }

    /**
     * 获取handleColor值
     */
    public String getHandleColor() {
        return handleColor;
    }

    /**
     * 设置handleColor值
     *
     * @param handleColor
     */
    public void setHandleColor(String handleColor) {
        this.handleColor = handleColor;
    }

    /**
     * 获取step值
     */
    public Integer getStep() {
        return step;
    }

    /**
     * 设置step值
     *
     * @param step
     */
    public void setStep(Integer step) {
        this.step = step;
    }

    /**
     * 获取mapTypeControl值
     */
    public Map<String, Boolean> getMapTypeControl() {
        return mapTypeControl;
    }

    /**
     * 设置mapTypeControl值
     *
     * @param mapTypeControl
     */
    public void setMapTypeControl(Map<String, Boolean> mapTypeControl) {
        this.mapTypeControl = mapTypeControl;
    }
}
