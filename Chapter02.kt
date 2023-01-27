package com.yeongun.kotlin

import android.util.Log

class Chapter02 {

    fun main() {
        // 비교연산자 ( >, <, >=, <=, ==, !=)
        // ex)
        var result1 = 1 > 2
        println("결과 = ${result1}") // 결과값은 false가 나온다.
        var result2 = 1 <= 2
        println("결과 = ${result2}") // 결과값은 true가 나온다.
        var result3 = 1 != 2
        println("결과 = ${result3}") // 결과값은 true가 나온다.
        var result4 = 1 == 2
        println("결과 = ${result4}") // 결과값은 false가 나온다.

        // 문자형도 비교 가능
        // ex)
        var name = "Koltin" != "Java"
        println("결과 = ${name}") // 결과는 true가 나온다.
        /* 문자형을 비교 할 때 길이를 비교하는 것 이외에는 부등호(<, >, <=, >=)가 딱히 쓰이지 않는다.
         * 문자형을 비교 할 때는 대부분 ==, != 가 쓰인다. */

        // 논리 연산자 ( &&, ||, !(단항 연산자))
        var logic1 = result_2 && result_3   // &&는 둘 다 값이 true여야 true가 된다.
        println("논리 연산 && 결과 = ${logic1}") // 값은 true
        var logic2 = result_1 || result_2   // ||는 둘 중 하나만 값이 true이면 true가 된다.
        println("논리 연산 || 결과 = ${logic2}") // 값은 true
        var logic3 = !result_2    // !는 값이 true이면 false로 false이면 true로 바꿔준다.
        println("논리 연산 ! 결과 = ${logic3}")  // result_2의 값이 true이므로 값은 false

        // if
        // ex)
        var out = 0;
        var strike = 3
        if (strike > 2) {
            out++
            println("결과 out = ${out}") // if의 조건이 true이므로 out++ 되어 결과는 out = 1이 된다.
        } else {
            // else는 if의 조건이 false일 때 작동 되는 공간이다.
        }

        // when - if의 확장판 (다른 언어에선 switch)
        /* when 쓰는 순서
         * when ()안에 비교하고자 하는 거 쓰기
         * 비교하는 값 -> 쓰기 */
        // when은 switch와 다르게 범위값이 넓어졌다.
        // ex)
        var month = 6
        when(month) {
            6, 7, 8 -> println("여름입니다.")
        }
        // in이라는 연산자 사용 가능
        // ex)
        when(month) {
            in 6..8 -> println("여름입니다.")    // 6부터 8 사이에 있는 숫자를 포함
        }
        // ex)
        when(month) {
            9 -> println("9월입니다.")
            6 -> println("6월입니다.")
        }

        // 분기가 많을 경우에는 if 보다 when이 가독성이 좋다.(사람마다 다름)
    }
}
