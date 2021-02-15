package br.com.votti.study.groovy.builders

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.sports {
    sport(id:1){
        name 'Basketball'
    }
    sport(id:2){
        name 'Football'
    }
    sport(id:3){
        name 'Soccer'
    }
    sport(id:4){
        name 'Voley'
    }
}