package com.example.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * class 설명:
 * packageName : com.example.blog.model
 * fileName : User
 * author : sonjaehyeon
 * date : 2022/08/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // User class가 springboot 실행 시 자동으로 MySQL에 Table 생성을 해줌.
// @DynamicInsert : Insert 경우 null인 field 를 제외하고 insert 작업을 진행함.
public class User {

    @Id // pk를 의미함.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // numbering이 해당 프로젝트에서 연결된 DB의 넘버링 전략을 따라감.
    private int id; // auto_increment

    @Column(nullable = false, length = 30) // null == false , 30자 이상 불가능
    private String username; // 유저 id

    @Column(nullable = false, length = 100) // pw는 해쉬로 암호화예정
    private String password; // 유저 pw

    @Column(nullable = false, length = 50)
    private String email;

    // @ColumnDefault("'user'") // column default 사용시 ' ' 를 통해 문자임을 알려줌.
    @Enumerated(EnumType.STRING)
    private RoleType role; // admin, user

    @CreationTimestamp // 시간이 자동 입력
    private Timestamp createDate;

    @CreationTimestamp // 시간이 자동 입력
    private Timestamp updateDate; // 회원정보 수정시 사용

}
