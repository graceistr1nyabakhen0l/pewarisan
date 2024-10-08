import java.util.Scanner;
public class TesterInput {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println(" 1. Student\n2. Teacher ");
        System.out.println();
        int pilihan = g.nextInt();
        g.nextLine();
        switch (pilihan) {
            case 1:
                System.out.println(" Student ");
                System.out.println(" Name: ");
                String name = g.nextLine();
                System.out.println(" Major: ");
                String major = g.nextLine();
                System.out.println(" Age ");
                int age = g.nextInt();
                System.out.println(" Number ");
                int number = g.nextInt();
                System.out.println(" Score ");
                int score = g.nextInt();
                Student s = new Student (name, major, age, number, score);
                s.print();
                break;
            case 2:
                System.out.println(" Part Time ");
                System.out.println(" Name: ");
                name = g.nextLine();
                System.out.println(" Subject ");
                int subject = g.nextInt();
                System.out.println(" Age: ");
                age = g.nextInt();
                System.err.println(" Hours Worked: ");
                int hoursWorked = g.nextInt();
                PartTime z = new PartTime(name, age, subject, hoursworked);
                z.print();
                break;
        }
    }
}
