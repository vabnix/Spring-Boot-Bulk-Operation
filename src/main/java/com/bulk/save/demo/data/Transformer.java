package com.bulk.save.demo.data;

import org.json.JSONObject;

public class Transformer {

    public static JSONObject tranform(User user){
        return new JSONObject(user);
    }
}
