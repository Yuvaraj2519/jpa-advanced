package in.yuva.jpa.advc.service;

import in.yuva.jpa.advc.entity.Book;


public interface BookService {

    Book bookByNameAndAuthor(String name, String author);
    Book bookById(int id);
}
