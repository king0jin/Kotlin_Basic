package com.example.kotlinbasic

//제네릭
// 여러 종류의 데이터 타입 저장가능
fun main() {
    //객체 생성
    val box1 = Box<Int>(10)
    val box2 = Box<String>("사탕")

    println(box1.value)
    println(box2.value)
}

//Box클래스 생성, 데이터 타입 : T, 생성자 값 지정
class Box<T>(var value: T) {

}