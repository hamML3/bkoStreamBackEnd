package ml.streaming.bkostream.service.commentPlayListService;

import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Comment_Playlist;
import ml.streaming.bkostream.model.Playlist;
import ml.streaming.bkostream.repository.CommentPlayListRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CommentPlayListService implements CommentPlaylistServiceInterface{

    private CommentPlayListRepository commentPlayListRepository;

    public Flux<Comment_Playlist> findAll() {
        return commentPlayListRepository.findAll();
    }

    public Mono<Comment_Playlist> findById(Long id) {
        return commentPlayListRepository.findById(id);
    }

    public void createCommentPlaylist(Comment_Playlist commentPlaylist) {
        commentPlayListRepository.save(commentPlaylist).subscribe();
    }

    public Mono<Void> deleteCommentPlaylist(Long id) {
        return commentPlayListRepository.deleteById(id);
    }

    @Override
    public Mono<Comment_Playlist> deleteByUserId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Comment_Playlist> findAllByPlaylistOrderByDateDesc(Playlist playlist) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<Comment_Playlist> showCommentByPlaylist(Playlist playlist) {
        // TODO Auto-generated method stub
        return null;
    }

    

}
