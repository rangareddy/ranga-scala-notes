package com.ranga.scala.array

object ArrayDemo2 extends App {

  // declare and initialize int array
  val intArray: Array[Int] = Array[Int](3, 4, 5)
  println(intArray(0))
  println(intArray(1))
  println(intArray(2))

  //declare and initialize String array
  val stringArray = Array[String]("Ranga", "Reddy", "Reddy", "Nishanth", "Raja");

  // accessing array values
  println(stringArray(1))
  println(stringArray(3))
}
