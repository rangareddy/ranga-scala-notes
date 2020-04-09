package com.ranga.scala.collection.map.immutable

object HashMapDemo extends App {

  // creating a hashMap
  val hashMap = collection.mutable.HashMap[String, String]("key1" -> "value1", "key2" -> "value2", "key3" -> "value3");

  val hashMap2 = collection.mutable.HashMap[Int, String]();

  // printing hashMap values
  printMapValue(hashMap)

  // adding the new values to hashMap
  hashMap += ("key4" -> "value4")
  hashMap.put("key5", "value5")
  hashMap.put(null, "nullValue")
  hashMap.put("key6", null);

  // checking the hashMap size
  println(s"\nhashMap size ${hashMap.size}")

  // retrieving the value based on key2
  println(s"get(key2) value is ${hashMap.get("key2").get}")
  println(s"get(key2) value is ${hashMap("key2")}")

  // removing the value
  println(hashMap -= "key4")
  println(hashMap.remove("key2"))

  // printing the hashMap values after removing elements
  printMapValue(hashMap)

  def printMapValue(map: collection.mutable.Map[String, String]): Unit = {
    println("Printing Map values")
    map.foreach(mapValue => println(mapValue._1 + " : " + mapValue._2))
    println()
  }

}