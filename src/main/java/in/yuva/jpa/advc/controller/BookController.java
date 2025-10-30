package in.yuva.jpa.advc.controller;

import in.yuva.jpa.advc.entity.Book;
import in.yuva.jpa.advc.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/bookByNameAndAuthor")
    public ResponseEntity<Book> getBooksByNameAndAuthor (
            @RequestParam String name,
            @RequestParam String author) {

        log.info("Entering in getBooksByNameAndAuthor");
        Book book = bookService.bookByNameAndAuthor(name, author);
        log.info("Exit ing getBooksByNameAndAuthor");

        return ResponseEntity.ok(book);
    }

    @GetMapping({"/getAllBooks","/listBooks","/allBooks"})
    public ResponseEntity<List<Book>> getBooksAllBooks () {
        List<Book> books = bookService.allBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping(
            value ="/getBookById/{bookId}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<Book> getBookById (
            @PathVariable int bookId,
            @RequestParam (value = "format", required = false) String format
    ){
        log.info("Entering in getBookById");
        Book  book = bookService.bookById(bookId);
        MediaType mediaType = decideMediaType(format);
        log.info("Exit ing getBookById");
        return ResponseEntity.ok()
                .contentType(mediaType)
                .body(book);
    }

    private MediaType decideMediaType(String format){
        if (format != null && format.equalsIgnoreCase("xml")) return MediaType.APPLICATION_XML;
        return MediaType.APPLICATION_JSON;
    }
}
