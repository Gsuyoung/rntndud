package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum = 10; //InstCnt 클래스 밖에서 사용할때는 (클래스명.)
        InstCnt ic1 = new InstCnt();
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum; //static이 붙으면 한 공간
    int value; //공간이 각각 생김

    InstCnt() { //기본생성자
        instNum++;
        System.out.println("인스턴스 생성: " + InstCnt.instNum);
        System.out.println("인스턴스 생성: " + instNum);
        System.out.println("value: " + value);
    }
}
