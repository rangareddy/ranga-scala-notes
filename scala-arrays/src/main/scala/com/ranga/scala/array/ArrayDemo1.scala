package com.ranga.scala.array

object ArrayDemo1 extends App {

  // declare int array
  val intArray: Array[Int] = new Array[Int](3)

  //declare String array
  val stringArray = new Array[String](5);

  // assigning values to intArray
  intArray(0) = 123
  intArray(1) = 11
  intArray(2) = 210

  // assigning values to stringArray
  stringArray(0) = "Ranga"
  stringArray(1) = "Reddy"
  stringArray(2) = "Nishanth"
  stringArray(3) = "Raja"

  // accessing intArray values
  println(intArray(0))
  println(intArray(2))

  // accessing stringArray values
  println(stringArray(1))
  println(stringArray(3))

}