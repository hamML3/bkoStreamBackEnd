package ml.streaming.bkostream.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.streaming.bkostream.model.Category;
import ml.streaming.bkostream.repository.CategoryRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CategoryService{
    @Autowired
    CategoryRepository categoryRepository;


    public Flux<Category> findAll() {
        return categoryRepository.findAll();

    }

    public Mono<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public void createCategory(Category category) {
        categoryRepository.save(category).subscribe();    
    }

    public Mono<Void> delete(Long id) {
        return categoryRepository.deleteById(id);
    }
}
