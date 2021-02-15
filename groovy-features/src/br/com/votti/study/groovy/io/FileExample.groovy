package br.com.votti.study.groovy.io

/*
def file = new File("dummy.txt")

file.write("Some crazy text here \n")

file.append("some other crazy thing here \n")

List lines = file.readLines()

lines.forEach({ line ->
    println line
})
 */

/*
String downloads = '/home/luiz/Downloads'

new File(downloads).eachFileRecurse { file ->
    if( file.isFile() && file.name.endsWith('.pdf'))
        println file.name
}
 */

/*
List dirs = []
List hidden = []

String home = '/home/luiz'
new File(home).eachFile({file ->

    if(file.isDirectory())
        dirs << file.name

    if(file.isHidden())
        hidden << file.name
})

println dirs
println hidden
 */

println "Enter you name:"
String name
System.in.withReader { reader ->
    name = reader.readLine()
}

println "Your name is: $name"
