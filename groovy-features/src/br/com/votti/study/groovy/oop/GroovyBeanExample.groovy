package br.com.votti.study.groovy.oop

import groovy.transform.ToString

@ToString
class Foo {
    String bar
    String jar

    void setBar(String bar) {
        this.bar = "bar is $bar"
    }

    void setJar(String jar) {
        this.jar = "jar is $jar"
    }

    String getBar(){
        "You have $bar"
    }

    String getJar(){
        "Your have $jar"
    }
}


def foo = new Foo()

foo.bar = "Oh Bar"
foo.@jar = "Oh Jar"

println foo

println foo.bar
println foo.@jar