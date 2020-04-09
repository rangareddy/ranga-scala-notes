package com.ranga.scala.collection.map.immutable

import scala.collection.mutable.TreeMap

object TreeMapDemo extends App {

  // creating a treeMap
  val treeMap = TreeMap[String, String]("key1" -> "value1", "key3" -> "value3", "key2" -> "value2");

  val treeMap2 = TreeMap[Int, String]();

  // printing treeMap values
  printMapValue(treeMap)

  // adding the new values to treeMap
  treeMap.put("key5", "value5")
  treeMap += ("key4" -> "value4")

  // checking the treeMap size
  println(s"\ntreeMap size ${treeMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${treeMap.get("key2").get}")

  // removing the value
  println(treeMap -= "key4")
  println(treeMap.remove("key2"))

  // printing the treeMap values after removing elements
  printMapValue(treeMap)

  def printMapValue(map: collection.mutable.Map[String, String]): Unit = {
    println("\nPrinting Map values")
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
  }

}
