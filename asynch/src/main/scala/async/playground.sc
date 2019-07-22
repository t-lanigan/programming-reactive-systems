import async.Async
import scala.concurrent.duration.DurationInt

import scala.concurrent.{Await, Future}
import scala.util.{Random, Success}

val x = Random.nextInt()
val eventuallyResult =
  Async.transformSuccess(Future.successful(x))
val result =
  Await.ready(eventuallyResult, 100.milliseconds).value.get
