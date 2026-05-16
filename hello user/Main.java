import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string");
        String text = scn.nextLine();
        System.out.println("the input text is= " + text);
        System.out.println("please enter an integer(number)");
        int num = scn.nextInt();
        System.out.println("the number you typed is " + num);
        System.out.println("enter a float");
        float userfloat = scn.nextFloat();
        System.out.println("the float number you typed was " + userfloat);
        scn.close();
    }

}
