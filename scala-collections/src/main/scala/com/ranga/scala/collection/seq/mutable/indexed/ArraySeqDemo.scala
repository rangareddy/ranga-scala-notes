package com.ranga.scala.collection.seq.mutable.indexed

import scala.collection.mutable

/*
  A collection representing Array[T]. Unlike ArrayBuffer it is always backed by the same underlying Array, therefore it is not growable or shrinkable.
 */

object ArraySeqDemo extends App {

  var arraySeq = mutable.ArraySeq("value1", "value2")
  println(s"arraySeq values $arraySeq")

}
