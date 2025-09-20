package in.yuva.jpa.advc.service;

import in.yuva.jpa.advc.entity.Book;
import org.springframework.stereotype.Service;


public interface BookService {

    Book bookByNameAndAuthor(String name, String author);
}
