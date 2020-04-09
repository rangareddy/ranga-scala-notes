package com.ranga.scala.collection.map.mutable

import scala.collection.immutable.ListMap

object ListMapDemo extends App {

  // creating a listMap
  val listMap = ListMap[String, String]("key1" -> "value1", "key2" -> "value2", "key3" -> "value3");

  // printing listMap values
  printMapValue(listMap)

  // checking the listMap size
  println(s"\nlistMap size ${listMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${listMap.get("key2").get}")
  println(s"get(key2) value is ${listMap("key2")}")

  def printMapValue(map: Map[String, String]): Unit = {
    println("Printing Map values")
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
    println()
  }

}