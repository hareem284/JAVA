class student {
    private String name = "hareem";

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;

    }
}

class Main {
    public static void main(String[] args) {
        student so = new student();
        so.setname("emma");
        System.out.println(so.getname());
    }
}