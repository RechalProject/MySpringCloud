package com.springcloud.user.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author XuWeiZhi
 * @Description
 * @Date 2018/10/9 23:41
 **/
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 转换为json字符串
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object fromJson(String string, Class classType) {
        try {
            return objectMapper.readValue(string,classType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object fromJson(String string, TypeReference typeReference) {
        try {
            return objectMapper.readValue(string,typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
