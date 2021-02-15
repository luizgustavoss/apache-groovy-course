package br.com.votti.study.groovy.builders

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {

    book {
        title "Clean Architecture"
        isbn "234-234-65432-4"
        author "Robert Martin"
        related "Clean Code"
    }
}

println builder.toPrettyString()