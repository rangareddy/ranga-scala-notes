package com.ranga.scala.collection.seq.mutable.indexed

import scala.collection.mutable.StringBuilder

object StringBuilderDemo extends App {

  val stringBuilder = new StringBuilder("Hello ")

  // Appending value(s) to StringBuilder
  stringBuilder += 'I'
  stringBuilder ++= " am Ranga"

  println(s"stringBuilder value is $stringBuilder")

  // converting StringBuilder to String
  val string = stringBuilder.toString
  println(s"string value is $string")
}
