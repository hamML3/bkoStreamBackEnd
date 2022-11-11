package ml.streaming.bkostream.dto;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.model.Song;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Playlist_Songdto {
    @Id
    private Long id;

    private Playlist playlist;

    private Song song;

}
