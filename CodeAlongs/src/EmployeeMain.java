public class EmployeeMain {
    public static void main(String[] args) {
        // Objects
        Employee e1 = new Employee(7);
        Employee e2 = new Lawyer(8);



        System.out.println(e1.getSalary());
        System.out.println(e1.getVacationDays());

        System.out.println(e2.getSalary());
        System.out.println(e2.getVacationDays());

    }
}
