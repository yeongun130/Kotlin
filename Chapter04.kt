package com.example.kotlin

class Chapter04 {

    fun main() {

        var intArray = intArrayOf(0,10,20,30,40)
        // 반복문
        // for
        // 일반적으로 몇 번의 횟수를 반복하는 형태

        // .. 을 사용하여 반복
        /* ex */
        for (index in 1..100) {
            println("index = ${index}") // 1부터 100까지 출력됨.
        }
        // until : 마지막을 제외하고 반복
        /* ex */
        for (index in 1 until 10) {
            println("index = ${index}") // until을 썼기 때문에 1부터 9까지 출력됨.
        }
        // step : 값을 건너뛰고 반복
        /* ex */
        for (index in 1 until 10 step 2) {
            println("index = ${index}") // step과 until을 썼기 때문에 1,3,5,7,9이 출력됨.
        }
        // downTo : 값을 거꾸로 반복
        /* ex */
        for (index in 10 downTo 1) {
            println("index = ${index}") // 10에서 1로 출력됨.
        }
        for (value in intArray) {
            println("value = ${value}") // intArray 안에 있는 값이 모두 출력됨.
        }

        // while
        var out = 0
        while (out < 3) {
            // while의 조건이 true일 때까지 반복
            println("현재 out count = ${out}")
            out = out + 1
        }

        // 반복문 제어
        // break : 조건이 성립되면 반복문 종료
        for (index in 1..10) {
            if (index > 5) break    // index 값이 5를 넘어갈 때 반복문을 종료한다는 의미
            println("현재 숫자 = ${index}")
        }
        // continue : 값을 스킵하고자 할 때 사용
        for (index in 1..10) {
            if (index == 5) continue    // index 값이 5이면 건너뛰고 반복
            println("현재 숫자 = ${index}")
        }
    }
}