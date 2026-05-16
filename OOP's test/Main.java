//Consider the following class: public class Book { private String title; private String author;
//  private int numPages; public Book(String t, String a, int np) { title = t; author = a;
//  numPages = np; } public String getTitle() { return title; } public String getAuthor()
//  { return author; } public int getNumPages() { return numPages; } }

// Write a constructor for a subclass of Person called Student that takes three parameters:
//  a name, an age, and a major. The Student class 
// should have an additional method called getMajor() that returns the student's major.

public class Main {
    public static void main(String[] args) {
        student s1 = new student("Hareem", 11, "science");
        book b1 = new book("lurking in the shadows", "Hareem", 1000);
        // calling the functions
        System.out.println("students name is: " + s1.getname());
        System.out.println("student age is: " + s1.getage());
        System.out.println("student study area is : " + s1.getsa());
        // geting book info
        System.out.println("the amazing book's name is : " + b1.gettitle());
        System.out.println("the amazing author is : " + b1.getauthor());
        System.out.println("the total number of pages are : " + b1.getnumpages());
    }
}