package com.example.demo.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.domain.Article; // Article은 남겨두세요 (BlogController에서 참조)
import com.example.demo.model.domain.Board;
import com.example.demo.model.repository.BlogRepository;
import com.example.demo.model.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 생성자 자동생성(부분)
public class BlogService {
  @Autowired // 객체 주입 자동화, 생성자 1개면 생략 가능
  // private final BlogRepository blogRepository; // 기존 Article 리포지토리 주석 처리
  private final BoardRepository blogRepository; // BoardRepository를 사용하여 Board에 접근

  // public List<Article> findAll() { // 게시판 전체 목록 조회 (기존 Article용 주석 처리)
  // return blogRepository.findAll();
  // }

  // Article save(AddArticleRequest request)를 Board save로 대체했기 때문에,
  // Article을 사용하는 기존 save 메소드를 명시적으로 복구하거나 주석 처리해야 합니다.
  // 여기서는 교안에 따라 Article 관련 메소드는 주석 처리합니다.

  // @PostMapping("/api/articles")에서 사용하는 Article.save 로직은 주석 처리합니다.
  /*
   * public Article save(AddArticleRequest request) {
   * return blogRepository.save(request.toEntity());
   * }
   * 
   * // BlogController에서 사용하는 Article.findById 로직은 주석 처리합니다.
   * public Optional<Article> findById(Long id) { // 게시판 특정 글 조회
   * // return blogRepository.findById(id);
   * return Optional.empty(); // 임시로 빈 값 반환
   * }
   * 
   * // BlogController에서 사용하는 Article.update 로직은 주석 처리합니다.
   * public void update(Long id, AddArticleRequest request) {
   * // Optional<Article> optionalArticle = blogRepository.findById(id);
   * // optionalArticle.ifPresent(article -> {
   * // article.update(request.getTitle(), request.getContent());
   * // blogRepository.save(article);
   * // });
   * }
   */

  public void delete(Long id) {
    blogRepository.deleteById(id);
  }

  // BoardController에서 Board를 리턴하는 findAll을 명시합니다.
  public List<Board> findAll() { // 게시판 전체 목록 조회
    return blogRepository.findAll();
  }

  // BoardController에서 Board를 리턴하는 findById를 명시합니다.
  public Optional<Board> findById(Long id) { // 게시판 특정 글 조회
    return blogRepository.findById(id);
  }

  // 10주차 연습문제(게시글 수정)
  public void update(Long id, AddArticleRequest request) {
    Optional<Board> optionalBoard = blogRepository.findById(id); // 단일 글 조회
    optionalBoard.ifPresent(board -> { // 값이 있으면
      board.update(request.getTitle(), request.getContent(),
          request.getUser(), request.getNewdate(),
          request.getCount(), request.getLikec()); // Board 모델의 update 메서드 사용
      blogRepository.save(board); // Board 객체에 저장
    });
  }
}