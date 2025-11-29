package com.example.demo.model.service;

import lombok.*; // 어노테이션 자동 생성
import com.example.demo.model.domain.Member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성
public class AddMemberRequest {

  // 12주차 연습문제(입력값 필터링)
  @NotBlank(message = "공백은 입력할 수 없습니다.")
  @Pattern(regexp = "^[a-zA-Z가-힣]+$", message = "한글 또는 영어만 입력할 수 있습니다.")
  private String name;

  @NotBlank(message = "공백은 입력할 수 없습니다.")
  @Email(message = "유효한 이메일 형식이 아닙니다.")
  private String email;

  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "비밀번호는 8글자 이상이고 대문자와 소문자를 모두 포함해야 합니다.")
  private String password;

  @Pattern(regexp = "^(19|[2-8][0-9]|90)$", message = "나이는 19세 이상 90세 이하여야 합니다.")
  private String age;

  @NotEmpty(message = "휴대폰 번호는 입력하지 않아도 됩니다.")
  private String mobile;

  @NotEmpty(message = "주소는 입력하지 않아도 됩니다.")
  private String address;

  public Member toEntity() { // Member 생성자를 통해 객체 생성
    return Member.builder()
        .name(name)
        .email(email)
        .password(password)
        .age(age)
        .mobile(mobile)
        .address(address)
        .build();
  }
}