public class PartTime extends Person {
    private int hoursWorked;

    public PartTime() {
        super();
        hoursWorked =30;
    }

    public PartTime (String name, int age, int number, String subject, int anualSalary, String unit) {
        super(name, age);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked (int hoursWorked) {
        return this.hoursWorked;
    }

    public void setHoursWorked (int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void print() {
        super.print();
        System.out.println(" HoursWorked\t: " + hoursWorked);
    }

}
