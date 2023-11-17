package com.example.kotlinbasic

fun main() {
    val dog1 = Animals("멍멍이", 2)
    val dog2 = Animals("멍멍이", 2)

    println(dog1)
    println(dog2)
    //해시코드가 다르다! = 서로 다른 강아지(객체)이다!
    println(dog1 == dog2) //F

    //만약, 내가 이름과 나이가 동일하다면 같은 강아지라고 보겠다!라고 가정!
    //자바처럼 class부분에 generator로 equals()hashcode()로 재정의 생성 = 같은 해시코드가 나온다
    //코틀린에서는 class부분에 data를 붙임으로써 해결한다!(재정의까지해준다)

    dog1.act()
    dog2.hobby = "원반던지기"
    println(dog2.hobby)
    println(dog2.eat)

}

data class Animals(
    //class정의(class생성자)
    val name: String,
    var age: Int,
){
    //변수 추가 가능
    var hobby = "공놀이" //public
    var eat = "닭고기" //private
        private set
        get() = "메뉴 : $field"

    //method 추가 가능
    fun act(){
        print("멍멍")
    }

    //data클래스가 아니고 일반 클래스일 때 기능을 추가하고 싶을때 init 사용
    init {
        print("intit")
    }
}