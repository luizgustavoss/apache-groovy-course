package br.com.votti.study.groovy.metaprogramming


class InvokeDemo {

    def invokeMethod(String name, Object args){
        "called invokeMethod $name $args"
    }

    def test(){
        "method test() exists"
    }
}

def invokeDemo = new InvokeDemo()

println invokeDemo.test()
println invokeDemo.someMethod("zambas")