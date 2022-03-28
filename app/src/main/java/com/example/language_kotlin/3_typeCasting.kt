package com.example.language_kotlin

fun main(){
    //예를들어 Int 값을 Long에다가 넣어서 자료형을 변환 시켜주는 역할을 함!
    var suho: Int = 28
    var bankSalad: Long = suho.toLong() // 수호에 있는 Int 형 28의 값을 Long형 뱅샐에 넣어 줄 때 사용!
    //var bankSalad: Long = suho 👉 이렇게 사용하면 할당이 안되니 주의! 꼭 뒤에 .toLong()같은 .to+자료형을 붙여줄 것!

}