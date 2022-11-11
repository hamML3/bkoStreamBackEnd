package ml.streaming.bkostream.service.commentSingerService.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Comment_Singer;
import ml.streaming.bkostream.repository.CommentSingerRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class CommentSingerService {

    @Autowired
    CommentSingerRepository commentSingerRepository;


    
    public Flux<Comment_Singer> getAllCommentSinger() {
        return commentSingerRepository.findAll();
    }

    public Mono<Comment_Singer> findById(Long id) {
        return commentSingerRepository.findById(id);
    }
    public void createCommentSinger(Comment_Singer commentSinger) {
        commentSingerRepository.save(commentSinger).subscribe();
    }

    public Mono<Void> deleteSinger(Long id) {
        return commentSingerRepository.deleteById(id);
    }
}
