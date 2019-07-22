import models._


val dataList: List[JObj] = List(JsonData.getData)
val data: JObj = JsonData.getData
val map_test: Map[String,Int] = Map("1" -> 1, "2" -> 1)


map_test("2")

dataList

val t = for {
  JObj(bindings) <- dataList
  JSeq(phones) = bindings("phoneNumbers")
  JObj(phone) <- phones
  JStr(digits) = phone("number")
  if digits startsWith "212"
} yield (bindings("firstName"), bindings("lastName"))


JsonData.showJSON(t(0)._1)



