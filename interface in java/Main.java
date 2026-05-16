interface myinterface {
    // the compiler while compiling them will always see them as abstract methods.
    public void method1();

    public void method2();
}

// creating the Main class
class Main implements myinterface {
    public void method1() {
        System.out.println("this is method 1");
    }

    public void method2() {
        System.out.println("this is method 2");
    }

    public static void main(String[] args) {
        myinterface i1 = new Main();
        i1.method1();
        i1.method2();
    }

}