package com.article.articlemanagesystem.service.impl;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.entity.Module;
import com.article.articlemanagesystem.entity.ModuleExample;
import com.article.articlemanagesystem.mapper.ModuleMapper;
import com.article.articlemanagesystem.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> getAll() {
        List<Module> modules = moduleMapper.selectByExample(new ModuleExample());
        return modules;
    }

    @Override
    public void addModule(Module module) {
        moduleMapper.insert(module);
    }

    @Override
    public void update(Module module) {
        moduleMapper.updateByPrimaryKey(module);
    }

    @Override
    public void deleteById(Integer id) {
        moduleMapper.deleteByPrimaryKey(id);
    }
}
