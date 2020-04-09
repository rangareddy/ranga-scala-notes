package com.ranga.scala.collection.map.immutable

object LinkedHashMapDemo extends App {

  // creating a linkedHashMap
  val linkedHashMap = collection.mutable.LinkedHashMap[String, String]("key1" -> "value1", "key2" -> "value2", "key3" -> "value3");

  val linkedHashMap2 = collection.mutable.LinkedHashMap[Int, String]();

  // printing linkedHashMap values
  println("Printing Map values")
  printMapValue(linkedHashMap)

  // adding the new values to linkedHashMap
  linkedHashMap += ("key4" -> "value4")
  linkedHashMap.put("key5", "value5")

  // checking the linkedHashMap size
  println(s"\nlinkedHashMap size ${linkedHashMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${linkedHashMap.get("key2").get}")

  // removing the value
  println(linkedHashMap -= "key4")
  println(linkedHashMap.remove("key2"))

  // printing the linkedHashMap values after removing elements
  println("\nPrinting Map values After removing elements")
  printMapValue(linkedHashMap)

  def printMapValue(map: collection.mutable.Map[String, String]): Unit = {
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
  }

}