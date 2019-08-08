package com.qiao;

import com.qiao.service.ConsumerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        ConsumerService consumerService = context.getBean(ConsumerService.class);
        System.out.println("consumerService " + consumerService);
        consumerService.listAllStats();
        System.in.read(); // 按任意键退出
    }
}
