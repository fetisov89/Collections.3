
public class Main {
    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();
        book.createEmployee("Фетисов Илья", 4, 100000);
        book.createEmployee("Фетисов Андрей", 3, 150000);
        book.printAllEmployees();
        book.sumAllSalary();
        book.averageSalary();
        book.maxSalary();
        book.minSalary();
        book.getNamesOfDepartments();
        book.delEmployee("Фетисов Андрей");
        book.printAllEmployees();

    }
}
