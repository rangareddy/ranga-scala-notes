package com.ranga.scala.collection.set.mutable

import scala.collection.mutable.TreeSet

object TreeSetDemo extends App {

  // creating treeSet
  val treeSet = TreeSet[String]("value2", "value1", "value3");
  val treeSet2 = TreeSet[String]();

  // adding elements to treeSet
  treeSet.add("value4")
  treeSet += "value1"

  printSetValues(treeSet)

  println(s"treeSet size ${treeSet.size}\n")
  println(s"treeSet contains value1 ${treeSet("value1")}")
  println(s"treeSet contains value5 ${treeSet.contains("value5")}")

  // removing elements from treeSet
  treeSet.remove("value3")
  treeSet -= ("value5")

  printSetValues(treeSet)

  def printSetValues(set: collection.mutable.Set[String]): Unit = {
    println("Printing set values ")
    set.foreach(value => println(value))
    println()
  }

}
