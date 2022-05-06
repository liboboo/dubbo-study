package com.lyb.service.startup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : lyb
 * @date : 2022/5/6 9:26
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("dubbo 服务端已启动...");
        System.in.read();//按任意建退出
    }
}
