/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blankenship.assignment.review.employeemanagement;

import blankenship.assignment.review.domain.Employee;

import java.io.*;
import java.util.*;
        

/**
 *
 * @author Karl
 */
public class EmployeePortfolios {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("main is executing");
        // Create an EmployeePortfolios object.
        EmployeePortfolios ef = new EmployeePortfolios();
    
        // Create an employee list variable.
        List<Employee> employees = new ArrayList();
    
        // Start writing required commands....
        // employeeData.txt is stored in main project file so that it can
        // be accessed without a specific file path.
        employees = ef.loadEmployeePortfolios("employeeData.txt");
        ef.display(employees);
        ef.display(ef.sortByEmployeeName(employees));
        ef.display(ef.sortByManagerName(employees));
    }
    
    private List<Employee> loadEmployeePortfolios(String filename) 
            throws FileNotFoundException, IOException {
        
        // Create List to hold Employee objects.
        List<Employee> employeeList = new ArrayList();
        
        // Create String variable to hold input filename.
        String fileName = filename;
 
        // Create FileReader object and pass in file.
        FileReader fr = new FileReader(fileName);
        // Read file into a buffer.
        BufferedReader br = new BufferedReader(fr);
        // Create String var to hold each buffered line and burn file header.
        String line = br.readLine();
        line = br.readLine(); // Read first line of data after header.
        // Write all buffered lines into Employee Instances and write to List.
        while (line != null) {
            // Create an instance of Employee.
            Employee em = new Employee();
            // Separate out name and manager from line.
            String[] lineEM = line.split(","); // Split into employee and manager.
            em.setName(lineEM[0]);
            em.setManager(lineEM[1]);
            employeeList.add(em);
            // Read next line of file.
            line = br.readLine();
        }
       
        System.out.println(employeeList.get(0).getName()); 
        
        return employeeList;
    }
    
    private void display(List<Employee> inputList) {
        System.out.println("display"); 
        for (Employee employee : inputList) {
            System.out.println(employee.getName()+ " "+ employee.getManager());
        }
    }
    
    private List<Employee> sortByEmployeeName(List<Employee> inputEmployee) {
        Collections.sort(inputEmployee, new NameComparator());
        return inputEmployee;
    }
    
    private List<Employee> sortByManagerName(List<Employee> inputEmployee) {
        Collections.sort(inputEmployee, new ManagerComparator());
        return inputEmployee;
    }



    private class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            String name1 = e1.getName();
            String name2 = e2.getName();
            return name1.compareTo(name2);
        }
    }

    private class ManagerComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            String name1 = e1.getManager();
            String name2 = e2.getManager();
            return name1.compareTo(name2);
        }
    }
}
