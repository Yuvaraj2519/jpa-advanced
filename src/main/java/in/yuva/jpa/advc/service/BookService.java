package in.yuva.jpa.advc.service;

import in.yuva.jpa.advc.entity.Book;

import java.util.List;


public interface BookService {

    Book bookByNameAndAuthor(String name, String author);
    Book bookById(int id);
    List<Book> allBooks();
}
