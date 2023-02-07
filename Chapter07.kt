package com.example.kotlin

import android.app.Activity

class Chapter07 {

    fun main() {
        var myName:String = "메시"
        var number:Int? = null  // nullable -> ?를 붙여 null을 쓸 수 있다는 것을 알림.
        var newVariable: Activity? = null

        println("문자열의 길이 = ${myName.length}")

        // Null Pointer Exception
        var result = number?.plus(37) ?: 51  // Safe Call
        // ?:를 사용하여 number가 null일 경우 51을 대체하여 result에 넣는다.

        var result2 = result.plus(53)

        // null을 안정적으로 처리하는 방법
        /* 1. nullable : 타입 뒤에 ?를 붙여 null을 쓸 수 있다는것을 알림.
         * 2. Safe Call : nullable로 선언되었다면 Null Pointer Exception을 발생하지 않게 함.
         * 3. Elvis Expression : null일 경우 대체하는 디폴드 값을 넘겨준다.*/
    }
}