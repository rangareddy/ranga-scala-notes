package com.ranga.scala.collection.seq.mutable.linear

import scala.collection.mutable.MutableList

object MutableListDemo extends App {

  // creating MutableList
  val mutableList = MutableList[String]("value1", "value3", "value2", "value4")
  val emptyMutableList = MutableList()

  // adding new element to list
  mutableList += "value4"
  mutableList += ("value5", "value6")

  println(s"mutableList values are ${mutableList}")
  println(s"mutableList(2) value is ${mutableList(2)}")

}
