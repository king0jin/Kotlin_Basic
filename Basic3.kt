package com.example.kotlinbasic

fun main() {
    // 반복문
    // 일반적으로 반복문을 사용하는 경우는 어떤 리스트 같은 거를 사용할 때 많이 사용
    val items = listOf(1, 2, 3, 4, 5)

    //리스트 반복
    // 자바의 for-each문과 동일한 코드
    for(item in items){
        print(item)
    }
    //
    items.forEach { item ->
        print(item)
    }

    //일반적인 for문
    //자바 : for(int i = 0; i < items.length; i++)
    for(i in 0..(items.size-1)){
        print(items[i])
    }

    //while문도 동일
    //continue, break 동일하게 지원
}