package com.example.kotlin

class Chapter08 {

    // 지연초기화 : 메모리가 낭비되는것을 방지하기 위한 기술

    // lateinit var 변수명:타입
    // lateinit은 값을 변경할 경우가 있을 때 주로 쓰인다.
    lateinit var person:Person
    // lateinit 뒤에 타입은 기본형을 쓸 수 없다.

    // val 변수명 by lazy { 변수에 들어갈 클래스생성자 또는 값 }
    // lazy는 한번 값을 입력 해놓고 바꾸는 경우가 없을 때 주로 쓰인다.
    val age by lazy { Person() }

    fun main() {
        person = Person()
    }
}
class Person {
    var name = ""
    var age = ""
    var address = ""
    var tel = ""
}