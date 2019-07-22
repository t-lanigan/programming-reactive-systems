// Scala program to illustrate
// the concept of abstract class

// Abstract class with fields
abstract class Geek
{
  var name : String = "GeeksforGeeks"
  var tutorial: String = "Scala"
  def portal()
}

// GFG class extends abstract class
class GFG extends Geek
{

  // Abstract class method accessing
  // fields of the abstract class
  def portal()
  {
    println("Portal name: " + name)

  }

  // GFG class method accessing
  // fields of the abstract class
  def tutdetails()
  {
    println("Tutorial name: " + tutorial)
  }
}

var obj = new GFG()
obj.portal()
obj.tutdetails()



