package br.com.votti.study.groovy.datatypes

20.times {
    print '-'
}
println ''

1.upto(10){ num ->
    println num
}

20.times {
    print '-'
}
println ''

10.downto(1){num ->
    println num
}

20.times {
    print '-'
}
println ''

0.step(1, 0.1){ num ->
    println num
}
println ''

def name = 'Luiz'

String messageWithoutInterpolation = 'Nome ${name}'
println messageWithoutInterpolation

String messageWithInterpolation = "Nome ${name}"
println messageWithInterpolation

String longMessageWithoutInterpolation = ''' 
Long 
Message
Without
Interpolation
Nome ${name}
'''
println longMessageWithoutInterpolation

String longMessageWithInterpolation = """ 
Long
Message
With
Interpolation
Nome ${name}
"""
println longMessageWithInterpolation

def exampleOfDollarEscape = $/C:\some\weird\path\to\file/$
println exampleOfDollarEscape