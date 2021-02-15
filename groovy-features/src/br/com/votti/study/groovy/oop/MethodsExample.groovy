package br.com.votti.study.groovy.oop

import groovy.transform.ToString

@ToString
class Person {

    String name
    String lastName

    String getFullName(){
        "$name $lastName"
    }

    // using varargs
    String putNickname(String ... nickname){
        "$name $lastName, nicks: [$nickname]"
    }

    // doesn't matter the return type
    def doSomething(){

    }

}


Person p = new Person(name: "Luiz")
p.lastName = "Stabile"

println p.getFullName()
println p.putNickname("Luizinho", "Guga", "Luizito", "Stabile")

