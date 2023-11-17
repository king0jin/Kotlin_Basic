package com.example.kotlinbasic

fun main() {
    // null safety - '?'
    var name: String? = null
    name = "영진1"
    //name = null
    // 형식에 맞게 값을 넣을 수 도 있고, null값도 넣을 수 있다.

    //ex
    //또다른 string변수 생성
    var name2: String = ""

    //Q. name2 = name
    //A1. null 체크
//    if (name != null) {
//        name2 = name
//    }
    //A2. 개발자 신뢰 - !!
    // name2 = name!!

    //A3. 코틀린 내장함수 사용
    name?.let {
        name2 = name
    }
    print(name2)
}