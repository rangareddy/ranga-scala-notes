package com.ranga.scala.exceptions

object ExceptionsDemo3 extends App {

  try {
    println("try block")
    val str = null
    println(str.toString)
  } catch {
    case npe: NullPointerException => {
      println("catch block")
      println("NullPointerException occurred")
    }
  } finally {
    println("finally block")
  }
}