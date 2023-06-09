package com.technews.technewsjavaapi.repository;

import com.technews.technewsjavaapi.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findAllPostsByUserId(Integer id) throws Exception;
}
