package com.example.language_kotlin

fun main(){

    // 정수형
    // Byte, Short, Int, Long
    // 실수형
    // Float, Double

    var int: Int = 1234
    //var int = 1234 // 이렇게 정수형으로 나타내면 자료형인 Int를 생략해도 가능!

    var long: Long = 1234L //Long 같은 경우는 뒤에 L을 붙여 더 큰 메모리를 사용하는 정수임을 표시해야 함!
    //var long = 1234L // L로 끝나면 자료형인 Long을 생략 가능!

    var double: Double = 123.5
    //var double = 123.5 // 이렇게 실수로 끝나면 Double 자료형 생략 가능!

    var float: Float = 123.5f // Double과 Float의 차이는 나중에 메모리 관리에 있음! 예를들어 10개만 쓰면 되는 데,
                             // 굳이 100의 힘을 내는 것을 쓸 필요없다는 뜻! Float < Double
    //var float = 133.5f //이렇게 f를 붙이면 자료형인 Float을 생략 가능!

    var char1: Char = 'a'
    var char2: Char = '가' // 이렇게 오로지 문자 '한개' 만을 작은 따옴표로 감싸서 문자를 표현!
    //var char1 = 'a' // 이렇게 문자 하나로 나타내면 자료형 Char을 생략 가능!

    var bool1: Boolean = true
    var bool2: Boolean = false // true는 1, false는 0을 나타냄 즉, 정수가 아닌 참과 거짓을 판별하는 용! 반목문이나
                               // 조건문 진행 할 때 많이 사용 하니 정수와 혼동하지 말 것!
    //var bool1 = true // true와 false로 나타내면 Boolean 자료형 생략 가능!

    var string1: String = "안녕하세요 저는 뱅크샐러드 QA Engineer intern 정수호 입니다!🥰" //문장을 나타낼 때 사용
    var string2: String = """이렇게 큰 따옴표를 3번 사용하면 줄 바꿈이나 
        특수문자까지 바로바로 사용 할 수 있습니다 너무 좋죠?😆 """
    //var string1 = "안녕하세요 저는 뱅크샐러드의 ~ 정수호입니다" // 이렇게 문장으로 나타내면 String 자료형 생각가능!

    println(int)
    println(long)
    println(double)
    println(float)
    println(char1)
    println(char2)
    println(bool1)
    println(bool2)
    println(string1)
    println(string2)
}