package ml.streaming.bkostream.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Playlist {
 
    @Id
    private Long id;

    private String name;

    private Long views;

    private Long likes;

    private String image;

    private Date createDate;

    private User user;
}
