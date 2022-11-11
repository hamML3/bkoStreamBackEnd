package ml.streaming.bkostream.dto;

import java.util.Date;

import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment_Singerdto {

    @Id
    private Long id;

    private String content;

    private Date date;
    
    private User user;

    private Singer singer;
}
