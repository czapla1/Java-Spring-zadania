package pl.reaktor.blog2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.reaktor.blog2.model.Blog;

@Repository
public interface BlogRepo extends JpaRepository<Blog, Long> {

}
