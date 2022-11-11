package ml.streaming.bkostream.service.commentsong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.dto.Songdto;
import ml.streaming.bkostream.model.Comment_Song;
import ml.streaming.bkostream.repository.CommentSongRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CommentSongService implements CommentSongServiceInterface {

    @Autowired
    private CommentSongRepository commentSongRepository;

    public Flux<Comment_Song> getAllCommentSong() {
        return commentSongRepository.findAll();
    }

    public Mono<Comment_Song> getCommentSongById(Long id) {
        return commentSongRepository.findById(id);
    }

    public void saveCommentSong(Comment_Song commentSong) {
        commentSongRepository.save(commentSong).subscribe();
    }

    public Mono<Void> deleteCommentSong(Long id) {
        return commentSongRepository.deleteById(id);
    }

    @Override
    public Flux<Comment_Song> deleteByUserId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Comment_Song> findAllBySongOrderByDateDesc(Mono<Songdto> songDtoMono) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Comment_Song> showCommentsBySong(Mono<Songdto> songDtoMono) {
        // TODO Auto-generated method stub
        return null;
    }

    


}
