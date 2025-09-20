package in.yuva.jpa.advc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name")
    private String bookName;
    @Column( name = "author_name")
    private String authorName;
    @Column( name = "price")
    private double price;
    @Column( name ="published")
    private boolean published;
    @Column( name = "published_date")
    private LocalDate publishedDate;
}
