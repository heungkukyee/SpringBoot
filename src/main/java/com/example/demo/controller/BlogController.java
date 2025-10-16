package com.example.demo.controller;

import com.example.demo.model.domain.Article;
import com.example.demo.model.service.AddArticleRequest;
// import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.BlogService; // 최상단 서비스 클래스 연동 추가

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller // 컨트롤러 어노테이션 명시
public class BlogController {

  // 클래스 하단 작성
  @Autowired
  BlogService blogService; // BlogController 클래스 아래 객체 생성

  // @GetMapping("/article_list")
  // public String article_list() {
  // return "article_list";
  // }

  @GetMapping("/article_list") // 게시판 링크 지정
  public String article_list(Model model) {
    List<Article> list = blogService.findAll(); // 게시판 리스트
    model.addAttribute("articles", list); // 모델에 추가
    return "article_list"; // .HTML 연결
  }

  // 5주차 연습문제(RestController -> Controller 변경, 리다이렉트 추가)
  @PostMapping("/api/articles") // post 요청
  public String addArticle(@ModelAttribute AddArticleRequest request) {
    blogService.save(request); // 게시글 저장 로직 재활용

    // 리턴 타입은 String, 리턴: return "redirect:/article_list"
    return "redirect:/article_list";
  }

  @GetMapping("/favicon.ico")
  public void favicon() {
    // 아무 작업도 하지 않음/
  }

  @GetMapping("/article_edit/{id}") // 게시판 링크 지정
  public String article_edit(Model model, @PathVariable Long id) {
    Optional<Article> list = blogService.findById(id); // 선택한 게시판 글
    if (list.isPresent()) {
      model.addAttribute("article", list.get()); // 존재하면 Article 객체를 모델에 추가
    } else {
      // 처리할 로직 추가(예: 오류 페이지로 리다이렉트, 예외 처리 등)
      return "/error_page/article_error"; // 오류 처리 페이지로 연결(이름 수정됨)
    }
    return "article_edit"; // .HTML 연결
  }

  @PutMapping("/api/article_edit/{id}")
  public String updateArticle(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
    blogService.update(id, request);
    return "redirect:/article_list"; // 글 수정 이후 .html 연결
  }

  @DeleteMapping("/api/article_delete/{id}")
  public String deleteArticle(@PathVariable Long id) {
    blogService.delete(id);
    return "redirect:/article_list";
  }
}