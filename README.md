# API 기본 구조 구현

값을 서버로 보내고 → 서버에서 계산 → 결과를 다시 응답으로 받는
기본적인 API 사용법을 익히기 위한 연습 프로젝트입니다.

Postman을 이용해 POST 요청과 JSON 데이터 처리 흐름을 학습하는 것이 목표입니다.

## 🛠 기술 스택

- Java 17
- Spring Boot
- Maven
- IntelliJ IDEA
- Postman

## 📂 프로젝트 구조
src
└── main
└── java
└── com.example.demo
    └── Application.java
        └── controller
            └── ApiController.java

## 🚀 실행 방법

1. IntelliJ에서 프로젝트 열기
2. Application.java 실행
3. 서버 실행 확인  

## 📌 미션 목록

✅ 미션1. 더하기 API
목표: 두 개의 숫자를 서버로 보내면 더한 결과를 돌려줍니다.

✅ 미션2. 좌표 평균 API
목표: 두 지점의 위도/경도를 받아 중간 지점을 계산합니다.

✅ 미션3. 결과 문장 만들기 API
목표: 계산된 좌표를 사람이 읽을 수 있는 문장으로 만들어 반환합니다.

## 🧪 테스트 방법 (Postman)

1. Postman 실행
2. Method: POST
3. URL: http://localhost:8081/add
4. Body → raw → JSON 선택
5. JSON 입력 후 Send

🎯 학습 포인트
- POST 요청 처리 방식
- JSON 데이터 → Java 객체(Map) 변환
- Controller 역할 이해
- 서버에서 계산 후 응답 반환 흐름
