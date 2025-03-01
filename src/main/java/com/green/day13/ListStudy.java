package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    /*
    List 인터페이스, Interface(인터페이스)는 객체화 불가능하다.

    인터페이스는 부모역할만 한다. list를 상속받은 class(LinkedList, ArrayList)가 있다.
    위 두개의 class는 결과는 똑같은데 처리방식이 다르다.
    LinkedList는 Node방식으로 데이터를 다루고
    ArrayList는 Array(배열)방식으로 데이터를 다룬다.
    LinkedList는 수정이 잦을때 유리하고 ArrayList는 읽기 위주의 작업이 많을때 유리하다.

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();
    이렇게 작성이 가능하다.
     */

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); //0번방에 10값이 주입
        list.add(20); //1번방에 20값이 주입

        ArrayList list2 = (ArrayList) list;
        list2.add(30); //2번방에 30값이 주입
        list2.add("하하"); //3번방에 주입

        int[] arr = new int[3];
        //arr[0] = "하하" 타입이 다른데 들어가지는 이유
        Object[] arr2 = new Object[4];
        arr2[0] = 10;
        arr2[1] = "하하";

        int val0 = (int)list.get(0);
        System.out.println("val0 : " + val0);

        String val3 = (String)list.get(3);
        System.out.println("val3 : " + val3);

        System.out.println(list);
        System.out.println(list2);
    }
}
