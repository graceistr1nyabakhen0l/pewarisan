public class Teacher extends Person {
    private String subject;

public Teacher() {
    super();
    subject = "English";
}

public Teacher (String name, int age, int number, int score, String major) {
    super(name,age);
    this.subject = subject;
}

public String getSubject() {
    return this.subject;
}

public void setSubject (String subject) {
    this.subject = subject;
}

public void print() {
    super.print();
    System.out.println(" Subject\t: " + subject);
}

}






