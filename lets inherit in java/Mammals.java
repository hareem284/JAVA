class mammals {
    void m() {
        System.out.println("mammals are warm blooded animals");
    }
}

class humans extends mammals {
    void feature() {
        System.out.println("humans are known as mammals as they are also warm blooded creatures.");

    }
}

class animals extends mammals {
    void am() {
        System.out.println("animals are also mammals");
    }
}

class Mammals {
    public static void main(String[] args) {
        humans h = new humans();
        h.m();
        h.feature();
        animals a = new animals();
        a.am();
    }
}