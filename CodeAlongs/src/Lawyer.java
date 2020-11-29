public class Lawyer extends Employee{
    public Lawyer(int initialYears) {
        super(initialYears);
    }

    public int getVacationDays(){
        return 2 * super.getVacationDays();
    }

    public double getSalary() {
        return super.getSalary()+ 5000;
    }

    public void sue(){
        System.out.println("I'll see you in court!");
    }
}
