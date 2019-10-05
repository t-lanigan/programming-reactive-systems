package actors

import akka.actor.Actor

class Counter extends Actor {
  var count = 0

  def receive= {
    case "incr" => count = count +1
    case "get" => sender ! count
  }

}
