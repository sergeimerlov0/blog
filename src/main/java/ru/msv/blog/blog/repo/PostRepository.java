package ru.msv.blog.blog.repo;


import org.springframework.data.repository.CrudRepository;
import ru.msv.blog.blog.model.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
