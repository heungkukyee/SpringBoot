package com.example.demo.controller;

// import com.example.demo.model.domain.Article;
// import com.example.demo.model.service.AddArticleRequest;
// import com.example.demo.model.service.BlogService;
import lombok.RequiredArgsConstructor;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // @Controller+@ResponseBody
public class BlogRestController {
    // private final BlogService blogService; // 서비스 객체 주입

    // @PostMapping("/api/articles") // post 요청
    // public ResponseEntity<Article> addArticle(@ModelAttribute AddArticleRequest request) { // 아직 없음(에러)
    //     Article saveArticle = blogService.save(request); // 게시글 저장
    //     return ResponseEntity.status(HttpStatus.CREATED) // 상태코드 및 게시글 정보 반환
    //             .body(saveArticle);
    // }
}
