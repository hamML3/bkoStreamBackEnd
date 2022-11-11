package ml.streaming.bkostream.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.User;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment_Playlistdto {
    
    @Id
    private Long id;
    
    private String content;
    private LocalDateTime date;

    private User user;

    private Playlist playlist;

}
