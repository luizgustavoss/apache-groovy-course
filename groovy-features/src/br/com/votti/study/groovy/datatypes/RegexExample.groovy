package br.com.votti.study.groovy.datatypes

String slashyString = /a\b/
String dollarString = $/http://somegreatsite.com/home/$

def slashyStringPattern = ~slashyString
println slashyStringPattern.class

def dollarStringPattern = ~dollarString
println dollarStringPattern.class

def text = "Some aleatory string just to put Hello World in that!"
def pattern = $/Hello World/$
def finder = text =~ pattern

println finder
println finder.size()

def exactText = "Holy Diver"
def exactPattern = "Holy Diver"
def matcher = exactText ==~ exactPattern

println matcher