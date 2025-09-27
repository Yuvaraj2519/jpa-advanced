package in.yuva.jpa.advc.serviceImpl;

import in.yuva.jpa.advc.entity.Book;
import in.yuva.jpa.advc.exception.BookNotFoundException;
import in.yuva.jpa.advc.repo.BookRepo;
import in.yuva.jpa.advc.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book bookByNameAndAuthor(String name, String author) {
        try {

            Optional<Book> optionalBook = bookRepo.findByBookNameAndAuthorName(name, author);
            if (optionalBook.isPresent())
                return optionalBook.get();
            else
                throw new BookNotFoundException("Book name : " +name+ " is not found");
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new BookNotFoundException("Book name : " +name+ " is not found");
        }
    }
}
