// sum() returns a function that takes two integers and returns an integer
def sum(f: Int => Int): (Int, Int) => Int = {
  def sumf(a: Int, b: Int): Int = a + b
  sumf
}

def cube(x: Int) = x * x * x
sum(cube)(1, 13)

val list = List(1,2,3)


def doubleValue(x: Int): Int = {
  x*2
}


val doubledList = list.map(x => doubleValue(x))


List(1,2,3) map (x => x + 1)