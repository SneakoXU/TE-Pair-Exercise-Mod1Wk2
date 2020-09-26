package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {


    /**
     * The main entry point in the application
     * @param args
     */
	
	public static List<Department> departments = new ArrayList<Department>();
	public static List<Employee> employees = new ArrayList<Employee>();
	public static Map<String, Project> projects = new HashMap<String, Project>();
    public static void main(String[] args) {

        // create some departments
        
    	createDepartments();
        
        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    	Department marketing = new Department(001, "Marketing");
    	departments.add(marketing);
    	Department sales = new Department(002, "Sales");
    	departments.add(sales);
    	Department engineering = new Department(003, "Engineering");
    	departments.add(engineering);
    }

    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
    	for(Department department : departments) {
    		System.out.println(department.getName());
    	}
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    	Employee dJohnson = new Employee();
    	dJohnson.setEmployeeId(001);
    	dJohnson.setFirstName("Dean");
    	dJohnson.setLastName("Johnson");
    	dJohnson.setEmail("djohnson@teams.com");
    	dJohnson.setSalary(60000D);
    	dJohnson.setDepartment(departments.get(2));		  	
    	dJohnson.setHireDate("08/21/2020");
    	Employee aSmith = new Employee(002, "Angie", "Smith", "asmith@teams.com", 60000, departments.get(0), "08/21/2020");
    	Employee mThompson = new Employee(003, "Margaret", "Thompson", "mthompson@teams.com", 60000, departments.get(0), "08/21/2020");
    			
    	employees.add(dJohnson);
    	employees.add(aSmith);
    	employees.add(mThompson);
    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for(Employee employee : employees) {
        	//for(Department department : departments) {
        	System.out.println(employee.getFullName() + " " + employee.getSalary() + " " + employee.getDepartment().getName());
        
       // }
    }
    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
    	Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
    	projects.put(employees.get(0).getFullName(), teams);
    	projects.put(employees.get(1).getFullName(), teams);
    	
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
    	Project teams = new Project("Marketing Landing Page", "Lead Capture Landing Page for marketing", "10/10/2020", "10/17/2020");
    	projects.put(employees.get(2).getFullName(), teams);
    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        int counter = 0;
        for(Map.Entry<String, Project> team : projects.entrySet()) {
        	counter++;
        }
        System.out.println("TEams" + " " + counter);
    }

}
