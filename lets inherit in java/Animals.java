class animal {
    void characteristics() {
        System.out.println("fun fact:animals are living things!");
    }
}

class giraffe extends animal {
    void size() {
        System.out.println(
                "Adult giraffes, the tallest land animals on Earth, generally stand between 14 and 19 feet (4.3 to 5.7 meters) tall");
    }
}

class dinosaurs extends giraffe {
    void types() {
        System.out.println("1)T-REX  .  2)Stegosaurus  .  3)velociraptors  .  4)Triceratops  .5)Ankylosaurus");

    }
}

class Animals {
    public static void main(String[] args) {
        dinosaurs d = new dinosaurs();
        d.characteristics();
        d.size();
        d.types();
    }

}
