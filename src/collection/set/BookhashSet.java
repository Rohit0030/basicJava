package collection.set;

import model.Book;

import java.util.HashSet;

public class BookhashSet {

    public HashSet<Book> createBookHashSet() {
        HashSet<Book> hashSetList = new HashSet<>();
        Book book1 = new Book(101, "Never have i ever", "rohit", 500);
        Book book2 = new Book(102, "Never have i ever", "rohit", 500);
        Book book3 = new Book(103, "Never have i ever", "rohit", 500);
        Book book4 = new Book(104, "Never have i ever", "rohit", 500);
        hashSetList.add(book1);
        hashSetList.add(book2);
        hashSetList.add(book3);
        hashSetList.add(book4);

        return hashSetList;

    }

    public static void main(String[] args) {
        BookhashSet obj =new BookhashSet();
        HashSet<Book> books= obj.createBookHashSet();
        for (Book var: books){
            System.out.println(var.getName());

        }
    }

}

// there is an error so dont read this..... first resolve the error


