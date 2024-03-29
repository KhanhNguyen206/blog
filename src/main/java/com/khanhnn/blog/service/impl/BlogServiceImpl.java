package com.khanhnn.blog.service.impl;

import com.khanhnn.blog.model.Blog;
import com.khanhnn.blog.repository.BlogRepository;
import com.khanhnn.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
