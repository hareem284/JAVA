class parent {
    void hi() {
        System.out.println("helloooo this is the parent class.");
    }
}

class child extends parent {
    @Override
    void hi() {
        System.out.println("hello from the child class.");
    }
}

class Main2 {
    public static void main(String[] args) {
        // child childobject1 = new child();
        parent p = new child();
        p.hi();
    }

}