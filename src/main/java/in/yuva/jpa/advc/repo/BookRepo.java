package in.yuva.jpa.advc.repo;

import in.yuva.jpa.advc.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

    Optional<Book> findByBookNameAndAuthorName(String bookName, String author);
}
