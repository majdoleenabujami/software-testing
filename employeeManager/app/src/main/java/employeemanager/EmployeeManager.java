import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

private List<Employee> employeeList = new ArrayList<>();

public void addEmployee(Employee employee) {
   employeeList.add(employee);
}

public boolean removeEmployee(Employee employee) {
  return employeeList.remove(employee);
}

public List<Employee> getAllEmployees() {
  return new ArrayList<>(employeeList);
}

public List<Employee> getEmployeesByDepartment(String department) {
  List<Employee> employeesInDepartment = new ArrayList<>();
    for (Employee employee : employeeList) {
      if (employee.getDepartment().equals(department)) {
        employeesInDepartment.add(employee);
      }
    }
  return employeesInDepartment;
}

public double getAverageSalary() {
  double totalSalary = 0;
  for (Employee employee : employeeList) {
    totalSalary += employee.getSalary();
 }
 return totalSalary / employeeList.size();
}

