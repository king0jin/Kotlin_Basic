package com.example.kotlinbasic

fun main() {
    //리스트
    // 변경이 불가한 리스트
    val list1 = listOf(1, 2, 3, 4, 5)

    // 변경이 가능한 리스트 - 제네릭 생략가능
    //val list2 : MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.add(6)
    list2[0] = 0
    list2.remove(1)
    println(list2)

    // 배열 - 잘 사용하지 않음
    val arr = arrayOf(1, 2, 3)
    // 배열은 get과 set을 이용하여  값을 지정하거나 불러올 수 있음
    // 자바와 같은 방식이므로 []사용 (리스트로 동일 지원 가능)

    //리스트와 배열의 크기는 size로 얻는다.
    var len1 = arr.size
    println(len1)
    var len2 = list2.size
    println(len2)

    //예외처리
    //try~catch
    try{
        val item = arr[4]
    }catch (e: Exception){
        println(e.message)
    }

}