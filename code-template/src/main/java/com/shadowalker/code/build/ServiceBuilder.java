package com.shadowalker.code.build;

import java.util.Map;

/****
 * @author Shadowalker
 * @Description Service构建
 * @Date 2019/6/14 19:13
 *****/
public class ServiceBuilder {


    /***
     * 构建Service
     * @param modelMap
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成Service层文件
        BuilderFactory.builder(modelMap,
                "/template/service",
                "Service.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE,
                "Service.java");
    }

}
