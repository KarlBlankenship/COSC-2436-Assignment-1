/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blankenship.assignment.review.employeemanagement;

import blankenship.assignment.review.domain.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
        

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
        // employeeData.txt is stored in main project file.
        employees = ef.loadEmployeePortfolios("employeeData.txt");
        //ef.display(employees);
        //ef.display(ef.sortByEmployeeName(List));
        //ef.display(ef.sortByManagerName(List));
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
       
        System.out.println(employeeList.get(0).getName()); //// not working!!
        
        return employeeList;
    }
    
    /*
    private void display(List<Employee> inputList) {
        System.out.println("display"); /////// Not working!!!
        for (Employee employee : inputList) {
            System.out.println(employee.getName()+ " "+ employee.getManager());
        }
    }
    */
}
