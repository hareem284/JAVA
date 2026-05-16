class student extends person {
    private String studyarea;

    public student(String n, int a, String sa) {
        super(n, a);
        this.studyarea = sa;
    }

    public String getsa() {
        return studyarea;
    }

}
