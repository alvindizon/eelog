package com.alvindizon.eelog.utils;

import org.json.JSONObject;

public class StringUtils {

    /**
     * Get specific string value from JSON body
     * @param json Contains whole JSON body
     * @param name JSON Field name
     * @return Value mapped to {@param name}
     */
    // TODO: check for complex json responses (nested structures)
    public static String getJsonValueFromName(String json, String name) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.getString(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
