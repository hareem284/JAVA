class SevenWonders {
    void display() {
        System.out.println("Seven Wonders");
    }
}

class TajMahal extends SevenWonders {
    void display() {
        System.out.println("Taj Mahal - India");
    }
}

class GreatWall extends SevenWonders {
    void display() {
        System.out.println("Great Wall of China");
    }
}

class Petra extends SevenWonders {
    void display() {
        System.out.println("Petra - Jordan");
    }
}

class Colosseum extends SevenWonders {
    void display() {
        System.out.println("Colosseum - Italy");
    }
}

class ChichenItza extends SevenWonders {
    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class MachuPicchu extends SevenWonders {
    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChristRedeemer extends SevenWonders {
    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

public class Main {
    public static void main(String args[]) {
        SevenWonders w;

        w = new TajMahal();
        w.display();

        w = new GreatWall();
        w.display();

        w = new Petra();
        w.display();

        w = new Colosseum();
        w.display();

        w = new ChichenItza();
        w.display();

        w = new MachuPicchu();
        w.display();

        w = new ChristRedeemer();
        w.display();
    }
}