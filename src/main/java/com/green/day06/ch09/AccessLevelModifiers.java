package com.green.day06.ch09;

public class AccessLevelModifiers {
    /*
        접근 수준 지시자 : private, default(아무것도 작성안한것), protected, public

        private : class내에서만 접근 가능
        default : private + 같은 패키지면 접근 가능 --> 잘 사용안함
        protected : default + 상속 관계면 접근 가능
        public : 무조건 접근 가능(완전 오픈)

        class는 보통 public 붙이고
        멤버필드는 대부분 private이다.
            - private를 붙이지 않아도 되는 경우가 있다. ---> 상수는 오픈가능 : 어짜피 값이 변하지 않으므로
            - 변수는 무조건 private (은닉화/캡슐화)
            - private한 멤버필드를 읽기/쓰기할 때 메소드를 통해서한다. (getters/setters)
     */
}