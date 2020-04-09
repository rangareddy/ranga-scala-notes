package com.ranga.scala.collection.seq.immutable.linear

import scala.collection.immutable.List

object ListDemo extends App {

  var list1 = List[String]("value1", "value3", "value2", "value4")
  var list2 = List("value5")

  printListValues(list1)

  // adding new element to list
  var newList1 = list1 :+ "value4"
  printListValues(newList1)

  // merging lists
  var mergeList = newList1 ++ list2
  printListValues(mergeList)

  // reversing list
  var reverseList = mergeList.reverse
  printListValues(reverseList)

  // sorting list
  var sortedList = mergeList.sorted
  printListValues(sortedList)

  private def printListValues(list: List[String]) = {
    println("\nPrinting list values")
    list.foreach(value => println(value))
  }
}
