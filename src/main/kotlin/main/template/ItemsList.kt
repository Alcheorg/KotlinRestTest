package main.template

import kotlinx.html.*
import kotlinx.html.stream.appendHTML

fun getItems() : String
{
    val result = StringBuilder()
    result.appendHTML().link {
        rel  = "stylesheet"
        type = "text/css"
        href = "css/main.css"
    }

    result.appendHTML().html {
        style = "css/main.css"
        body {
            table {
                classes = setOf("tableKt")
                for (i in (1..10)) {
                    tr {
                        td {
                            +"one"
                        }
                        td {
                            +"two"
                        }
                        td {
                            +"three"
                        }
                        td {
                            +"four"
                        }
                    }
                }
            }
        }
    }

    return result.toString()
}