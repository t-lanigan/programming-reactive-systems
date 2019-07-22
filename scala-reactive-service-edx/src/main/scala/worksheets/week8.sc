println("Welcome to the scala worksheet")

val f: String => String = {
  case "ping" => "pong"
  case "pong" => "cbd"
  case "hello" => "goodbye"
}

val f2: PartialFunction[String, String] = {
  case "ping" => "pong"
  case "pong" => "cbd"
  case "hello" => "goodbye"
}

val f3: PartialFunction[List[Int], String] = {
  case Nil => "one"
  case x :: y :: rest => rest.toString()
}
f("ping")
f("pong")

f2.isDefinedAt("test")
f2.isDefinedAt("pong")

f3(List(1,2,3))

f3.isDefinedAt(List(1))

