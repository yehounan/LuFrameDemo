package com.yezi.jylframe.data;

import org.springframework.context.ApplicationContext;

/**
 * created by yezi on 2018/7/6
 */
public class AppContext {

    private static ApplicationContext context;

    static void register(ApplicationContext context) {
        AppContext.context = context;
    }


}
