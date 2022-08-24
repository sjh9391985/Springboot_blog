package com.example.blog.test;

import com.example.blog.model.RoleType;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * class 설명:
 * packageName : com.example.blog.test
 * fileName : DummyControllerTest
 * author : sonjaehyeon
 * date : 2022/08/24
 */
@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/dummy/join")
    public String join(User user){

        user.setRole(RoleType.USER);

        userRepository.save(user);
        return "회원가입 완료";
    }

}
