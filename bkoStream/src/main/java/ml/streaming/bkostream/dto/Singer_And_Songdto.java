package ml.streaming.bkostream.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.model.Song;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Singer_And_Songdto {
    
    @Id
    private Long id;

    private Song song;

    private Singer singer;

}
