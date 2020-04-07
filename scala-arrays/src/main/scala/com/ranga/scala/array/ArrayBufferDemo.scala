package com.ranga.scala.array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo extends App {

  val arrayBuffer = new ArrayBuffer[String]()

  // adding one element
  arrayBuffer += "ranga"
  arrayBuffer += "yasu"

  // add one or more elements using +=
  arrayBuffer += ("reddy", "nishanth")

  // adding one or more element using append method
  arrayBuffer.append("raja", "vinod", "manoj")

  println(s"Array length ${arrayBuffer.length}")

  println("\nprinting arrayBuffer values using foreach()")
  arrayBuffer.foreach(println)

  println("\nprinting arrayBuffer values using for()")
  for (i <- 0 until arrayBuffer.length) {
    println(arrayBuffer(i))
  }

  // deletes one element using value
  arrayBuffer -= "vinod"

  // deletes one or more element using value
  arrayBuffer -= ("yasu", "manoj")

  // deletes one element using index
  arrayBuffer.remove(3)

  // deletes two or more element using index
  arrayBuffer.remove(1, 2)

  println("\nprinting arrayBuffer values after removing")
  println(arrayBuffer)

}
