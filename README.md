# GOLFLEARN
This is a golf platform for golf-beginner(a.k.a. 골린이)

## 프로젝트 개요
### 프로젝트명 : GOLF LEARN

이 서비스는 골린이들을 위한 골프서비스입니다.


<br>
[노션페이지]https://wooden-phone-bba.notion.site/TEAM-_-D-A-L-M-O-25800aa80100491db3737baefd330848 👈 link <br>

### 개발기간 <br>
22.08.16(화) ~ 22.09.18(일)<br>
34일간(기획 4일, 설계 9일, 구현 21일)<br>

### 전체일정 프로세스
1 ~ 4일차 : 기능선정, 역할분담, 페이지 구상<br>
5 ~ 13일차 : 설계 <br>
11 ~ 24일차 : 코드 구현<br>

## 목표
- MyBatis를 이용하여 semi 프로젝트에서 만든 코드 수정 
- JPA를 이용한 각자 게시판 만들기


## 서비스 기능
### 1. 메인 페이지
- 메인페이지 load 시에 DB에있는 모든 레슨들 조회하여 보여줌
- 시도, 시군구 api를 활용하여 자신의 지역에 맞게 필터링하여 레슨을 볼 수 있음
- 레슨들은 등록된 최신순으로 필터링되어 보여짐

### 2. 회원가입 페이지
- 수강생과 레슨프로를 선택하여 가입할 수 있게 함
- 이미지를 삽입할 수 있도록 구현함
- 회원가입 시에 유효성검사를 통해 잘못된 값이 들어갈수 없게 함

### 3. 로그인/로그아웃 페이지
- DB에 저장된 회원 정보와 일치시 로그인이 됨
- 세션에 로그인정보, user_type을 저장하여 추후 사용되도록 함
- 로그아웃 시 세션에 저장된 로그인 정보, user_type삭제

### 4. 아이디/비밀번호찾기 페이지
- 아이디 찾기 : DB에 저장되어 있는 이름, 이메일 주소가 일치하면 모달창으로 값 전달
- 비밀번호 찾기 : 문자로 인증코드를 전달함, SENS SMS API사용(자바 메일 라이브러리로 구글 smtp사용함)

### 5. 레슨상세보기 페이지
- 메인페이지에서 선택한 레슨에 대해 상세정보를 보여줌
- 팀원의 시군구API기술을 활용하여 수정 기술 
- 최상단 이동버튼, 해당 링크로 스크롤무브 기술

### 6. 레슨등록 페이지
- 사용자(프로)가 강의할 레슨에 대해 필요한 정보들을 입력할 항목들을 로딩
- 팀원의 업로드 이미지기술을 활용하여 수정 기술
- 업로드할 이미지의 파일의 크기, 용량 제한 및 확장자 유효성검사
- 최상단 이동버튼 기술

### 7. 마이페이지 페이지
- 수강생 / 프로의 마이페이지가 존재함
- 수강생 마이페이지에서는 지금까지 수강한, 수강중인, 수강 예정인 강의들을 보여줌
- 해당 강의에 대해 후기를 작성 / 수정하는 페이지로 연결하며 수강취소가 가능함
- 프로의 마이페이지에서는 프로가 강의하는 레슨들이 보여짐
- 레슨재개, 레슨중단 버튼을 통해 레슨 모집상태 변경(예정)  

### 8. 리뷰 페이지
- 수강생이 들은 강의에 대해 별점과 리뷰상세를 작성 / 수정 가능

### 9. 수강생 관리 페이지
- 담당 수강생들의 개인정보 및 수강정보 확인 가능
- 수강확인 버튼 클릭을 통해 출석 횟수 증가 가능(예정)

### 10. 라운딩 후기 게시판
- 

### 11. 중고거래 게시판
- 여러 중고 용품을 자유롭게 올려 소통할 수 있도록 하는 게시판
- 게시글 등록 시 사진 다중 첨부 가능
- 게시글은 최신순으로 노출
- 빈 문자열 등록할 수 없도록, 사진 첨부 필수 진행하도록 유효성 검사
- 로그인 시 게시글 작성, 댓글작성, 좋아요 기능 사용 가능

### 12. 문의사항 게시판
- 

### 13. 공지사항 게시판


### 14. 모임 게시판


## 구현기능
- 이미지 다중 업로드
- 이미지 업로드 수만큼 게시글 불러오기
- SMS API를 이용한 문자 인증으로 비밀번호 변경
- 결제 API를 이용한 레슨 결제
- 텍스트 에디터 API를 이용한 게시글 쓰기 가능
- 게시판 유효성 검사
- 지도 API
- 채팅 API

## 사용도구
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white"> <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white"> <img src="https://img.shields.io/badge/spring boot-6DB33F?&style=for-the-badge&logo=oracle&logoColor=white"/>   
 <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white"> <img src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jQuery&logoColor=white"> <img src="https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=Bootstrap&logoColor=white"><br>
<img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=for-the-badge&logo=Apache Tomcat&logoColor=white"> <img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=Oracle&logoColor=white"><br> 
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white">
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white"> <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"><br> <img src="https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=Slack&logoColor=white"> <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=Discord&logoColor=white">

### Collaboration & Tools
- Slack
- Figma
- ERD cloud
- starUML

### 팀원 (가나다순)<br>
**김지연 [@Jiyeon](https://github.com/JiyeonKimbackend) - CSS 담당** <br>
✔️ 모임 게시판 담당<br>
✔️ <br>
✔️ <br>
✔️ <br>
✔️ 담당 페이지 css 구현<br>
<br>
**전승현 [@cokesh](https://github.com/cokesh) - Git 관리자**<br>
✔️ 공지사항 게시판 담당<br>
✔️ <br>
✔️ <br>
✔️ Git, Github 관리<br>
✔️ 담당 페이지 css 구현<br>
<br>
**조건우 [@KevinJo-Keonwoo](https://github.com/KevinJo-Keonwoo) - PL**<br>
✔️ 라운딩 후기 게시판 담당<br>
✔️ 카카오맵 API를 활용한 지도 표시/검색 기능 구현<br>
✔️ Pageable라이브러리를 활용한 페이징 처리 구현<br>
✔️ RESTful API, CRUD repository, ModelMapper 등 다방면으로 JPA구현<br>
✔️ 담당 페이지 css 구현<br>
<br>
**한미래 [@devfuturo](https://github.com/devfuturo) - PM**<br>
✔️ 중고거래 게시판 담당<br>
✔️ 아임포트 API를 활용한 결제 기능 구현<br>
✔️ 텍스트 에디터 API를 사용하여 글쓰기 기능 구현<br>
✔️ 게시글, 댓글 작성과 좋아요 기능 사용을 위한 유효성 검사<br>
✔️ 담당 페이지 css 구현<br>
<br>
**황초연 [@myCYWORLD](https://github.com/myCYWORLD) - Notion 관리자**<br>
✔️ 문의사항 게시판 담당<br>
✔️ 게시판 비밀글 기능 구현<br>
✔️ 기존 비밀번호 변경 페이지에서 SMTP 라이브러리를 SENS SMS API로 대체하여 인증방법 변경<br>
✔️ Admin 유저 관리 페이지 기능 구현<br>
✔️ 팀 노션 관리<br>
✔️ 담당 페이지 css 구현 <br>
