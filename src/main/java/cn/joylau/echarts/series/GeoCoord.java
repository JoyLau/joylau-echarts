/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.series;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * 地图特有，标线图形定位坐标
 *
 * @author JoyLau
 */
public class GeoCoord extends HashMap<String, BigDecimal[]> implements Serializable {

    private static final long serialVersionUID = 7548362611708057870L;

    /**
     * 设置key,x,y值
     *
     * @param key
     * @param x
     * @param y
     */
    public GeoCoord put(String key, String x, String y) {
        super.put(key, new BigDecimal[]{new BigDecimal(x), new BigDecimal(y)});
        return this;
    }

}
