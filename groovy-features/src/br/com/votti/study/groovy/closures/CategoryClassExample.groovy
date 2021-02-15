package br.com.votti.study.groovy.closures

import groovy.time.TimeCategory

use(TimeCategory) {

    println 1.minute.from.now
    println 10.hour.ago

    def someDate = new Date()
    println someDate -3.months
}