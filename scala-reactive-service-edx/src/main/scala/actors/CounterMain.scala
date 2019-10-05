package actors

import akka.actor.{Actor, Props}

class CounterMain extends Actor {

  def main(args: Array[String]): Unit = {
    val counter = context.actorOf(Props[Counter], "counter")

    counter ! "incr"
    counter ! "incr"
    counter ! "incr"
    counter ! "get"
  }


  def receive = {
    case count: Int =>
      println(s"count was $count")
      context.stop(self)
  }
}


