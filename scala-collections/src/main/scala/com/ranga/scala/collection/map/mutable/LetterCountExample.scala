package com.ranga.scala.collection.map.mutable
import collection.mutable.HashMap

object LetterCountExample extends App {
  var word = "hello i am Ranga reddy"
  var chars : Array[Char] = word.toCharArray
  var letterCountMap = new HashMap[Char, Int]()
  for(value <- chars) {
    val mapValue = letterCountMap.get(value).getOrElse(0).toInt
    letterCountMap.put(value, mapValue + 1)
  }
  println(letterCountMap)
}
