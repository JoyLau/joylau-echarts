/*******************************************************************************
 * Copyright (c) 2017 by JoyLau. All rights reserved
 ******************************************************************************/

package cn.joylau.echarts.json;

import cn.joylau.echarts.axis.Axis;
import cn.joylau.echarts.axis.CategoryAxis;
import cn.joylau.echarts.axis.TimeAxis;
import cn.joylau.echarts.axis.ValueAxis;
import cn.joylau.echarts.code.AxisType;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * @author JoyLau
 */
public class AxisDeserializer implements JsonDeserializer<Axis> {
    @Override
    /**
     * 设置json,typeOfT,context值
     *
     * @param json
     * @param typeOfT
     * @param context
     */
    public Axis deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        AxisType type = AxisType.valueOf(_type);
        Axis axis = null;
        switch (type) {
            case category:
                axis = context.deserialize(jsonObject, CategoryAxis.class);
                break;
            case value:
                axis = context.deserialize(jsonObject, ValueAxis.class);
                break;
            case time:
                axis = context.deserialize(jsonObject, TimeAxis.class);
                break;
        }
        return axis;
    }
}
