public class Student extends Person {
    private int number;
    private int score;
    private String major;

    public Student() {
        super();
        number = 2;
        score = 90;
        major = "RPL";
    }

    public Student (String name, int age, int number, int score, String major) {
        super(name, age);
        this.number = number;
        this.score = score;
        this.major = major;
    }

    public int getNumber (int number) {
        return this.number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public int getScore (int score) {
        return this.score;
    }

    public void setScore (int score) {
        this.score = score;
    }

    public String getMajor (String major) {
        return this.major;
    }

    public void setMajor (String major) {
        this.major = major;
    }

    public void print() {
        super.print();
        System.out.println(" Number\t: " + number);
        System.out.println(" Score\t: " + score);
        System.out.println(" Major\t: " + major);
    }
}
