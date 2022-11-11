package ml.streaming.bkostream.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.dto.Songdto;
import reactor.core.publisher.Flux;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Song {
    @Id
    private Long id;

    private String name;
    private Long likes;
    private Long views;

    private Date createDate;
    private String songLink;
    private String songImage;
    private String songAuthor;

    private String description;

    private Boolean status;

    private User user;

    private Category category;

    public Flux<Songdto> map(Object object) {
        return null;
    }
}
