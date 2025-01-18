package com.project.restaurant.servicio.impl;

import com.project.restaurant.entities.Comment;
import com.project.restaurant.repository.ICommentRepository;
import com.project.restaurant.servicio.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CommentServiceImpl implements ICommentService {

    @Autowired
    public ICommentRepository commentRepository;

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public List<Comment> listComment() {
        return commentRepository.findAll();
    }

    @Override
    public Comment editComment(int idComment) {
        return commentRepository.findById(idComment).get();
    }

    @Override
    public void deleteComment(int idComment) {
        commentRepository.delete(editComment(idComment));
    }
}
