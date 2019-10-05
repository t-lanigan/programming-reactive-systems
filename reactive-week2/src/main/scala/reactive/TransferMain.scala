package reactive

import akka.actor.Actor
import akka.actor.Props
import akka.event.LoggingReceive

class TransferMain extends Actor {
  // Run configurations:
  // VM options: -Dakka.loglevel=DEBUG -Dakka.actor.debug.receive=on
  // Main Class: akka.Main
  // program arguements: reactive.TransferMain
  // Use classpath of module: reactive-week2
  val accountA = context.actorOf(Props[BankAccount], "accountA")
  val accountB = context.actorOf(Props[BankAccount], "accountB")

  accountA ! BankAccount.Deposit(100)

  def receive = LoggingReceive {
    case BankAccount.Done => transfer(50)
  }

  def transfer(amount: BigInt): Unit = {
    val transaction = context.actorOf(Props[WireTransfer], "transfer")
    transaction ! WireTransfer.Transfer(accountA, accountB, amount)
    context.become(LoggingReceive {
      case WireTransfer.Done =>
        println("success")
        context.stop(self)
      case WireTransfer.Failed =>
        println("failed")
        context.stop(self)
    })
  }
}