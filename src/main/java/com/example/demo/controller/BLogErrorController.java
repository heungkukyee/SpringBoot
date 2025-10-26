// 6주차 연습문제 (문자열 에외처리 추가)
package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class BLogErrorController {
  
  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  // 문자열 접속 시 MethodArgumentTypeMismatchException 예외 발생. @ExceptionHandler로 StringError 메서드 실행

  public String StringError() {
    return "error_page/article_error_string";
  }
}
