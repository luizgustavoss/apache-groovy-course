package br.com.votti.study.groovy.closures


def sayHello = { name ->
    println "Hello ${name}"
}

sayHello("Luiz")

nums = [1, 2, 3, 4, 5, 6]
nums.each { println it }

def operation(num1, num2, closure){
    println closure(num1, num2)
}

def sum = {a, b ->  a + b }
def multiply = {a, b ->  a * b }
def subtract = {a, b ->  a - b }
def divide = {a, b ->  a / b }

operation(2, 5, sum)
operation(2, 5, multiply)
operation(2, 5, subtract)
operation(2, 5, divide)

def acceptNoParams = { ->
    println "no params allowed"
}

acceptNoParams()


def varArg = { String... arg ->
    arg.join(" ")
}

println varArg("Luiz", "Gustavo", "Stábile", "de", "Souza")