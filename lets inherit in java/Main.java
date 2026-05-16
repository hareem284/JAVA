class parent {
    int age;
    int ID;
    String name;

    void naming(String name) {
        System.out.println("the name is " + name);
    }
}

class child extends parent {
    void age(int age) {
        System.out.println("the age is " + age);
    }
}

class Main {
    public static void main(String[] args) {
        child c = new child();
        c.naming("Emma");
        c.age(11);
    }
}