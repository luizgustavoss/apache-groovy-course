package br.com.votti.study.groovy.http

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab(group = "org.codehaus.groovy.modules.http-builder", module = "http-builder", version = "0.7.1")

String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
def params = [firstName: "Mariana", lastName: "de Lima"]

chuck.contentType = ContentType.JSON

chuck.get(path: '/jokes/random', query: params) {response, json ->
    println response.status
    println json
}