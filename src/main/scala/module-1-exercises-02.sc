case class Employee(name: String, salary: Double)

val getAvgSal = (employees:List[Employee]) => {
  employees.reduce(em)
}

def map[A, B] (fn: A => B, lst: List[A]): List[B] ={
  var bList = List()
  for (lstItem <- lst) {
    fn(lstItem) :: bList
  }
  bList
}