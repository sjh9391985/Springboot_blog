package com.example.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * class 설명:
 * packageName : com.example.demo.test
 * fileName : TempControllerTest
 * author : sonjaehyeon
 * date : 2022/08/22
 */
@Controller
public class TempControllerTest {

    @GetMapping("/temp/home")
    public String tempHome(){

        // 기본 return 명은 src/main/resources/static 이므로 앞에 / 를 붙여줘야함.
        return "/home.html";
    }

    @GetMapping("/temp/jsp")
    public String tempJsp(){

        // 기본 return 명은 src/main/resources/static 이므로 앞에 / 를 붙여줘야함.
        return "/test";
    }
}
