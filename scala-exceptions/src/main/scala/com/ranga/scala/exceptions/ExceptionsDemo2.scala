package com.ranga.scala.exceptions

object ExceptionsDemo2 extends App {
  try {
    println(args(2))
  } catch {

//    case aibe: ArrayIndexOutOfBoundsException => {
//      println("ArrayIndexOutOfBoundsException occurred")
//    }

    case rte: RuntimeException => {
      println("RuntimeException occurred")
    }
    case _: Exception => {
      println("Exception occurred")
    }

  }
}