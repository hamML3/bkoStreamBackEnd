package ml.streaming.bkostream.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Comment_Song {
    @Id
    private Long id;

    private String content;

    private LocalDateTime date;
    
    private User user;

    private Song song; 
}
