class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        int sum = a + b;
        int diff = a - b;
        int multiply = a * b;
        int divide = a / b;
        System.out.println("*******method1**********");
        System.out.println("ADDIION OF A+B =. " + sum);
        System.out.println("A-B=" + diff);
        System.out.println("a*b=" + multiply);
        System.out.println("a/b=" + divide);

        System.out.println("*******method2**********");
        System.out.println("ADDIION OF A+B =. " + (a + b));
        System.out.println("SUBTRACTION OF A-B =. " + (a - b));
        System.out.println("MULTIPLY OF A*B =. " + (a * b));
        System.out.println("DIVIDE OF A/B =. " + (a / b));

        System.out.println("*********method3***********");
        System.out.println("a+b=" + sum + ". a-b=" + diff + ".  a*b=" + multiply + ".  a-b=" + divide);

        System.out.println("*****INCREMENT **********");
        System.out.println(". INCREMENTING A. " + (++a));
        System.out.println(". INCREMENTING A. " + (a++));

        System.out.println("********dicrement*********");
        System.out.println("dicrementing A. " + (a--));
    }
}