import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    public void displayDigits() {
        System.out.println("Digits: " + digitList);
    }

    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        d1.displayDigits();

        Digits d2 = new Digits(0);
        d2.displayDigits();
    }
}