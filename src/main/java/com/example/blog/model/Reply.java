package com.example.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * class 설명:
 * packageName : com.example.blog.model
 * fileName : Reply
 * author : sonjaehyeon
 * date : 2022/08/23
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne // 하나의 게시글에는 여러개의 답변이 있을 수 있음.
    @JoinColumn(name = "boardId")
    private Board board;

    @ManyToOne // 여러개의 답글을 하나의 유저가 사용가능.
    @JoinColumn(name ="userId")
    private User user;

    @CreationTimestamp
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updaetDate;

}
