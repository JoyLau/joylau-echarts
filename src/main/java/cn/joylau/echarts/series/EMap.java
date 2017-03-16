/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.series;

/**
 * 和Map完全相同，只是为了避免和java.util.Map重名
 *
 * @author JoyLau
 */
public class EMap extends Map {
    public EMap() {
    }

    public EMap(String name) {
        super(name);
    }
}
