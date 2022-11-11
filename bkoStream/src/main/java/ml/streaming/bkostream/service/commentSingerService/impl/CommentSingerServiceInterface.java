package ml.streaming.bkostream.service.commentSingerService.impl;

import ml.streaming.bkostream.model.Comment_Singer;
import reactor.core.publisher.Flux;

public interface CommentSingerServiceInterface {
    
    Flux<Comment_Singer> deleteByUserId(Long id);

}
