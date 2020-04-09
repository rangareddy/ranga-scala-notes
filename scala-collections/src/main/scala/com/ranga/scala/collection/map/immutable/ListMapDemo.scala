package com.ranga.scala.collection.map.immutable

object ListMapDemo extends App {

  // creating a listMap
  val listMap = collection.mutable.ListMap[String, String]("key1" -> "value1", "key2" -> "value2", "key3" -> "value3");

  // printing listMap values
  printMapValue(listMap)

  println("printing head value " + listMap.head)
  println("printing tail value " + listMap.tail)

  // adding the new values to listMap
  listMap += ("key4" -> "value4")
  listMap.put("key5", "value5")

  // checking the listMap size
  println(s"\nlistMap size ${listMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${listMap.get("key2").get}")
  println(s"get(key2) value is ${listMap("key2")}")

  // removing the value
  println(listMap -= "key4")
  println(listMap.remove("key2"))

  // printing the listMap values after removing elements
  println("\nPrinting Map values After removing elements")
  printMapValue(listMap)

  def printMapValue(map: collection.mutable.Map[String, String]): Unit = {
    println("Printing Map values")
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
    println()
  }

}