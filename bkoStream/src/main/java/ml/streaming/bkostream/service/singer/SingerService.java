package ml.streaming.bkostream.service.singer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.repository.SingerRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class SingerService implements SingerServiceInterface{
    @Autowired
    SingerRepository singerRepository;

    public Flux<Singer> getSingers() {
        return singerRepository.findAll();
    }

    
    public void createSinger(Singer singer){
        singerRepository.save(singer).subscribe();
    }

    public Mono<Void> deleteSinger(Long id) {
            return singerRepository.deleteById(id);
    }

   

    @Override
    public Flux<Singer> findAllByNameContaining(String name) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Flux<Singer> findAllByNameEquals(String name) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public Mono<Singer> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
