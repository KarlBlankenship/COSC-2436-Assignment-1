/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blankenship.assignment.review.employeemanagement;

import blankenship.assignment.review.domain.Employee;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
        

/**
 *
 * @author Karl
 */
public class EmployeePortfolios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an EmployeePortfolios object.
        EmployeePortfolios ef = new EmployeePortfolios();
        
        // Create an employee list variable.
        List<Employee> employees = new ArrayList();
    
        // Start writing required commands....
        //List = ef.loadEmployeePortfolios("text file");
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
        // Create String variable to hold each buffered line.
        String line = br.readLine();
        // Write all buffered lines into Employee Instances and write to List.
        while (line != null) {
            // Create an instance of Employee.
            Employee em = new Employee();
            // Separate out name and manager from line.
            String[] lineEM = line.split(","); // Split line into employee and manager.
            em.setName(lineEM[0]);
            em.setManager(lineEM[1]);
            employeeList.add(em);
            // Read next line of file.
            line = br.readLine();
        }
        
        return employeeList;
    }
}
