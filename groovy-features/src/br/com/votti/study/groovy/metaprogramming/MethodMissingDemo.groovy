package br.com.votti.study.groovy.metaprogramming


class MethodMissing {

    def methodMissing(String name, def params){
        println "Mehtod missing called on: $name"
        println "with arguments: $params"
    }
}

def mm = new MethodMissing()
mm.someMethod("bla", "zambas", 1, 2, 3)
