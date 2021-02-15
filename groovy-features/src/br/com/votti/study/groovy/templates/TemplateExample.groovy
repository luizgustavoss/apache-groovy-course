package br.com.votti.study.groovy.templates

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

SimpleTemplateEngine engine = new SimpleTemplateEngine()
Template template = engine.createTemplate(new File("dynamic-email.txt"))

Map bindings = [
        firstname: "Luiz",
        lastname: "Stabile",
        commits: 130,
        repositories: [
                [name: "Money Count Groovy", url: "https://github.com/luizgustavoss/money-count-groovy"],
                [name: "Money Count Java", url: "https://github.com/luizgustavoss/money-count-java"],
                [name: "Money Count Golang", url: "https://github.com/luizgustavoss/money-count-golang"]
        ]
]

println template.make(bindings)