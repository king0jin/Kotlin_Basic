package com.example.kotlinbasic

fun main() {
    // Person클래스의 John객체 생성
    val john = Person("John", 20)
    println(john.name)
    println(john.age)

    // name은 val이므로 수정할 수 없음
    // age는 var이므로 수정가능
    john.age = 15
    println(john.age)

    //getter, setter를 별도로 구현하지 않고 val, var로 조절가능

}

class Person(
    //기본적으로 public data
    val name: String,
    var age: Int,
) {
}