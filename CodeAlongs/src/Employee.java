public class Employee {
    // Fields
    private int years;

    // Constructor
    public Employee(int initialYears){
        years = initialYears;
    }

    // Accessors
    public int getHours(){
        return 40;
    }

    public double getSalary(){
        return 40000.0;
    }

    public int getVacationDays(){
        return 10 + 2 * years;
    }

    public int getYears(){
        return years;
    }

    public String getVacationForm(){
        return "yellow";
    }

}
