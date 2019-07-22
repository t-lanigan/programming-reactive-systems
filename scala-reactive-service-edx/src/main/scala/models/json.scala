package models

abstract class JSON
case class JSeq (elems: List[JSON])           extends JSON
case class JObj (bindings: Map[String, JSON]) extends JSON
case class JNum (num: Double)                 extends JSON
case class JStr (str: String)                 extends JSON
case class JBool (b: Boolean)                 extends JSON
case object JNull                             extends JSON

object JsonData {
  def getData: JObj = {
    JObj(Map(
      "firstName" -> JStr("John"),
      "lastName" -> JStr("Smith"),
      "address" -> JObj(Map(
        "streetAdress" -> JStr("21 2nd Street"),
        "state" -> JStr("NY"),
        "postalCode" -> JNum(10021)
      )),
      "phoneNumbers" -> JSeq(List(
        JObj(Map(
          "type" -> JStr("home"), "number" -> JStr("212 555-1234")
        )),
        JObj(Map(
          "type" -> JStr("fax"), "number" -> JStr("646 555-4567")
        ))
      ))
    ))
  }
  def showJSON(json: JSON): String = json match {
    case JSeq(elems) => "[" + (elems map showJSON mkString ", ") + "]"
    case JObj(bindings) => val assocs = bindings map {
      case (key, value) => "\"" + key + "\": " + showJSON(value)

    }
      "{" + (assocs mkString ", ") + "}"
    case JNum(num) => num.toString
    case JStr(str) => '\"' + str + '\"'
    case JBool(b) => b.toString
    case JNull => "null"
  }

}
