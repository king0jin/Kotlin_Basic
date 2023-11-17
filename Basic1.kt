package com.example.kotlinbasic

import java.util.Scanner
import kotlin.random.Random

fun main() {
    // print, println
    print("Hello World")
    println("안녕하세요")

    // 변수(var) - 타입을 저절로 지정
    var i = 10
    val name = "영진"
    var point = 3.14
    // 타입(레퍼런스타입)을 지정하고 싶을 때
    var j : Int = 20

    // 상수(val) = 자바의 final
    val num = 30
    //컴파일타임상수: main()위에 선언
    //const val num2 = 40

    // 형변환: .to~()
    var numberI = 10 //Integer
    var numberL = 20L //Long
    numberL = numberI.toLong()
    numberI = numberL.toInt()

    var my = "300"
    my = numberI.toString()
    numberI = my.toInt()

    //문자열(String)
    val hi = "hello"
    println(hi)
    // 대문자
    println(hi.uppercase())
    // 소문자
    println(hi.lowercase())
    // 인덱싱
    println(hi[0])
    println(hi[4])
    // 문자열 결합
    println("제 이름은 " + name + "입니다.")
    println("제 이름은 $name 입니다.")
    println("제 이름은 ${name}입니다.")
    println("제 이름은 ${name + 10}입니다.")

    //max, min - import필요, 자바패키지써도 상관없지만 코틀린패키지 권장
    var a = 200
    var b = 20
    print(kotlin.math.max(a, b))
    print(kotlin.math.min(a, b))

    // random
    val randomNum1 = Random.nextInt(0, 100) //0 ~ 99
    println(randomNum1)
    val randomNum2 = Random.nextDouble(0.0, 1.0) // 0.0 ~ 0.9
    println(randomNum2)

    //키보드 입력 - 자바처럼 해도 된다
    var reader = Scanner(System.`in`)
    reader.next() //문자열입력받기
    reader.nextInt() //상수입역받기


}