# Scala Collections Demos

### Scala Collections High Level API(scala.collection)

![Scala Collection High Level API](https://www.scala-lang.org/docu/files/collections-api/collections.png)

* Traversable
    * Iterable
        * Seq
            * IndexedSeq
            * LinearSeq
        * Set
            * SortedSet
            * BitSet
        * Map
            * SortedMap
    
##### Scala Collections Low Level Immutable API (scala.collection.immutable)

![Scala Collection Low Level Immutable API](https://www.scala-lang.org/docu/files/collections-api/collections.immutable.png)

* Seq
    * IndexedSeq
        * Vector 
        * NumericRange 
        * Array 
        * String 
        * Range
    * LinearSeq
        * List 
        * Stream 
        * Queue 
        * Stack
* Set
    * HashSet
    * SortedSet
        * TreeSet
    * BitSet
    * ListSet
* Map
    * HashMap
    * SortedMap
        * TreeMap
    * ListMap

##### Scala Collections Low Level Mutable API (scala.collection.mutable)

![Scala Collection Low Level Mutable API](https://www.scala-lang.org/docu/files/collections-api/collections.mutable.png)

* Seq
    * Stack
        * SynchronizedStack
    * ArrayStack
    * PriorityQueue
        * SynchronizedPriorityQueue
    * IndexedSeq 
        * ArraySeq 
        * StringBuilder 
        * ArrayBuffer
    * LinearSeq
        * MutableList
            * Queue
                * SynchronizedQueue
        * LinkedList 
        * DoubleLinkedList
    * Buffer
        * ArrayBuffer
        * ListBuffer
        * ObservableBuffer
        * SynchronizedBuffer
* Set
    * HashSet
    * SortedSet
        * TreeSet
    * BitSet
    * ObservableSet 
    * SynchronizedSet
    * LinkedHashSet
    * ImmutableSetAdopter
* Map
    * HashMap 
    * WeekHashMap 
    * OpenHashMap 
    * LinkedHashMap 
    * ObservableMap 
    * SynchronizedMap 
    * MultiMap 
    * ImmutableMapAdopter
    * SortedMap
        * TreeMap
    * ListMap