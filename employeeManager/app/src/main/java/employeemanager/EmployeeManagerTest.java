import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List; 

public class EmployeeManagerTest { 

 private EmployeeManager employeeManager; 

 @BeforeEach //حتى استدعي الداله قبل كل عمليه اختبار
    public void setUp() {
    employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee("John", "Doe", "IT", 50000));
        employeeManager.addEmployee(new Employee("Jane", "Doe", "HR", 60000));
        employeeManager.addEmployee(new Employee("Bob", "Smith", "IT", 55000));
   } 
   
 @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee("Mary", "Smith", "Finance", 70000);
        employeeManager.addEmployee(newEmployee);
        Assertions.assertEquals(newEmployee, employeeManager.getAllEmployees().get(3));
    } 

 @Test
    public void testRemoveEmployee() {
        Employee employeeToRemove = employeeManager.getAllEmployees().get(1);
        Assertions.assertTrue(employeeManager.removeEmployee(employeeToRemove));
        Assertions.assertEquals(2, employeeManager.getAllEmployees().size());
 } 

 @Test
    public void testGetAllEmployees() {
      List<Employee> allEmployees = employeeManager.getAllEmployees();
         Assertions.assertAll("All employees",
                () -> Assertions.assertEquals(3, allEmployees.size()),
                () -> Assertions.assertEquals("John", allEmployees.get(0).getFirstName()),
                () -> Assertions.assertEquals("Doe", allEmployees.get(0).getLastName()),
                () -> Assertions.assertEquals("IT", allEmployees.get(0).getDepartment()),
                () -> Assertions.assertEquals(50000, allEmployees.get(0).getSalary())
    );
 } 

 @Test
    public void testGetEmployeesByDepartment() {
        List<Employee> itEmployees = employeeManager.getEmployeesByDepartment("IT");
        Assertions.assertAll("IT employees",
                () -> Assertions.assertEquals(2, itEmployees.size()),
                () -> Assertions.assertEquals("John", itEmployees.get(0).getFirstName()),
                () -> Assertions.assertEquals("Doe", itEmployees.get(0).getLastName()),
                () -> Assertions.assertEquals("IT", itEmployees.get(0).getDepartment()),
                () -> Assertions.assertEquals(50000, itEmployees.get(0).getSalary())
   );
 } 

 @Test
    public void testGetAverageSalary() {
       double averageSalary = employeeManager.getAverageSalary();
        Assertions.assertEquals(55000, averageSalary);
 }
}