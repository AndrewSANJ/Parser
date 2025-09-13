package org.example.lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val doc: Document = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/" +
                "avtostopom-po-galaktike-restoran-u-konca-vselennoj/" +
                "citations/"
    ).get()

    println("Цитаты с первой страницы: ")

    val quotes = doc.select("article div div div")

    quotes.forEachIndexed { i, e ->
        println("${i + 1} - ${e.text()}")
    }


}