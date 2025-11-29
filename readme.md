# 💻 자바웹 프로그래밍(2) - Spring Boot 게시판 제작

**깃허브 링크**: https://github.com/heungkukyee/SpringBoot

Windows와 맥OS에서 모두 실습합니다.

---

## 📅 주차별 학습 내용 및 구현 상태 요약

| 주차 | 학습 내용 | 구현 기능 | 연습문제 완료 상태 |
| :---: | :--- | :--- | :---: |
| **2주차** | Spring Boot 개발 환경 설정 | URL 맵핑 및 Controller를 활용한 기본 페이지 연결 | ✅ |
| **3주차** | 개인 포트폴리오 설정 | 포트폴리오 레이아웃 및 상세 페이지 수정 | ✅ |
| **4주차** | 데이터베이스 연동 | 프로필 수정 및 사용자 데이터베이스 연동/출력 | ✅ |
| **5주차** | 블로그 게시판 조회 및 글 쓰기 | 게시글 목록 조회 · POST를 @RestController에서 @Controller로 수정 | ✅ |
| **6주차** | 추석 | |
| **7주차** | 블로그 게시판 수정 및 삭제 | 게시글 수정 및 삭제, 문자열 예외 처리 로직 추가 | ✅ |
| **8주차** | 온라인 강의 | |
| **9주차** | 중간고사 | |
| **10주차** | 블로그 게시판(Board) 조회 설정 | Board 게시판 엔티티 전환 및 게시글 수정 구현 | ✅ |
| **11주차** | 게시판 검색 및 페이징 | 게시판 검색/페이징 · 게시글 삭제 기능 구현 | ✅ |
| **12주차** | 회원가입 및 로그인 | Spring Security를 활용한 회원가입 · 로그인/로그아웃 구현 | ✅ |
| **13주차** | 로그아웃 및 보안 | 세션(HttpSession)을 활용해 로그인 유지 · 작성자 연동 구현 | ✅ |
| **14주차** | | |
| **15주차** | 기말고사 | |

## 📷 연습문제 구현 결과

| 주차 | 구현 항목 | 결과 화면 |
| :---: | :--- | :--- |
| **2주차** | URL 맵핑과 컨트롤러 추가 | <img width="206" height="149" alt="Image" src="https://github.com/user-attachments/assets/14b23fc0-bba8-49fe-8777-483f5f498055" /> <img width="210" height="296" alt="Image" src="https://github.com/user-attachments/assets/158ddf99-11c2-4818-a2a7-b9eca9cced4a" /> |
| **3주차** | 상세 페이지 수정(되돌아가기 기능) | <img width="554" height="312" alt="Image" src="https://github.com/user-attachments/assets/1f6397cc-bdf2-4f51-837e-362a2b7b6177" /> |
| **4주차** | 사용자 추가 및 수정 | <img width="180" height="293" alt="Image" src="https://github.com/user-attachments/assets/90460bb3-94fc-4f3b-93ee-bac2ea43bae0" /> <img width="155" height="211" alt="Image" src="https://github.com/user-attachments/assets/5fb139e0-94a5-437e-875a-a81e91a3a104" /> |
| **5주차** | 페이지 리다이렉트 | <img width="522" height="145" alt="Image" src="https://github.com/user-attachments/assets/7b35bb34-6e39-4237-a265-9cc5053b64e6" /> |
| **7주차** | 게시판 문자열 예외처리 | <img width="746" height="188" alt="Image" src="https://github.com/user-attachments/assets/4157ba7f-52b6-473d-8976-7930227288e3" /> |
| **10주차** | 게시글 수정 | <img width="567" height="234" alt="Image" src="https://github.com/user-attachments/assets/be16bbee-7297-4f7f-adcb-f9e7ec93174e" /> <img width="602" height="186" alt="Image" src="https://github.com/user-attachments/assets/1c8f1cb7-15ef-4bd9-803f-b87aa1bda62a" /> <img width="1151" height="379" alt="Image" src="https://github.com/user-attachments/assets/705768b9-8290-4e57-8d15-ffb3e26d2c83" />|
| **11주차** | 게시판 페이지 글 번호 | <img width="347" height="43" alt="Image" src="https://github.com/user-attachments/assets/daf09e83-d217-49be-93a6-a9e792193c57" /> <img width="434" height="278" alt="Image" src="https://github.com/user-attachments/assets/f17e0a2c-be4c-4188-8258-81ee766fe746" /> <img width="351" height="393" alt="Image" src="https://github.com/user-attachments/assets/7c8df4ee-89db-4b49-a441-0362e09f440d" /> <img width="344" height="389" alt="Image" src="https://github.com/user-attachments/assets/ca212d7f-8ec5-4d6c-8b7b-0e4b6f3cf8b6" /> |
| **12주차** | 입력값 필터링 | <img width="847" height="370" alt="Image" src="https://github.com/user-attachments/assets/f1c106c4-8626-4b42-aad4-6d0b1a3943f6" /> <img width="219" height="38" alt="Image" src="https://github.com/user-attachments/assets/4329aa7e-8179-4a08-985a-fa9222e5d19a" /> <img width="446" height="46" alt="Image" src="https://github.com/user-attachments/assets/8740850b-3445-4b1b-9605-ca7b1b98deed" /> <img width="427" height="76" alt="Image" src="https://github.com/user-attachments/assets/92bd83e0-2fda-4a42-9b01-214bfab26516" /> |
| **13주차** | 로그인한 사용자 작성자 지정 · 작성자만 수정/삭제 | <img width="671" height="202" alt="Image" src="https://github.com/user-attachments/assets/77edf355-291f-41ed-81fc-e0150ce8221d" /> <img width="597" height="256" alt="Image" src="https://github.com/user-attachments/assets/a5c93519-0a7a-4036-8ef3-f247e8f16866" /> <img width="316" height="45" alt="Image" src="https://github.com/user-attachments/assets/bfa6a90d-6a2d-4639-ba5c-cb982884c4db" /> <img width="655" height="95" alt="Image" src="https://github.com/user-attachments/assets/ee4dddc5-480b-4e80-956b-5b72e03453ef" /> <img width="576" height="334" alt="Image" src="https://github.com/user-attachments/assets/0bb14c48-5eb3-450c-981b-debb5a083a87" /> <img width="647" height="277" alt="Image" src="https://github.com/user-attachments/assets/2b9a5a2b-dadd-4573-8daa-82597d15e52d" />|
| **14주차** | |
