package com.shadowalker.code.build;

import java.util.Map;

/****
 * @author Shadowalker
 * @Description ServiceImpl构建
 * @Date 2019/6/14 19:13
 *****/
public class ServiceImplBuilder {

    /***
     * ServiceImpl构建
     * @param modelMap
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/service/impl",
                "ServiceImpl.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE_IMPL,
                "ServiceImpl.java");
    }

}
