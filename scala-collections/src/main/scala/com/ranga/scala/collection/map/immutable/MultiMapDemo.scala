package com.ranga.scala.collection.map.immutable

import scala.collection.mutable.{HashMap, MultiMap, Set}

/*
    trait MultiMap[A, B] extends Map[A, Set[B]] {

    }
 */

object MultiMapDemo extends App {

  // creating a multiMap using HashMap
  val multiMap = new HashMap[String, Set[String]] with MultiMap[String, String]

  // adding values to multiMap using addBinding()
  multiMap.addBinding("key1", "value1")
  multiMap.addBinding("key2", "value2")
  multiMap.addBinding("key3", "value3")
  multiMap.addBinding("key1", "anotherValue1")
  multiMap.addBinding("key1", "anotherValue2")
  multiMap.addBinding("key2", "new_value2")

  // iterating values
  multiMap.foreach(multiMapValue => println(multiMapValue._1 + " : " + multiMapValue._2.toList))

  // removing key from multiMap using removeBinding()
  multiMap.removeBinding("key1", "anotherValue1")

  println(multiMap.entryExists("key1", _ == "anotherValue1"))
  println(multiMap.entryExists("key1", _ == "value1"))

  println(multiMap)

}
