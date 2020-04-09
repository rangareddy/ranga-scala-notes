package com.ranga.scala.collection.set.mutable

import scala.collection.mutable.LinkedHashSet

object LinkedHashSetDemo extends App {

  // creating linkedHashSet
  val linkedHashSet = LinkedHashSet[String]("value1", "value2", "value3");
  val linkedHashSet2 = new LinkedHashSet[String]();

  // adding elements to linkedHashSet
  linkedHashSet.add("value4")
  linkedHashSet += "value1"

  printSetValues(linkedHashSet)

  println(s"linkedHashSet size ${linkedHashSet.size}\n")
  println(s"linkedHashSet contains value1 ${linkedHashSet("value1")}")
  println(s"linkedHashSet contains value5 ${linkedHashSet.contains("value5")}")

  // removing elements from linkedHashSet
  linkedHashSet.remove("value3")
  linkedHashSet -= ("value5")

  printSetValues(linkedHashSet)

  def printSetValues(set: collection.mutable.Set[String]): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
