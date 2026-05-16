private class book {
    private String title;
    private String author;
    private int numpages;

    public book(String t, String a, int np) {
        this.title = t;
        this.author = a;
        this.numpages = np;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public int getnumpages() {
        return numpages;
    }
}