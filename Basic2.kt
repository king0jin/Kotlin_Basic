package com.example.kotlinbasic

fun main() {
    //조건문
    //코틀린에서는 if문을 식으로 취급함

    //if문 - 자바와 같음
    var i = 5
    if(i > 10){
        print("10 보다 크다")
    }else if(i > 5) {
        print("5 보다 크다")
    }else{
        print("ㅋㅋ")
    }
    //if문은 when문으로 치환 가능
    when{
        i > 10 -> {
            print("10 보다 크다")
        }
        i > 5 -> {
            print("5 보다 크다")
        }
        else -> {
            print("ㅎㅎ")
        }
    }
    /////////////////////////////////////////////////////////////////
    // 일반적으로 프린트 할 일은 별로없다, 결과를 리턴하는 케이스가 많음
    var result = if(i > 10){
        "10 보다 크다"
    }else if(i > 5) {
        "5 보다 크다"
    }else{
        "!!!"
    }
    print(result)

    // when도 가능
    var result2 = when {
        i > 10 -> {
            "10 보다 크다"
        }
        i > 5 -> {
            "5 보다 크다"
        }
        else -> {
            "???"
        }
    }
    print(result)

    //삼항연산자
    //자바 : boolean result = i > 10 ? true : false;
    var result3 = if (i > 10) true else false
}