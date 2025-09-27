package in.yuva.jpa.advc.controller;

import in.yuva.jpa.advc.entity.Book;
import in.yuva.jpa.advc.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/bookByNameAuthor")
    public ResponseEntity<Book> getBooksByNameAndAuthor (
            @RequestParam String name,
            @RequestParam String author) {

        log.info("Entering in getBooksByNameAndAuthor");
        Book book = bookService.bookByNameAndAuthor(name, author);
        log.info("Exit ing getBooksByNameAndAuthor");

        return ResponseEntity.ok(book);
    }
}
