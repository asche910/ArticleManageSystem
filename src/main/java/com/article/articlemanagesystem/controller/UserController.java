package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.common.ResultCode;
import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.service.UserService;
import com.article.articlemanagesystem.util.IdUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public CommonResult currentUser(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if (user != null){
            return CommonResult.success(user);
        }
        return CommonResult.failed(ResultCode.VALIDATE_FAILED);
    }

    @GetMapping("/add")
    public CommonResult addUser(@Validated User user) {
        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed("Add failed!");
        }
        return CommonResult.success("Add success!");
    }

    @GetMapping(value = "/queryByUsername", produces = "application/json;charset=utf-8")
    public CommonResult query(@RequestParam String username){
        User user = userService.findByUserName(username);
        if (user != null){
             return CommonResult.success(user);
        }else{
            return CommonResult.success(null);
        }
    }

    @GetMapping(value = "/queryLikeUsername", produces = "application/json;charset=utf-8")
    public CommonResult queryLikeName(@RequestParam String username){
        List<User> userList = userService.findLikeUserName(username);
        if (userList != null){
            return CommonResult.success(userList);
        }else{
            return CommonResult.success(null);
        }
    }

    @GetMapping("/all")
    public PageInfo getAllUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1")int pageNum,
                               @RequestParam(name = "pageSize", defaultValue = "10")int pageSize){
        List<User> userList = userService.getAllUser(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    @PostMapping("/update")
    public CommonResult updateUser(User user){
        if (user.getUser() == null || user.getUser().equals("")){
            user.setUser(IdUtils.genUserename());
            userService.addUser(user);
        }else {
            userService.updateUser(user);
        }
        return CommonResult.success(user);
    }

    @GetMapping(value = "/delete", produces = "application/json;charset=utf-8")
    public CommonResult deleteById(@RequestParam String username){
        userService.deleteByUsername(username);
        return CommonResult.success("delete success!", null);
    }

    @GetMapping("/test")
    public PageInfo tset(){
        PageHelper.startPage(1, 5);
        List<User> userList = userService.getAllUser(1, 10);

        PageInfo<User> pageInfo = new PageInfo<>(userList);
        System.out.println(pageInfo.toString());
//        return CommonResult.success("test message!");
        return pageInfo;
    }

}
