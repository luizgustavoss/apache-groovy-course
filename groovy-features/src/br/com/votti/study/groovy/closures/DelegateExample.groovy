package br.com.votti.study.groovy.closures

def writer = {
    println greet()
}

writer.delegate = new Greeter()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer()

String greet(){
    return "Hello from class!"
}

class Greeter {

    String greet(){
        return "Hello from greeter!"
    }
}