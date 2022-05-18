# 전자상거래 시스템

## Table of Contents ##
1. [User](#User)
2. [Use Case](#Use Case)
3. [ERD](#ERD)
4. [Tool n Libraries](#Tool n Libraries)

## User ##
1. 관리자
2. 회원
   1. 회원 등급 적용 가능
3. 비회원

## Use Case ##
1. 공통
   1. 회원가입
      1. 회원정보 관리
   2. 로그인 : Spring Security
      1. 사용자 정보관리
   3. 회원 탈퇴
2. 관리자
   1. 사용자 관리
      1. 회원 등급 관리
   2. 상품 등록
      1. 상품정보 관리
   3. 게시글 관리
      1. 공지사항 등록
      2. QnA 관리
      3. 리뷰 관리
      4. FAQ 관리
3. 회원 비회원 공통
   1. 상품 검색
      1. 장바구니 등록
   2. 상품 구매 
      1. 결제
      2. 반품 교환 
      3. 리뷰 등록
   3. 게시글 관리
      1. QnA 등록

## ERD ##

## Tool n Libraries ##
1. Spring Boot
2. JPA
3. Maria DB
4. Thymeleaf
5. Bootstrap
6. JWT