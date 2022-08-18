import java.util.HashMap;
import java.util.Map;

class EmployeeBook {
     Map<String,Employee> employees;

     public EmployeeBook() {

          this.employees = new HashMap<>();
     }

     public void createEmployee(String name, int department, int salary) {
          Employee employee = new Employee(name, department, salary);
          boolean coincidence = false;
          for (Employee employees : employees.values()) {
               if (name.equals(employees.getName())) {
                    coincidence = true;
                    System.out.println("такой сотрудник уже есть");
                    break;
               }
          }
          if (!coincidence) {
               employees.put(employee.getName(), employee);
               System.out.println("added");
          }
     }

     public void printAllEmployees() {
          System.out.println(employees);
     }

     public void sumAllSalary() {
          int sumSalary = 0;
          for (Employee employees : employees.values()) {
               sumSalary += employees.getSalary();
          }
          System.out.println("Sum all salary: " + sumSalary);
     }

     public void maxSalary() {
          int maxSalary = 0;
          for (Employee employees : employees.values()) {
               if (employees.getSalary() > maxSalary) {
                    maxSalary = employees.getSalary();
               }
          }
          System.out.println("Max salary: " + maxSalary);
     }

     public void minSalary() {
          int minSalary = 10000000;
          for (Employee employees : employees.values()) {
               if (employees.getSalary() < minSalary) {
                    minSalary = employees.getSalary();
               }
          }
          System.out.println("Min salary: " + minSalary);
     }

     public void averageSalary() {
          double sumSalary = 0;
          double averageSalary;
          for (Employee employees : employees.values()) {
               sumSalary += employees.getSalary();
          }
          averageSalary = sumSalary / employees.size();
          System.out.println("Average salary: " + averageSalary);
     }

     public void delEmployee(String name) {
          employees.remove(name);
          System.out.println("deleted");
     }

     public void getNamesOfDepartments() {
          for (int i = 0; i < 5; i++) {
               System.out.println("Employees of department " + (i + 1) + ": ");
               for (Employee employees : employees.values()) {
                    if (employees.getDepartment() == i + 1) {
                         System.out.println(employees);
                    }
               }
          }
     }


}
