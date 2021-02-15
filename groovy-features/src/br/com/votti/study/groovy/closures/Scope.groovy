package br.com.votti.study.groovy.closures

class ScopeDemo {

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()