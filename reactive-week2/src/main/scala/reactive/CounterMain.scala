package reactive

import akka.actor.Actor
import akka.actor.Props

class CounterMain extends Actor {

  // To run this file as is, you need to make a new run configuration with making class akka.Main and
  // run arguements reactive.CounterMain. Don't forget to set the calsspath of module (reactive week-2)
  val counter = context.actorOf(Props[Counter], "counter")

  counter ! "incr"
  counter ! "incr"
  counter ! "incr"
  counter ! "incr"
  counter ! "get"

  def receive = {
    case count: Int ⇒
      println(s"count was $count")
      context.stop(self)
  }
}