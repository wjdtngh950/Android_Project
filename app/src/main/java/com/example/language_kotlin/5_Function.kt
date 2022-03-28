package com.example.language_kotlin

fun main(){
    println(add(5, 6, 7)) // 밑에 add 함수를 보면 a=Int형의 5, b=Int형의 6, c=Int형의 7과 대치됨!
}

fun add(a: Int, b: Int, c: Int): Int{
  return a+b+c // return이 나오면 함수를 종료하고 결과값을 나타냄 여기선 함수가 종료되고 a+b+c를 반환하게됨!
}
//위 처럼 간단하게 만들 수 있는 함수는 이렇게도 가능함! 단일 표현식 함수라고 표현
//fun add(a: Int, b: Int, c: Int) = a + b + c



