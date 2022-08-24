package com.example.blog.test;

import com.example.blog.model.RoleType;
import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.function.Supplier;

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

    // {id} 주소로 파라미터를 전달 받을 수 있음
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){ // 이름을 그대로 적어야 매핑이 됨.

//        User user = userRepository.findById(id).orElseGet(new Supplier<User>() { // 만약 DB에 없는 부분을 실행할 경우 빈 객체를 user에 넣어줌.
//            @Override
//            public User get() {
//                return new User();
//            }
//        });

        // 선호방법
//        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
//            @Override
//            public IllegalArgumentException get() {
//                return new IllegalArgumentException("ID : " + id + "에 해당하는 유저는 없습니다." );
//            }
//        });

        // 람다식 변경
        User user = userRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("ID : " + id + "에 해당하는 유저는 없습니다." );
        });

        // 요청 = 웹 브라우저
        // user 객체 = 자바오브젝트
        return user;
    }
}
