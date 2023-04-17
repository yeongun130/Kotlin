package com.example.kotlin

class Chapter09 {

    fun main() {
        studyRun()
    }

    // 스코프 함수
    // run, let, apply, also
    // run과 let은 내가 실행한 변수와 상관 없이 마지막 값이 반환된다.
    // apply와 also는 마지막 코드에 상관 없이 내가 스코프 함수로 돌린 변수의 값을 그대로 반환한다.
    // with
    
    fun studyRun() {
        val phones = mutableListOf("010-1234-5678","010-3456-8978","010-4587-1345")
        val list = mutableListOf(1,2,3,4,5,6,7,8,9) 
        val names = mutableListOf("Scott","Kelly","Michael")

        val seoulPeople = SeoulPeople()

        val resultRun = seoulPeople.persons.run {
            add(person("Scott","010-1234-5678",22))
            add(person("Scott","010-1234-5678",22))
            add(person("Scott","010-1234-5678",22))
        }

        val resultLet = seoulPeople.persons.let { persons ->
            persons.add(person("Scott","010-1234-5678",22))
            persons.add(person("Scott","010-1234-5678",22))
            persons.add(person("Scott","010-1234-5678",22))
        }

        val resultApply = seoulPeople.persons.apply {
            add(person("Scott","010-1234-5678",22))
            add(person("Scott","010-1234-5678",22))
            add(person("Scott","010-1234-5678",22))
            11
        }

        println("resultApply = $resultApply")

        val resultAlso = seoulPeople.persons.also { persons ->
            persons.add(person("Scott","010-1234-5678",22))
            persons.add(person("Scott","010-1234-5678",22))
            persons.add(person("Scott","010-1234-5678",22))
            12
        }
    }
}

class SeoulPeople {
    var persons = mutableListOf<person>()
    init {
        persons.add(person("Scott","010-1234-5678",19))
        persons.add(person("Kelly","010-3456-8978",20))
        persons.add(person("Michael","010-4587-1345",21))
    }
}

data class person (
    var name:String = "",
    var phone:String = "",
    var age:Int = 21
)
