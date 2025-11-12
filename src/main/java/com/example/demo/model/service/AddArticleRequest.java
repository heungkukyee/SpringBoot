package com.example.demo.model.service;

import lombok.*; // 어노테이션 자동 생성
// import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.Board;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성

// public class AddArticleRequest {
// private String title;
// private String content;

// public Article toEntity() { // Article 객체 생성
// return Article.builder()
// .title(title)
// .content(content)
// .build();

public class AddArticleRequest {
  private String title;
  private String content;
  private String user;
  private String newdate;
  private String count;
  private String likec;

  // Board 객체 생성을 위한 toEntity() (현재는 사용하지 않지만, 향후 추가/저장 로직에 필요)
  public Board toEntity() { // Board 객체 생성
    return Board.builder()
        .title(title)
        .content(content)
        .user(user)
        .newdate(newdate)
        .count(count)
        .likec(likec)
        .build();
  }
}
