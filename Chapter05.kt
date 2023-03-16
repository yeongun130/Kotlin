package com.example.kotlin

class Chapter05 {

    /* 함수를 사용하는 용도 >> 코드를 분류하기 위해서 */

    fun main() {
        functionName() 
        functionParam("값", 153)

        var pi = getPi()
        println("pi = ${pi}")
    }
    // 기본 함
    fun functionName() {
        // 코드 블럭
    }
    // 입력값이 있는 함수
    fun functionParam (param1:String, param2:Int) {
        println("param1 = ${param1}, param2 = ${param2}")
    }
    // 출력값이 있는 함수
    fun getPi() : Double {
        return 3.141592
    }
}
