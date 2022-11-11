package ml.streaming.bkostream.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Playlistdto {
    
    @Id
    private Long id;

    private String name;

    private Long views;

    private Long likes;

    private String image;

    private Date createDate;

    private User user;
}
