/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.option;


import cn.joylau.echarts.style.TextStyle;

/**
 * loading参数
 *
 * @author JoyLau
 */
public class EffectOption {
    private Object effect;
    private Integer progress;
    private TextStyle textStyle;

	/**
	 * 获取effect值 
	 */
	public Object effect() {
        return this.effect;
    }

	/**
	 * 设置effect值 
	 * 
	 * @param effect
	 */
	public EffectOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

	/**
	 * 获取progress值 
	 */
	public Integer progress() {
        return this.progress;
    }

	/**
	 * 设置progress值 
	 * 
	 * @param progress
	 */
	public EffectOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }

	/**
	 * 获取textStyle值 
	 */
	public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

	/**
	 * 设置textStyle值 
	 * 
	 * @param textStyle
	 */
	public EffectOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

	/**
	 * 获取effect值 
	 */
	public Object getEffect() {
        return effect;
    }

	/**
	 * 设置effect值 
	 * 
	 * @param effect
	 */
	public void setEffect(Object effect) {
        this.effect = effect;
    }

	/**
	 * 获取progress值 
	 */
	public Integer getProgress() {
        return progress;
    }

	/**
	 * 设置progress值 
	 * 
	 * @param progress
	 */
	public void setProgress(Integer progress) {
        this.progress = progress;
    }

	/**
	 * 获取textStyle值 
	 */
	public TextStyle getTextStyle() {
        return textStyle;
    }

	/**
	 * 设置textStyle值 
	 * 
	 * @param textStyle
	 */
	public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
