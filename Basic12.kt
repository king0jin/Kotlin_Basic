package com.example.kotlinbasic
//1. 콜백 함수(고차 함수)

//2. suspend함수
//  suspend함수는 다른 suspend함수안에서 실행이가능하다
//  하지만, main함수를 suspend로 만드는 것은 올바르지 못함
// => 메인액티비티에서 코루틴스코프를 만들어서 코루틴으로 실행

fun main() {
    //함수 호출
    myFunc { println("함수 호출") } // 함수 매개변수 전달이 한개인 경우

    user(10){
        println("인풋은 10") // 생략가능
    }
}

//input과 output이 없는 함수
fun myFunc(callBack : () -> Unit){
    println("함수 시작!")
    callBack()
    println("함수 끝!")
}

////2. suspend - 1번
fun user(a: Int, callBack : () -> Unit = {}) {
    println("함수시작")
    callBack()
    println("함수종료")
}