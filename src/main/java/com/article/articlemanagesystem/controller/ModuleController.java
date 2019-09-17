package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.entity.Module;
import com.article.articlemanagesystem.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/all")
    public CommonResult query(){
        List<Module> modules = moduleService.getAll();
        return CommonResult.success(modules);
    }

    @PostMapping("/add")
    public CommonResult addModule(Module module){
        moduleService.addModule(module);
        return CommonResult.success(null);
    }

    @GetMapping("/update")
    public CommonResult update(Module module){
        moduleService.update(module);
        return CommonResult.success(null);
    }


    @GetMapping("/delete")
    public CommonResult deleteById(Integer id){
        moduleService.deleteById(id);
        return CommonResult.success(null);
    }
}
