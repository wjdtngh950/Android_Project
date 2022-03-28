package com.example.language_kotlin

fun main() {
    //if(조건식){}이 공식임!

    /*아래 if문은 이렇게 해석됨 :
 '만약(if)' 'a가 10보다 크면' "a는 10보다 크다"가 출력되고, '그렇지않으면(else)' "a는 10보다 작거나 같다"가 출력됨 */
    var a = 7
    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }


/*if 내 조건식에 사용되는 부등호
 < (작다)
 <=(작거나 같다)
 > (크다)
 >=(크거나 같다)
 != (다르다) -> a!=b (a는 b가 다르다)
 ==(같다) -> a==b (a와 b는 같다) 이거 주의 할 것! '조건식' 내에서는 =이 아니라 ==임!
*/

/*한 번 더 들어가서!!
'만약(if)' 'b가 10보다 크거나 같으면' "b는 10보다 크거나 같다"가 출력되고
'그렇지 않고 만약에(else if) 'b가 10과 같으면' "b는 10과 같다"가 출력되고
'그렇지않다면 (else) "b는 10보다 작다"가 출력되게 만들어보자!*/
    var b = 2

    if(b >= 10) {
        println("b는 10보다 크거나 같다")
    }
    else if(b == 10){
        println("b는 10과 같다")
    }
    else{
        println("b는 10보다 작다")
    }

    dowhen(1)
    dowhen("suho")
    dowhen(12L)
    dowhen(3.123123)
    dowhen("suho와 뱅샐")
}

//When
//when은 하나의 변수를 여러개와 비교할 수 있음

fun dowhen (a: Any){ //Any는 최상위 자료형임 아무거나 다쓸 수 있음
    // 조건값
    when(a){
        1 -> println("정수 1입니다") // a가 1이라면? 정수는 1입니다 출력
        "suho" -> println("나는 수호입니다") //a가 suho라면? 나는 수호입니다 출력
        is Long -> println("이 자료형은 Long 입니다.") //is + 자료형은 ~가 이 자료형이라는 뜻 즉, a가 Long이라면?
        !is String -> println("이 자료형은 String 이 아닙니다.") //!가 붙었으니 그냥 is의 반대!
        else -> println("모르겠다..아무것도 없다...") // 위의 값에 모든게 없다면! else로 귀결됨
    }
} //만약에 위의 값에 여러개에 부합을 하여도, 가장 처음 부합한 값만 나타냄!


