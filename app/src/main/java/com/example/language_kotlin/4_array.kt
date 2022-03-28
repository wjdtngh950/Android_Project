package com.example.language_kotlin

fun main(){
    //배열
    //처음 선언했던 공간을 변경 할 수 없음

    var intArr: Array<Int> = arrayOf(1, 2, 3, 4, 5) //0번 index 부터 4번 index까지 1~5가 채워진 배열을 만듬
    //var intArr: = arrayOf(1, 2, 3, 4, 5) 처럼 Array<Int>를 생략 할 수 있음!

    var nullArr = arrayOfNulls<Int>(5) //Int형의 5개의 null로 채워진 배열이 만들어짐,
                                            // 즉 5개의 빈 공간이 생겼다고 생각하면 편함!

    intArr[3] = 8 // int Arr의 3번째 자리에 8을 넣음 그럼 결과는? 1, 2, 8, 4, 5가 됨 index는 0부터 시작하니 주의!
    println(intArr[4]) // intArr의 "4"번째 인덱스의 값을 불러온다는 뜻! 그럼 5가 출력됨!

    nullArr[4] = 6
    println(nullArr[2]) // null로 초기화를 했기 때문에 null로 나옴!
    println(nullArr[4])// 위에서 null 4번째 값을 6으로 초기화 했기 때문에 6이 나옴!
}