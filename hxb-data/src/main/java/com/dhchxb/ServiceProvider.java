package com.dhchxb;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 2:37 PM 2018/12/25
 * @Modified By:
 */
public class ServiceProvider {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:/spring-config.xml"});
        System.out.println("dubbo service is ready to start!!!");
        context.start();
        System.out.println("dubbo service is started!!!");
        System.in.read();
    }
}
