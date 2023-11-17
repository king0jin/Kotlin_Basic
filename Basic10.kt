package com.example.kotlinbasic
//인터페이스 - 계획서같은거
//implements

fun main() {
    //타입체크 - is
    val dog: Pet = Dog1()
    val cat = Cat1()
    // 강아지 확인
    if(dog is Dog1){ //Pet이라면 sleep()실행X
        println("우리집 개가 맞네")
        dog.eat()
        dog.sleep()
    }else{
        println("우리집 개가 아니네?")
    }
    // 고양이 확인
    if(cat is Cat1){
        println("우리집 고양이가 맞네")
        cat.eat()
        cat.sleep()
    }else{
        println("우리집 고양이가 아니네?")
    }

    //강제 타입 변환 - as
    cat as Dog1
    cat.eat()

}
//인터페이스
interface Sleeping {
    fun sleep()
}

//추상클래스 구현
abstract class Pet{
    //공통 method
    open fun eat(){
        print("먹이를 먹다")
    }
}

class Dog1: Pet(), Sleeping{
    //method
    override fun eat(){
        println("냠냠")
    }

    override fun sleep() {
        println("쿨쿨 잔다")
    }
}
class Cat1: Pet(), Sleeping{
    //method
    override fun eat(){
        println("뇸뇸")
    }

    override fun sleep() {
        println("흠냐링 잔다")
    }
}