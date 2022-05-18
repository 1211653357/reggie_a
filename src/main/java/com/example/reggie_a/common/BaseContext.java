package com.example.reggie_a.common;


/**
 * 基于ThreadLocal封装的工具类，用户保存和获取当前用户ID
 */
public class BaseContext {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置id
     *
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取id
     *
     * @return
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }

}
