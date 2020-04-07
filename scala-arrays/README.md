# Scala Arrays Demo

#### Way1: Declaring, Assigning and Accessing an Array values
 ```scala  
package com.ranga.scala.array

object ArrayDemo1 extends App {

  // declare int array
  val intArray: Array[Int] = new Array[Int](3)

  //declare String array
  val stringArray = new Array[String](5);

  // assigning values to intArray
  intArray(0) = 123
  intArray(1) = 11
  intArray(2) = 210

  // assigning values to stringArray
  stringArray(0) = "Ranga"
  stringArray(1) = "Reddy"
  stringArray(2) = "Nishanth"
  stringArray(3) = "Raja"

  // accessing intArray values
  println(intArray(0))
  println(intArray(2))

  // accessing stringArray values
  println(stringArray(1))
  println(stringArray(3))
  
}
```

#### Way2: Declaring, Assigning and Accessing an Array values
 ```scala 
package com.ranga.scala.array

object ArrayDemo2 extends App {

  // declare and initialize int array
  val intArray: Array[Int] = Array[Int](3, 4, 5)
  println(intArray(0))
  println(intArray(1))
  println(intArray(2))

  //declare and initialize String array
  val stringArray = Array[String]("Ranga", "Reddy", "Reddy", "Nishanth", "Raja");

  // accessing array values
  println(stringArray(1))
  println(stringArray(3))
}
```

#### Way3: Declaring, Assigning and Accessing Array values using ArrayBuffer
```scala
package com.ranga.scala.array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo extends App {
  val arrayBuffer = new ArrayBuffer[String]()

  // adding one element
  arrayBuffer += "ranga"
  arrayBuffer += "yasu"

  // add one or more elements using +=
  arrayBuffer += ("reddy", "nishanth")

  // adding one or more element using append method
  arrayBuffer.append("raja", "vinod", "manoj")

  println(s"Array length ${arrayBuffer.length}")

  println("\nprinting arrayBuffer values using foreach()")
  arrayBuffer.foreach(println)

  println("\nprinting arrayBuffer values using for()")
  for (i <- 0 until arrayBuffer.length) {
    println(arrayBuffer(i))
  }

  // deletes one element using value
  arrayBuffer -= "vinod"

  // deletes one or more element using value
  arrayBuffer -= ("yasu", "manoj")

  // deletes one element using index
  arrayBuffer.remove(3)

  // deletes two or more element using index
  arrayBuffer.remove(1,2)

  println("\nprinting arrayBuffer values after removing")
  println(arrayBuffer)
  
}

```
