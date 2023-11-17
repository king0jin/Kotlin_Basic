package com.example.kotlinbasic

//상속: extends

//추상 클래스는 상속의 재료가 되는 클래스이기 때문에 상속이 당연히 된다

//일반 클래스는 상속이 불가능!
// 일반클래스 앞에 open키워드 추가하여 상속이 가능하게 만들어서 사용한다.

fun main() {

}
//추상클래스
abstract class Zoo{
    //공통 method
    open fun move(){
        print("네발로 살금살금 걸어갑니다.")
    }
}
// 강아지 클래스와 고양이 클래스는 동일한 move()를 가지고 있음
// 추상클래스를 만들어서 move()를 하나로 묶어보자! - 상위로!
// 상위로 만든 추상클래스를 하위 클래스인 강아지와 고양이 클래스로 상속시킨다!
// 상속받은 강아지 클래스와 고양이 클래스는 자바처럼 자동 오버라이드가 불가능!
//  추상클래스의 move()를 open move()로 변경

class Dog: Zoo(){
    //method
    override fun move(){
        print("가끔은 두발로 쿵쾅걸리도 합니다.")
    }
}
class Cat: Zoo(){
    //method
//    fun move(){
//        //
//    }
}

//일반클래스 - open키워드 사용(필수)
open class Human

class SuperMan: Human()