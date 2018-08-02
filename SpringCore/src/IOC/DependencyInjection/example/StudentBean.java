/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC.DependencyInjection.example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author vinayak
 */
public class StudentBean {

    private int rollNo;
    private String name;
    private SiblingsDetails sD;
    private List<String> classDetails;
    private List<SiblingsDetails> lSD;
    private Map<String, String> classDetails2;
    private Map<SiblingsDetails, DateOfBirthDetails> lSD2;

    public StudentBean(int rollNo) {
        this.rollNo = rollNo;
    }

    public StudentBean(String name) {
        this.name = name;
    }

    public StudentBean(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public StudentBean(String name, int rollNo) {
        this.name = name + " test";
        this.rollNo = rollNo;
    }

    public StudentBean(String name, int rollNo, SiblingsDetails sD) {
        this.name = name;
        this.rollNo = rollNo;
        this.sD = sD;
    }

    public StudentBean(String name, int rollNo, SiblingsDetails sD, List<String> classDetails) {
        this.name = name;
        this.rollNo = rollNo;
        this.sD = sD;
        this.classDetails = classDetails;
    }

    public StudentBean(String name, int rollNo, SiblingsDetails sD, Map<String, String> classDetails2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sD = sD;
        this.classDetails2 = classDetails2;
    }

    public StudentBean(String name, int rollNo, SiblingsDetails sD, List<String> classDetails, List<SiblingsDetails> lSD) {
        this.name = name;
        this.rollNo = rollNo;
        this.sD = sD;
        this.classDetails = classDetails;
        this.lSD = lSD;
    }

    public StudentBean(String name, int rollNo, SiblingsDetails sD, Map<String, String> classDetails2, Map<SiblingsDetails, DateOfBirthDetails> lSD2) {
        this.rollNo = rollNo;
        this.name = name;
        this.sD = sD;
        this.classDetails2 = classDetails2;
        this.lSD2 = lSD2;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
    public void getIntroData() {
        System.out.println(" Student name " + name + " allocated rollno is " + rollNo);
    }

    public void getPersonalDetails() {
        System.out.println(" Student name " + name + " allocated rollno is " + rollNo + " and " + sD.toString());
    }

    public void getStudentDetails1() {
        System.out.print(" Student name " + name + " allocated rollno is " + rollNo + " and " + sD.toString());
        System.out.println(" and Language Details : ");
        Iterator<String> itr = classDetails.iterator();
        while (itr.hasNext()) {
            System.out.println(" --> " + itr.next());
        }
    }

    public void getStudentDetails2() {
        System.out.print(" Student name " + name + " allocated rollno is " + rollNo + " and " + sD.toString());
        System.out.println(", Language Details : ");
        Iterator<String> itr1 = classDetails.iterator();
        while (itr1.hasNext()) {
            System.out.println(" --> " + itr1.next());
        }
        System.out.println(", More Sibling Details : ");
        Iterator<SiblingsDetails> itr2 = lSD.iterator();
        while (itr2.hasNext()) {
            System.out.println(" --> " + itr2.next());
        }
    }

    public void getStudentDetails3() {
        System.out.print(" Student name " + name + " allocated rollno is " + rollNo + " and " + sD.toString());
        System.out.println(" and Top Language Details : ");
        Set<Entry<String, String>> set = classDetails2.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(" --> " + itr.next());
        }
    }

    public void getStudentDetails4() {
        System.out.print(" Student name " + name + " allocated rollno is " + rollNo + " and " + sD.toString());
        System.out.println(" and Top Language Details : ");
        Set<Entry<String, String>> set = classDetails2.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(" --> " + itr.next());
        }
        System.out.println(", More Sibling Details : ");
        Set<Entry<SiblingsDetails, DateOfBirthDetails>> set2 = lSD2.entrySet();
        Iterator<Entry<SiblingsDetails, DateOfBirthDetails>> itr2 = set2.iterator();
        while (itr2.hasNext()) {
            Entry<SiblingsDetails, DateOfBirthDetails> entry = itr2.next();
            SiblingsDetails siblingDetails = entry.getKey();
            DateOfBirthDetails dOBDetails = entry.getValue();
            System.out.print(" Name - "+siblingDetails+", DOB - "+dOBDetails+" \n"); // It will print to String values
        }
    }
}
