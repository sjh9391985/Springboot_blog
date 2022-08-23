package com.example.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * class 설명:
 * packageName : com.example.blog.model
 * fileName : Board
 * author : sonjaehyeon
 * date : 2022/08/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // 대용량 데이터
    private String content;

    @ColumnDefault("0") // int 이기 때문에 '' 필요 없음
    private int count; // 조회수

    @CreationTimestamp
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER) // mappedBy 연관관계의 주인이 아님. FK가 아님.
    private List<Reply> reply;

    @ManyToOne(fetch = FetchType.EAGER) // 현재 table인 board가 many를 의미하고 user가 one을 의미함. => 한명의 유저는 여러개의 게시글을 작성 가능하다는 의미.
    @JoinColumn(name="userId") // 실제 TABLE 필드 생성시에는 userId 라는 이름으로 생성됨.
    private User user; // DB는 오브젝트를 저장할 수 없음. FK, 자바는 오브젝트를 저장할 수 있음.

}
