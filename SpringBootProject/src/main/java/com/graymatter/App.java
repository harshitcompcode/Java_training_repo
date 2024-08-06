//package com.graymatter;
//
//import java.sql.Connection;
//
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//
//import com.graymatter.beans.*;
//
///**
// * Hello world!
// *
// */
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//        
////    	HelloBean hb = new HelloBean();
////    	hb.sayHello();
////    	
//    	
////    ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
////    
////    HelloBean hb = (HelloBean) context.getBean("hello");
////    hb.sayHello();
////    
////    HelloBean hb1 = (HelloBean) context.getBean("hello");
////    hb1.sayHello();
//    	
//    ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
////    
////    Customer c = (Customer) context.getBean("cust");
////    System.out.println(c);
////    System.out.println(c.hashCode());
////    Customer c1 = (Customer) context.getBean("cust");
////    System.out.println(c1);
////    System.out.println(c1.hashCode());
////    Customer c2 = (Customer) context.getBean("cust");
////    System.out.println(c2);
////    System.out.println(c2.hashCode());
//    
//    
//    
//    
//    
////    
////    Customer c1 = (Customer) context.getBean("cust1");
////    System.out.println(c1);
//    
////    Order ord = (Order) context.getBean("ord");
////    System.out.println(ord);
//    
//    
//    XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("db-bean.xml"));
//    DataSource ds = (DataSource)factory.getBean("dbCon");
//    try {
//    	Connection con = ds.getConnection();
//    	System.out.println("connection establised");
//    }
//    catch{
//    	
//    }
//    
//    
//    
//    
//    	
//    }
//}

package com.graymatter;

import java.sql.Connection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.graymatter.beans.DataSource;

public class App {
    public static void main(String[] args) {

        // Using ApplicationContext to load the customer bean
        ApplicationContext context = new ClassPathXmlApplicationContext("customer-bean.xml");
        
        // Using XmlBeanFactory to load the DataSource bean
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("db-bean.xml"));
        DataSource ds = (DataSource) beanFactory.getBean("dbCon");
        
        try {
            Connection con = ds.getConnection();
            System.out.println("Connection established");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection could not be established");
        }
    }
}

