package ml.streaming.bkostream.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ml.streaming.bkostream.model.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category,Long> {
}
