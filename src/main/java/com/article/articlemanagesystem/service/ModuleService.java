package com.article.articlemanagesystem.service;

import com.article.articlemanagesystem.entity.Module;

import java.util.List;

public interface ModuleService {

    List<Module> getAll();

    void addModule(Module module);

    void update(Module module);

    void deleteById(Integer id);
}
