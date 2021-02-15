package br.com.votti.study.groovy.collections

def numsList = [1, 2, 3, 4, 5, 6, 7, 8, 9]
println numsList.class.name
println numsList

numsList.push(50)
numsList.add(12)
numsList << 11
numsList.putAt(3, 18)
numsList[5] = 29

println numsList
println " "

numsList.pop()
numsList.removeAt(5)

println numsList

def numsLinkedList = [1, 2, 3, 4, 5, 6, 7, 8, 9] as LinkedList
println numsLinkedList.class.name
println numsLinkedList

println " "

numsLinkedList.each { println it }

println " "

numsLinkedList.eachWithIndex { entry, i ->
    println "$i:$entry"
}

println " "

def weekDays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
def weekend = weekDays.findAll { it.startsWith("S") }

println weekDays
println weekend

println " "

def multiple = numsLinkedList.collect { num -> num * 10 }

println numsLinkedList
println multiple

println " "