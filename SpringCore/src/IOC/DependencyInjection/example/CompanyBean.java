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
public class CompanyBean {

    private int employeeID;
    private String employeeName;
    private List<String> teams;
    private List<Address> listOfAdd;
    private Address address;
    private Map<String, String> team;
//    private Map<>

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public List<Address> getListOfAdd() {
        return listOfAdd;
    }

    public void setListOfAdd(List<Address> listOfAdd) {
        this.listOfAdd = listOfAdd;
    }

    public Map<String, String> getTeam() {
        return team;
    }

    public void setTeam(Map<String, String> team) {
        this.team = team;
    }

    public void getDetails() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + "}");
    }

    public void getDetails2() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + ", Address=" + address + " }");
    }

    public void getDetails3() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + "}");
        System.out.println(" Teams List are: ");
        Iterator<String> itr = teams.iterator();
        while (itr.hasNext()) {
            System.out.print("  " + itr.next() + "\n");
        }
    }

    public void getDetails4() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + "}");
        System.out.println(" Address List are: ");
        Iterator<Address> itr = listOfAdd.iterator();
        while (itr.hasNext()) {
            System.out.print("  " + itr.next() + "\n");
        }
    }

    public void getDetails5() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + "}");
        System.out.println(" Team Map are: ");
        Set<Entry<String, String>> set = team.entrySet();
        Iterator<Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Entry<String,String> entry=itr.next();
            System.out.print(" Team Name " + entry.getKey() + " , Team Handled "+ entry.getValue()+" \n");
        }
    }
    
    public void getDetails6() {
        System.out.println(" CompanyBean {" + "employeeID=" + employeeID + ", employeeName=" + employeeName + "}");
        System.out.println(" Address Map are: ");
//        Iterator<Address> itr = listOfAdd.iterator();
//        while (itr.hasNext()) {
//            System.out.print("  " + itr.next() + "\n");
//        }
    }
}
