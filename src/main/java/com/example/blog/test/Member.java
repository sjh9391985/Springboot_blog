package com.example.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class 설명:
 * packageName : com.example.demo.test
 * fileName : Member
 * author : sonjaehyeon
 * date : 2022/08/22
 */
@Data
// @RequiredArgsConstructor final 붙은 변수의 생성자를 생성
@AllArgsConstructor // 모든 생성자 생성
@NoArgsConstructor  //빈생성자
public class Member {
    private int id;
    private String username;
    private String password;
    private String email;
}
