class student {
    int id;
    String name;
    String school_name;

    student() {
        System.out.println("object created.");
    }

    student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    student(String name, int id, String school_name) {
        this.name = name;
        this.id = id;
        this.school_name = school_name;
    }

    void display_details() {
        System.out.println(
                "the id is: " + this.id + " the name is: " + this.name + "the school name is: " + this.school_name);
    }

}

class Main {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("hareem", 3461);
        student s3 = new student("hareem", 3461, "beaconhouse");
        s3.display_details();

    }

}