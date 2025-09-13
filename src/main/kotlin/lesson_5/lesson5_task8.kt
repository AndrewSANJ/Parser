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

    val quotes = doc.select(".sc-2aegk7-2")

    var number = 1

    for (quote in quotes) {

        println("${number++} - ${quote.text()}")
    }


}