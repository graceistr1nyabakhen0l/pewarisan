public class Fulltime extends Person {
    private int anualSalary;
    private String unit;

    public Fulltime() {
        super();
        anualSalary = 3000000;
        unit = "Kutrikulum";
    }

    public Fulltime (String name, int age, int number, String subject, int anualSalary, String unit) {
        super (name, age);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    public int getAnualSalary (int anualSaslary) {
        return this.anualSalary;
    }

    public void setAnualSalary (int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit (String unit) {
        return this.unit;
    }

    public void setUnit (String unit) {
        this.unit = unit;
    }

    public void print() {
    super.print();
    System.out.println(" Anual Salary\t: " + anualSalary);
    System.out.println(" Unit\t: " + unit);
    }
}
