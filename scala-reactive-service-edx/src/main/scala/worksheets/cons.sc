import models._


val data = JsonData.getData

var numberList = List(1,2,3)

val l3 = List("maths", "english")

val l4 = "maths1" :: "english1" :: Nil

val l5 = "maths1" :: l3

val l6 = l3 ::: l4

val l7 = l4 ++ l3

println(l7)

