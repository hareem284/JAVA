class hillstation {
    public void location() {
        System.out.println("location");
    }

    public void famous() {
        System.out.println("the famous place is");
    }
}

class muree extends hillstation {
    public void location() {
        System.out.println("muree is in the northern region of pakistan");
    }

    public void famous() {
        System.out.println("its famous for its scenic views.");
    }
}

class skardu extends hillstation {
    public void location() {
        System.out.println("Skardu is a major city located in the Gilgit-Baltistan region of northern Pakistan");
    }

    public void famous() {
        System.out.println(
                "Gateway to High Peaks: Skardu is the base camp for mountaineers and trekkers visiting K2, Broad Peak, and Gasherbrum I-II.");
    }
}

class NaranKaghan extends hillstation {
    public void location() {
        System.out.println(
                "in the upper Kaghan Valley, within the Mansehra District of Khyber Pakhtunkhwa province, Pakistan");
    }

    public void famous() {
        System.out.println(
                "it is famous for Lalazar Plateau & Meadows: Famous for lush green pastures, pine forests, and wildflowers.");
    }
}

class Main {
    public static void main(String[] args) {
        hillstation h = new hillstation();
        hillstation m = new muree();
        hillstation s = new skardu();
        hillstation nk = new NaranKaghan();
        h.location();
        h.famous();
        m.location();
        m.famous();
        s.location();
        s.famous();
        nk.location();
        nk.famous();
    }
}