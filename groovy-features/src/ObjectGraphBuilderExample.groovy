

import groovy.transform.ToString

@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter {
    String title
}


def builder = new ObjectGraphBuilder()

def book = builder.book(
        title: "Clean Code",
        summary: "Write better code"){
    section(title: "Section 1"){
        chapter(title: "Chapter 1")
        chapter(title: "Chapter 2")
        chapter(title: "Chapter 3")
    }
    section(title: "Section 2"){
        chapter(title: "Chapter 4")
        chapter(title: "Chapter 5")
    }
}

println book

assert book.title == "Clean Code"
assert book.sections.size() == 2
assert book.sections[0].chapters.size() == 3
assert book.sections[1].chapters.size() == 2