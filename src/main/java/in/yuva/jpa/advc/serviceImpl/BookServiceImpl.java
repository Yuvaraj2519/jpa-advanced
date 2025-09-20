package in.yuva.jpa.advc.serviceImpl;

import in.yuva.jpa.advc.entity.Book;
import in.yuva.jpa.advc.repo.BookRepo;
import in.yuva.jpa.advc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book bookByNameAndAuthor(String name, String author) {
        return bookRepo.findByBookNameAndAuthorName(name, author)
                .orElse(null);
    }
}
