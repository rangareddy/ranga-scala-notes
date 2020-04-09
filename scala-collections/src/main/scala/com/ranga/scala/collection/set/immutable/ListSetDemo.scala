package com.ranga.scala.collection.set.immutable

import scala.collection.immutable.ListSet

object ListSetDemo extends App {

  // creating listSet
  val listSet = ListSet[String]("value1", "value2", "value3");
  val listSet2 = new ListSet[String]();

  printSetValues(listSet)
  println(s"listSet size ${listSet.size}\n")
  println(s"listSet contains value3 ${listSet("value3")}")
  println(s"listSet contains value4 ${listSet.contains("value4")}")

  def printSetValues(set: collection.immutable.Set[String]): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
