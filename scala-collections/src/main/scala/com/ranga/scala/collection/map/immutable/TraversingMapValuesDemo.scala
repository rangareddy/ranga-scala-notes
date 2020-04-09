package com.ranga.scala.collection.map.immutable

object TraversingMapValuesDemo extends App {

  val hashMap = collection.mutable.HashMap[String, String]("key1" -> "value1",
    "key2" -> "value2", "key3" -> "value3", "key4" -> "value4", "key5" -> "value5");

  printMapValue(hashMap)

  // Traversing a Map
  def printMapValue(map: collection.mutable.Map[String, String]): Unit = {

    // foreach and tuples
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
    println()

    // foreach and case
    map.foreach { case (key, value) => println(s"$key : $value") }
    println()

    // for loop
    for ((key, value) <- map) println(s"$key : $value")
    println()

    // using keys
    map.keys.foreach(key => println(key + " : " + map.get(key)))
    println()

    // using values
    map.values.foreach(value => println(value))
  }
}