/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOC.DependencyInjection.example;

/**
 *
 * @author vinayak
 */
public class ParentDetails {

    private String fatherName;
    private String motherName;

    public ParentDetails(String fatherName, String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "ParentDetails {" + "fatherName=" + fatherName + ", motherName=" + motherName + '}';
    }
    
}
