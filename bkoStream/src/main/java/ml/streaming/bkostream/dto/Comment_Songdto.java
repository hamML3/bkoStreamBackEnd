package ml.streaming.bkostream.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Song;
import ml.streaming.bkostream.model.User;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment_Songdto {

    @Id
    private Long id;

    private String content;

    private LocalDateTime date;
    
    private User user;

    private Song song; 
}
