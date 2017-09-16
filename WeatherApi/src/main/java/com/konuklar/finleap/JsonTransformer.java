package com.konuklar.finleap;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class JsonTransformer implements ResponseTransformer {
    private Gson gson = new Gson();

    public String render(Object model) {
        return gson.toJson(model);
    }
}