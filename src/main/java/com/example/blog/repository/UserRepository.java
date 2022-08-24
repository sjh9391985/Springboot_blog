package com.example.blog.repository;

import com.example.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * class 설명:
 * packageName : com.example.blog.repository
 * fileName : UserRepository
 * author : sonjaehyeon
 * date : 2022/08/24
 */

// 자동으로 bean 등록이 됨. @Repository 생략이 가능함.
public interface UserRepository extends JpaRepository <User, Integer> {
}
