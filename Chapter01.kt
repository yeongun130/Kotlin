package com.yeongun.kotlin

class Chapter01 {

    fun main() {
        var variable:String = "홍길동"

        // 코틀린의 기본타입
        // 실수형
        var doubleValue:Double = 33.5
        var floatValue:Float = 123.5F   /* 모든 실수형을 Double로 인식하기 때문에 Float를 쓰기 위해서는
                                         Float 값 뒤에 f,F를 붙여주므로써 Double과 Float를 구분 할 수 있다 */
        /* 실수형에서는 Float 보다 Double이 자주 쓰인다. */

        // 정수형
        var intValue:Int = 1235468
        var longValue:Long = 2_147_483_647
        var shortValue:Short = 123  // short과 byte는 작은 숫자를 사용 할 때 쓰인다.(하지만 주로 int, long으로 대체됨)
        var byteValue:Byte = 127    // byte는 최대 127까지 가능
        /* 정수형을 가지고 앱을 만들 때 주로 Long을 쓰는 것이 낫다. */

        // 문자형
        var charValue:Char = 'a'
        var stringValue:String = "abcdefg"
        /* char는 ''를 쓰는 문자형으로써 단어 1개만 사용 할 수 있고
         * String은 ""쓰고 크기를 특정 할 수 없다.(String은 기본형이 아니다.) */

        // 불린형
        var booleanValue:Boolean = true
        /* Boolean은 주로 if문에서 분기처리를 할 때 사용된다. */


        // var과 val의 차이점
        //ex)
        var boolean:Boolean = true
        boolean = false
        // var는 값을 변경 할 수 있다.

        val VALVALUE:Boolean = true
        // VALVALUE = false(오류)
        /* val은 상수형으로 지정된 값을 다시 변경 할 수 없고
           상수형을 쓸 때 변수는 대문자로 쓰는 것이 좋다. */

        // 변수 표기법(변수 이름에 단어가 2개이상 들어갈 때)
        // 낙타 표기법
            var helloWorld = "안녕"
            /* 다른 단어를 붙일 때 구분하기 위하여 단어 첫 글자를
             * 대문자로 표기하는 방법 */

        // 뱀 표기법
            var hello_world = "안녕"
            /* 다른 단어를 붙일 때 구분하기 위하여 두 단어 사이에
             * _를 사용하여 표기하는 방법 */
    }
}
