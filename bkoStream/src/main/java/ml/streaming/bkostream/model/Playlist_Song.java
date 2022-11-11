package ml.streaming.bkostream.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Playlist_Song {
    @Id
    private Long id;

    private Playlist playlist;

    private Song song;
}
