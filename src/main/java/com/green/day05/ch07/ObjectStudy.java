package com.green.day05.ch07;

public class ObjectStudy {
    /*
    지금까지의 클래스는 main메소드를 위치시키기 위한 용도로만 사용했다.
    main메소드가 하는 역할을 나타내기 위한 네이밍(클래스명)으로 사용했다.
    즉, 객체지향을 위한 클래스를 만든 것은 아니다.
    자바 문법 학습을 위한 용도로만 사용을 했다.

    클래스(class) = 데이터(Data) + 메소드(Method)
                   속성(명사)   + 메소드(동사)
                   필드
                   멤버필드     + 멤버메소드
                   멤버변수
                   전역변수

                   멤버필드는 외부에서 접근할 수 없게하기위하여 private으로 막아놨다.
                   (상수 제외)

    (클래스 이름으로 다이렉트로 사용할 수 있기 때문에 아래처럼 부른다.)
    --> 객체화가 필요없기 때문에 (이미 메모리에 값이 올라가있다.)
    static 멤버필드 : 클래스 멤버필드
           멤버메소드 : 클래스 멤버메소드

    (인스턴스 객체가 되어야만 쓸 수 있기 때문에 아래처럼 부른다.)
    --> 객체화가 필요하기 때문에 (메모리에 값을 올리기위해서는 객체화가 필요하다. 왜냐 그냥 문서형태에불가하므로)
    static 안 붙은 멤버필드 : 인스턴스 멤버필드
                  멤버메소드 : 인스턴스 멤버메소드

    속성은 데이터를 저장하기 위한 공간(전역 변수)

    인간 - 속성 : 혈액형, 생년월일, 성별, 국가, 머리 색, 키, 몸무게...
        - 메소드 : 일어난다, 소리 지른다, 잔다, 뛴다, 싸운다, 운다...

    클래스를 이용해서 객체(인스턴스)를 만든다.
    만드는 행위 : 객체화 or 인스턴스화
    new 키워드를 사용한다.

   class       vs    객체
   문서              실체(진짜)
   아파트 설계도      아파트 설계도로 만든 아파트
   Tv 설계도         Tv 설계도로 만든 Tv

   우리가 클래스에 적는 내용은 이 객체가 만들어졌을 때 작동하는 방식을 적는 것이다.
   예를들어, 이러이러한 데이터를 저장해라, 데이터를 변경해라.
   그러면 데이터를 저장할 수 있는 공간도 필요하다.(속성)

   기본타입(Primitive Type)을 제외한 모든 변수는 참조타입(Reference Type)입니다.
   참조변수는 객체의 주소값을 저장한다.
   예를들어 :
   Karl(클래스명) abc(변수명);
   abc 변수는 Karl 객체의 주소값만 담을 수 있다. (저장할 수 있다.)
   참조변수끼리의 == 비교는 주소값이 같은지 비교한다.

   객체를 이용할 때는 "주소값."으로 이용한다. // 중요!!
     */
}
