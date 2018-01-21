val x = 5

val squareOf = (x:Int) => x*x
squareOf(5)
squareOf(x)


//val squareOfList = x.map(squareOf

val myList = List(1,2,3,4)

myList.map((x:Int) => x*x)

val str = "Name"

val countryToCapitals = (cl: List[String]) => {
  cl.map(c => {
    if ( c == "Egypt" ) "Cairo"
    else if ( c == "India" ) "New Delhi"
    else if ( c == "UK" ) "London"
   })
}

countryToCapitals(List("India", "UK"))

countryToCapitals(List("Pakistan"))

val evenNumbersFilter = (nl: List[Int]) => {
  nl.filter(n => if (n%2 == 0) true else false)
}

evenNumbersFilter(List(1,2,3,4))

val sumOfNumbers = (nl: List[Int]) => {
  nl.reduce((a, n) => a + n)
}

sumOfNumbers(List(1,2,3))

case class SphericalCoordinates(r: Double, p:Double, t:Double)



case class Person(name: String, age: Int)

val persons = List(
  Person("A", 1),
  Person("B", 2),
  Person("C", 3))

val moreThan2Age = persons.filter(p => p.age > 2)



def map[A, B](fn: A => B, lst: List[A]): List[B] = {
  var bList = List[B]()
  for(item <- lst) {
    bList = bList :+ fn(item)
  }
  bList
}


var nums = 1 :: 2 :: 3 :: Nil

def map[A, B](fn: A => B, lst: List[A]): List[B] = {
  match lst {
    case Nil => Nil
    case a :: b =>  map(fn, b)
  }
}





















