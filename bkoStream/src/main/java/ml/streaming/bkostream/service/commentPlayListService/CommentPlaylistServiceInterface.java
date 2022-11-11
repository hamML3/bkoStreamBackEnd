package ml.streaming.bkostream.service.commentPlayListService;

import ml.streaming.bkostream.model.Comment_Playlist;
import ml.streaming.bkostream.model.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommentPlaylistServiceInterface {
    
    
    Mono<Comment_Playlist> deleteByUserId(Long id);

    Flux<Comment_Playlist> findAllByPlaylistOrderByDateDesc(Playlist playlist);

    Flux<Comment_Playlist> showCommentByPlaylist(Playlist playlist);
}
