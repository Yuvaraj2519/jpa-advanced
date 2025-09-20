package in.yuva.jpa.advc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@Table( name = "book_details")
public class Book {

    @Id
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
