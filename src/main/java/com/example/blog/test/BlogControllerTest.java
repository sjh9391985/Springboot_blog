package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * class 설명:
 * packageName : com.example.test
 * fileName : BlogControllerTest
 * author : sonjaehyeon
 * date : 2022/08/22
 */

@Controller
public class BlogControllerTest {

    @GetMapping("/test/hello")
    public String Hello(){
        return "Hello Spring";
    }

}
