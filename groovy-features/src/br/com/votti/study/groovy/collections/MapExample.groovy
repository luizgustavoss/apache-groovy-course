package br.com.votti.study.groovy.collections

def map = [:]

println map.getClass().getName()

lastname = "Last Name"
def person = [name: "Luiz", (lastname): "Stabile de Souza", age: 38]
println person

println person.name
println person.'Last Name'
println person.age

person.email = "luiz@gmail.com"

println person.email

println person