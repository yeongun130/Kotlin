package com.yeongun.kotlin

class Chapter03 {

    fun main() {
        //배열
        /* Int -> IntArray */
        var intArr:IntArray = IntArray(10)
        intArr[0] = 10  // index 0에 10을 넣는다.
        println("0번 index 값 = ${ intArr[0] }")

        /* Char -> CharArray */
        var weekArr:CharArray = CharArray(7)
        weekArr[0] = '월'
        weekArr[1] = '화'
        // ...
        weekArr[6] = '일'

        // 컬렉션 (동적 배열이라고도 함)
        /* list(배열이랑 같음, 입력된 값의 갯수를 바꿀 수 없다.)
           mutableList(list를 동적으로 사용 할 수 있게끔 mutable이라는 prefix를 사용) */
        var mutableList = mutableListOf<Int>()    // Generic -> <>안에 표시 되는 것(어떤 타입으로 할지 명시)
        /* 값 넣기
        add라는 함수를 통해 index가 자동으로 생성됨 */
        mutableList.add(5)  // index 0
        mutableList.add(10) // index 1
        mutableList.add(20) // index 2

        println("2번째 index의 값 = ${ mutableList.get(2) }")

        // 맵(key,value)
        var mutableMap = mutableMapOf<String,String>() // Generic에 2개의 타입을 넣어줘
        mutableMap.put("android", "kotlin") // key에는 변수이름, value에는 값

        println("android의 값 = ${ mutableMap.get("android") }") // get(key)를 하게 되면 key의 값이 나온다.(android라는 key의 값은 kotlin이므로 kotlin이 출력됨)
    }
}
