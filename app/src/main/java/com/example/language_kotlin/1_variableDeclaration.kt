package com.example.language_kotlin

fun main(){
    //var - 일반적인 변수
    //val - 상수! 변경 불가능 !
    //코틀린은 변수 선언 후, 초기화를 하지 않으면 error, 그러나

    //선언 방법
    //1. 변수선언 + 변수이름: 자료형 = 자료형에 따른 값
    /*2. 변수선언 + 변수이름: 자료형
         변수이름 = 자료형에 따른 값 */

    var suho1: Int
    suho1 = 28
    println(suho1)

    val suho2: Int
    suho2 = 23455 //val 이렇게 한번 선언하면 그 이후로 바꿀 수 없음
    println(suho2)


}