/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blankenship.assignment.review.domain;

/**
 * Employee class which will be used for holding the employee name and
 * the employee manager name.
 * @author Karl
 */
public class Employee {
    
    /*
    Create private variables to hold employee name and employee manager.
    */
    private String name;
    private String manager;
    
    /**
     * Default constructor.
     */
    public Employee() {
    }

    /**
     * Overload constructor.
     * @param name
     * @param manager 
     */
    public Employee(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Accessor method for getting employee name.
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Mutator method for setting employee name.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Accessor method for getting employee manager name.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Mutator method for getting employee manager name.
     * @param manager 
     */
    public void setManager(String manager) {
        this.manager = manager;
    }
         
}
