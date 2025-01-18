package com.project.restaurant.servicio;

import com.project.restaurant.entities.Comment;
import java.util.List;

public interface ICommentService {

    public void saveComment(Comment comment);

    public List<Comment> listComment();

    public void deleteComment(int idComment);

    public Comment editComment(int idComment);
}