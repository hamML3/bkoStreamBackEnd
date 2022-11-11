package ml.streaming.bkostream.service.commentsong;

import ml.streaming.bkostream.model.Comment_Song;
import ml.streaming.bkostream.model.Song;
import reactor.core.publisher.Flux;

public interface CommentSongServiceInterface {
    
    Flux<Comment_Song> deleteByUserId(Long id);

    Flux<Comment_Song> findAllBySongOrderByDateDesc(Song song);

    Flux<Comment_Song> showCommentsBySong(Song song);
}
