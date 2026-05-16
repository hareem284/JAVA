abstract class shape {
    void name() {
        System.out.println("i dont know my name!");
    }

    abstract void size(){
        System.out.println("hi im size");
    };
}

class square extends shape {
    void name() {
        System.out.println("i am a square!");
    }
}

class rectangle extends shape {
    void name() {
        System.out.println("i am a rectangle!!");
    }
}

class triangle extends shape {
    void name() {
        System.out.println("hello! i am the best because i am a triangle!");
    }
}

class Main {
    public static void main(String[] args) {
        shape s = new square();
        s.name();
        s.size();
        shape r = new rectangle();
        sr.name();
        s.size();
    }

}