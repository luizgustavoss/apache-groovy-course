package br.com.votti.study.groovy.grapes

import org.apache.commons.lang3.text.WordUtils

@Grapes(
        @Grab(group = "org.apache.commons", module = "commons-lang3", version = "3.4")
)


String name = "Luiz Gustavo Stábile de Souza"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)