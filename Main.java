import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("'''''''''''''''''''''''''''''''''''");
        System.out.println("*Student Information System*");
        System.out.println("'''''''''''''''''''''''''''''''''''");
        System.out.print("Student Name: ");
        String name =in.nextLine();
        double age;
        while(true) {
            System.out.print("Student Age: ");
            age = in.nextDouble();
            if (age >= 18) {
                break;
            }
            System.out.println("Invalid age! try again");
        }
        System.out.print("Student Major: ");
        in.nextLine();
        String major = in.nextLine();
        double gpa;
        while(true) {
            System.out.print("Student GPA: ");
            gpa = in.nextDouble();
            if (gpa > 4 || gpa < 0) {
                System.out.println("Invalid GPA! try again");
            }else {
                break;
            }
        }
        System.out.print("Completed Credit Hours: ");
        double hours = in.nextDouble();
        System.out.print("Are You a Student?(yes/no): ");
        in.nextLine();
        String answer = in.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("AlL Done!");
        }else if(answer.equalsIgnoreCase("no")) {
            System.out.println("All Done!");
        }else {
            System.out.println("Please try again");
        }
        System.out.println("'''''''''''''''''''''''''''''''''''");
        System.out.println("*Student Profile*");
        System.out.println();
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Major: "+major);
        System.out.println("Student GPA: "+gpa);
        System.out.println("Completed Credit Hours: "+hours);
        System.out.println("IS the User a Student?: "+answer);
        System.out.println("Academic Grade: ");
        if(gpa >=3.5 && gpa<=4.0) {
            System.out.println("Excellent");
        }else if(gpa >=3.0 && gpa<=3.49) {
            System.out.println("Very Good");
        }else if(gpa >=2.5 && gpa<=2.99) {
            System.out.println("Good");
        }else if(gpa >=2.0 && gpa<=2.49) {
            System.out.println("Pass");
        }else{
            System.out.println("Warning");
        }
        System.out.println();
        System.out.println("Perfectly Done!");
        System.out.println("'''''''''''''''''''''''''''''''''''");
    }
}