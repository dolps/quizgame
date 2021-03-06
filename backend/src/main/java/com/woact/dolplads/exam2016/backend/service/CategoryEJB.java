package com.woact.dolplads.exam2016.backend.service;

import com.woact.dolplads.exam2016.backend.entity.Category;
import com.woact.dolplads.exam2016.backend.repository.CategoryRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by dolplads on 29/11/2016.
 */
@Stateless
public class CategoryEJB {
    @Inject
    private CategoryRepository categoryRepository;

    public CategoryEJB() {
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void removeCategory(Category category) {
        categoryRepository.remove(category);
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void update(Category category) {
        categoryRepository.update(category);
    }
}
