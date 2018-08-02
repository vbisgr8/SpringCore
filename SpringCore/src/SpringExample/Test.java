/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author vinayak
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Test Start");
        // Use of BeanFactory
        Resource res = new ClassPathResource("application.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Student st = (Student)factory.getBean("sbean");
        st.getData();
        // Use of ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        st = (Student)ac.getBean("sbean");
        st.getData();
        System.out.println("Test End");
        // Note:- The AppicationContext interface is built on top of BeanFactory interface. So it is better to use ApplicationContext then BeanFactory. ApplicationContext add some extra funcitonality e.g.: Simple integration with Spring's AOP, application layer specifix context (like WebApplicationContext) for web application.
    }
}
