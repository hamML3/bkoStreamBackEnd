package ml.streaming.bkostream.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Category;
import ml.streaming.bkostream.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Songdto {
    
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
}
