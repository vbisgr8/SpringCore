/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC.DependencyInjection.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vinayak
 */
public class SetterInjection_Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("SetterInjection.xml");

        System.out.println(" :rnN: *************** Primitive and String Based by setter method *************** ");
        CompanyBean cb = (CompanyBean) ac.getBean("obj1");
        cb.getDetails();
        
        System.out.println("\n :rnN: *************** Address Dependent Object Based by setter method *************** ");
        cb = (CompanyBean) ac.getBean("obj2");
        cb.getDetails2();
        
        System.out.println("\n :rnN: *************** Teams List String Based by setter method *************** ");
        cb = (CompanyBean) ac.getBean("obj3");
        cb.getDetails3();
        
        System.out.println("\n :rnN: *************** Address List Dependent Object Based by setter method *************** ");
        cb = (CompanyBean) ac.getBean("obj4");
        cb.getDetails4();
        
        System.out.println("\n :rnN: *************** Teams Map String Based by setter method *************** ");
        cb = (CompanyBean) ac.getBean("obj5");
        cb.getDetails5();
        
    }

}
