package com.example.kotlinbasic

//메인함수
fun main() {
    // 함수
    //자바: method
    //코틀린: 함수, method
    println(sum(10, 20))
    print(plus(2, 4, 6))

}

//내가 만든 함수1
fun sum(a: Int, b: Int) : Int {
    return a + b
}

//내가 만든 함수2
// 함수 내용이 한 줄이라면?
fun plus(c: Int, d: Int, e: Int = 0) = c + d + c
//메서드 오버로드는 메서드를 여러개를 만드는 것이 아니라 파라미터를 조절해서
// 디폴트값을 적당히 넣어줘서 만들 수 있다

//input타입은 반드시 기입!