package br.com.votti.study.groovy.dates

Date today = new Date()
println today
println "------------------"

Date bday = new Date("12/27/1982")
println bday
println bday.format("M-d-y")
println bday.format("d-M-y")
println "------------------"

Date aWeekAgo = today.minus(7)
Date aWeekFromToday = today.plus(7)
println aWeekAgo
println aWeekFromToday
println "------------------"

aWeekFromToday.downto(today) {
    println it
}
println "------------------"

today.upto(aWeekFromToday){
    println it
}
println "------------------"

Range twoWeeks = aWeekAgo..aWeekFromToday
twoWeeks.each {
    println it
}
println "------------------"

Date newYear = new Date("01/01/2021")
println newYear.next()
println newYear.previous()
println "------------------"

println newYear.toTimestamp()

