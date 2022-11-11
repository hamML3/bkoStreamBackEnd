package ml.streaming.bkostream.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ml.streaming.bkostream.model.Category;
import ml.streaming.bkostream.service.category.CategoryService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("allCategory")
    public Flux<Category> findAllCategory(){
        return categoryService.findAll();
    }

    @GetMapping("{id}")
    public Mono<Category> findCategoryById(@PathVariable Long id){
        return categoryService.findById(id);
    }
    

}
