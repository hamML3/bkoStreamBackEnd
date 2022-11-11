package ml.streaming.bkostream.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ml.streaming.bkostream.model.Singer;
import ml.streaming.bkostream.service.singer.SingerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/singer")
public class SingerController {
    @Autowired
    SingerService singerService;
   
   @GetMapping()
   public Flux<Singer> findAllSinger(){
        return singerService.getSingers();
   }
   
   
   
    @PostMapping("/addsinger")
    public void createSinger (@RequestBody Singer singer) {
        singerService.createSinger(singer);
    }

   
     
    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteSinger(@PathVariable Long id){
        return singerService.deleteSinger(id);
    }

    
}
