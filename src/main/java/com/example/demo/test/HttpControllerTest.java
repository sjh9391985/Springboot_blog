package com.example.demo.test;

import org.springframework.web.bind.annotation.*;

/**
 * class 설명:
 * packageName : com.example.test
 * fileName : HttpControllerTest
 * author : sonjaehyeon
 * date : 2022/08/22
 */
@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest : ";

    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m1 = new Member(1, "son" , "1234", "email");
        return "lombok test success";
    }

    // http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(Member m){
        System.out.println(TAG+"gettet : "+ m.getId());
        return "get 요청";
    }

    // http://localhost:8080/http/post
    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }

    // http://localhost:8080/http/put
    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    // http://localhost:8080/http/delete
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }

}
