package com.ranga.scala.exceptions

object ExceptionsDemo1 extends App {
  try {
    val str = null
    println(str.toString)

  } catch {
    case npe: NullPointerException => println("NullPointerException occurred")
  }
}