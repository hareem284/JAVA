class mamals {
    void m() {
        System.out.println("mammals are warm blooded animals");
    }
}

class humans extends mamals {
    void feature() {
        System.out.println("humans are known as mammals as they are also warm blooded creatures.");

    }
}

class animals extends mamals {
    void am() {
        System.out.println("animals are also mammals");
    }
}

class Main1 {
    public static void main(String[] args) {
        humans h = new humans();
        h.m();
        h.feature();
        animals a = new animals();
        a.am();
    }
}