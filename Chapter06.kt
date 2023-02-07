package com.example.kotlin

class Chapter06 {

    fun main() {
        // 클래스를 사용하는 방법
        // 1. 초기화
        var cls = className()   // 인스턴스 = 메모리에 로드되어 있는 클래

        cls.variable1
        cls.function()

        // 2. companion object로 만들기
        Log.d("태그","메시지")

        var parent = Parent()
        parent.showHouse()  // 강남 200평 아파트가 촐력됨.

        var child = Child()
        child.showMoney()
        child.showHouse()   // 강남 10평 오피스텔이 출력됨.

        var son = Son()
        var result = son.getNumber("짝")
    }
}

class Log {
    companion object {
        fun d(tag:String, msg:String) {
            print("[$tag] : $msg")
        }
    }
}

// 변수(property)와 함수(method)의 모음
class className {

    init {
        // 클래스를 초기화하면 호출된다.
    }

    var variable1:String = ""   // 변수 - 프로퍼티

    fun function() {                // 함수 - 메서드
        var variable2:String = ""
    }
}

// 상속
// 상속을 사용하는 이유
// 1. 기존의 작성된 코드를 재활용하기 위해서
// 2. 코드를 재활용하는데 -> 체계적인 구조로 사용하기 위해

// override : 부모클래스에 정의된 프로퍼티와 메서드를 동일한 이름으로 자식클래스에 재정의 할 때 사용된다.

open class Parent {
    var money = 5000000000
    open var house = "강남 200평 아파트"

    open fun showHouse() {  // open을 붙여 다시 재정의 할 수 있음을 알림.
        println("parent house = ${house}")
    }
}

class Child : Parent() {
    // 상속 받으면 부모 클래스의 프로퍼티와 메서드를 자식클래스에 사용할 수 있다.
    override var house = "강남 10평 오피스텔"  // 동일한 프로퍼티를 쓰기 위해서 override를 사용함.

    fun showMoney() {
        println("money = ${money}")
    }

    override fun showHouse() {
        println("child house = ${house}")
    }
}

class Son {

    // 오버로드 : 동일한 이름의 함수를 만드는 것.

    fun getNumber() : Int {
        return 1
    }

    fun getNumber(param:String) : Int {
        return 2
    }
 }