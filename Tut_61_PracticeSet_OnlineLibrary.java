package com.company;
// You have to impelement a Library using Java class "Library"
// Methods: addBook, showAvailableBook, returnBook, issueBook.
class Library{
    String[] books;
    int no_of_books;
    Library(){
this.books=new String[100];// Size of book name.
        this.no_of_books=0;
    }
    void addBook(String book){
this.books[no_of_books++]=book;
//no_of_books++;
        System.out.println(book + " has been added.");

    }
    void showAvailableBook(){
        System.out.println("Available books are:");
        for (String book:this.books) {
            if (book==null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }
    void issueBook(String book){
        for (String b :this.books) {
            for (int i=0; i<this.books.length; i++)
            if (this.books[i].equals(book)){
                System.out.println(b+ " has been issued! ");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book is not available.");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Tut_61_PracticeSet_OnlineLibrary {
    public static void main(String[] args) {
  Library CentralLibrary=new Library();
  CentralLibrary.addBook("Java");
  CentralLibrary.addBook(" C++ ");
  CentralLibrary.addBook("Phyton");
  CentralLibrary.addBook("Think And grow");
  CentralLibrary.showAvailableBook();
  CentralLibrary.issueBook("Java");
  CentralLibrary.showAvailableBook();
  CentralLibrary.returnBook("Java");
  CentralLibrary.showAvailableBook();
    }
}
