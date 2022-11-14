package ml.streaming.bkostream.controller;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("upload")
public class UploadController {

    private final Path basePath = Paths.get("./src/main/resources/upload/");

    @PostMapping("song/single")
    public Mono<Void> upload(@RequestPart("user-name") String name,
                             @RequestPart("fileToUpload") Mono<FilePart> filePartMono){
        System.out.println("user : " + name);
        return  filePartMono
                    .doOnNext(fp -> System.out.println("Received File : " + fp.filename()))
                    .flatMap(fp -> fp.transferTo(basePath.resolve(fp.filename())))
                    .then();
    }
    
}
