package br.com.votti.study.groovy.controlstructures


// boolean
assert true
assert !false

// matcher
assert ('a' =~ /a/)
// assert !('a' =~ /a/)

// collection
assert [1]
assert ![]

// map
assert [1:'name']
assert ![:]

// string
assert 'a'
assert !""

// number
assert 1
assert 3.5
//assert 0

// objects
assert new Object()
//assert !null


println "Luiz" ?: "Stabile"
println "" ?: "Stabile"

def num = 5

switch(num){
    case 1..5 :
        println "between 1 and 5"
        break
    case 6 :
        println "six"
        break
    case 7..10 :
        println "between 7 and 10"
        break
    default :
        println "other"
}