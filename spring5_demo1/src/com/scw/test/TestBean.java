package com.scw.test;

//import com.scw.spring5.Book;
//import com.scw.spring5.Orders;
import com.scw.spring5.Orders;
import com.scw.spring5.User;
//import com.scw.spring5.bean.Emp;
//import com.scw.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

//    @Test
//    public void testBean1() {
//        //1 加载spring配置文件
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean2.xml");
//
//        //2 获取配置创建的对象
//        UserService userService = context.getBean("userService", UserService.class);
//
//        userService.add();
//    }
//
//    @Test
//    public void testBean2() {
//        //1 加载spring配置文件
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean4.xml");
//
//        //2 获取配置创建的对象
//        Emp emp = context.getBean("emp", Emp.class);
//#*.xml
//        emp.add();
//    }

    @Test
    public void testBean2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Orders orders = context.getBean("orders",Orders.class);

        System.out.println("第四步，获取创建bean实例对象");
        System.out.println(orders);

        context.close();
    }
}
