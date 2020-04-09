package com.ranga.scala.collection.map.mutable

import scala.collection.immutable.HashMap

object HashMapDemo extends App {

  // creating a hashMap
  val hashMap = HashMap[String, String]("key1" -> "value1", "key2" -> "value2", "key3" -> "value3");

  val hashMap2 = collection.mutable.HashMap[Int, String]();

  // printing hashMap values
  printMapValue(hashMap)

  // checking the hashMap size
  println(s"hashMap size ${hashMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${hashMap.get("key2").get}")
  println(s"get(key2) value is ${hashMap("key2")}")

  def printMapValue(map: Map[String, String]): Unit = {
    println("Printing Map values")
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
    println()
  }

}