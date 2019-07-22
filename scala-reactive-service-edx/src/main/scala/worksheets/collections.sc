case class Person(firstName: String, lastName: String)

val people = List(
  Person("barney", "rubble"),
  Person("fred", "flintstone"),
  Person("bob", "ross"),
  Person("chuck", "barry"),
  Person("the", "dude")
)

val namesStartingWithB = for {
  p <- people                  // generator
  fname = p.firstName          // definition
  if fname startsWith "b"    // filter
} yield fname.toUpperCase



