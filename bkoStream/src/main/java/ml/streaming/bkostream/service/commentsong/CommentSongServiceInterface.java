package ml.streaming.bkostream.service.commentsong;

import ml.streaming.bkostream.dto.Songdto;
import ml.streaming.bkostream.model.Comment_Song;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommentSongServiceInterface {
    
    Flux<Comment_Song> deleteByUserId(Long id);

    Flux<Comment_Song> findAllBySongOrderByDateDesc(Mono<Songdto> songDtoMono);

    Flux<Comment_Song> showCommentsBySong(Mono<Songdto> songDtoMono);
}
