
/*In this activity, create a grading system using control statements.
 Follow the following rules to create the grading system - For marks
  greater than 90, print “O”. For marks greater than 80 and less than 
  equal to 90, print “A+”. For marks greater than 70 and less than equal to 80,
 print “A”. For marks greater than 60 and less than equal to 
 70, print “B”. For marks less */
import java.util.Scanner;

class Gradingsystem {
    public static void main(String[] args) {
        Scanner gss = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = gss.nextInt();
        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80) {
            System.out.println("A+");
        } else if (marks > 70) {
            System.out.println("A");
        } else if (marks > 60 && marks < 70) {
            System.out.println("B");
        } else {
            System.out.println("U");
        }
    }
}
