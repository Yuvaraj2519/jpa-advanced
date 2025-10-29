package in.yuva.jpa.advc.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JacksonXmlRootElement( localName = "book")
public class BookDTO {
    private String id;
    private String name;
    private String author;
    private double price;
    private boolean published;
    private LocalDate publishDate;
}
