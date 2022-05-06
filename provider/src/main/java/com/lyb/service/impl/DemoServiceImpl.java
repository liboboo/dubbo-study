package com.lyb.service.impl;

import com.lyb.api.service.DemoService;

/**
 * @author : lyb
 * @date : 2022/5/6 9:22
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
