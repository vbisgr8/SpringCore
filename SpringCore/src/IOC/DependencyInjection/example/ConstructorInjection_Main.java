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
public class ConstructorInjection_Main {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("constructorInjection.xml");

        // now we are passing only the rollNo value in .xml file. We will get the defailt value of name (as per getData() method impimentation)
        System.out.println(" :rN: *************** Passing rollNo only *************** ");
        StudentBean sb = (StudentBean) ac.getBean("rN");
        sb.getIntroData();
        // now we are passing only the name value in .xml file we will get the defailt value of rollNo (as per getData() method impimentation)
        System.out.println("\n :n: *************** Passing name only *************** ");
        sb = (StudentBean) ac.getBean("n");
        sb.getIntroData();
        // now we are passing name and rollNo value in .xml file as we have 2 constructor in StudentBean file (difference in passing the parameter) based on that it will take that matching constructor
        System.out.println("\n :rnN: *************** Passing rollNo and name (Based upon constructor it will call (If we don't have declare any type in .xml file)) *************** ");
        sb = (StudentBean) ac.getBean("rnN");
        sb.getIntroData();
        // now we are passing name and rollNo value in .xml file as we have 2 constructor in StudentBean file (difference in passing the parameter) based on that it will take that matching constructor
        System.out.println("\n :nRn: *************** Passing name and rollNo (Based upon constructor it will call (If we don't have declare any type in .xml file)) *************** ");
        sb = (StudentBean) ac.getBean("nRn");
        sb.getIntroData();
        // now we are passing name, RollNo and PersonalDetails (Dependent Object) here we have to pass value of dependet object id in .xml file.
        System.out.println("\n :nRnSd: *************** Passing name, rollNo and SiblingsDetails <Dependent Object> *************** ");
        sb = (StudentBean) ac.getBean("nRnSd");
        sb.getPersonalDetails();
        
        //  ********** Using List **********
        // now we are passing name, RollNo, PersonalDetails (Dependent Object) and SiblingDetails (List Object) here we have pass values of list in .xml file.
        System.out.println("\n :nRnSdLd: *************** Passing name, rollNo, SiblingsDetails and SiblingDetails <(String Based)List of String> *************** ");
        sb = (StudentBean) ac.getBean("nRnSdLd");
        sb.getStudentDetails1();
        // now we are passing name, RollNo, PersonalDetails (Dependent Object), SiblingDetails (List Object) and SiblingDetails ((Non String)List of PersonalDetails<Dependent Object>) here we have pass values of list in .xml file.
        System.out.println("\n :nRnSdlSD: *************** Passing name, rollNo, SiblingsDetails, SiblingDetails <(String Based)List of String> and SiblingDetails <(Non String)List of PersonalDetails<Dependent Object>> *************** ");
        sb = (StudentBean) ac.getBean("nRnSdlSD");
        sb.getStudentDetails2();
        
        //  ********** Using Map **********
        // now we are passing name, RollNo, PersonalDetails (Dependent Object) and SiblingDetails (Map Object) here we have pass values of list in .xml file.
        System.out.println("\n :nRnSdLd2: *************** Passing name, rollNo, SiblingsDetails and SiblingDetails <(String Based)Map of String,String> *************** ");
        sb = (StudentBean) ac.getBean("nRnSdLd2");
        sb.getStudentDetails3();
        // now we are passing name, RollNo, PersonalDetails (Dependent Object), SiblingDetails (Map Object) and SiblingDetails (Map Object <Dependent Object>) here we have pass values of list in .xml file.
        System.out.println("\n :nRnSdlSD2: *************** Passing name, rollNo, SiblingsDetails, SiblingDetails <(String Based)Map of String,String> and SiblingDetails <(Non String) <Dependent Object>> *************** ");
        sb = (StudentBean) ac.getBean("nRnSdlSD2");
        sb.getStudentDetails4();
    }
}
