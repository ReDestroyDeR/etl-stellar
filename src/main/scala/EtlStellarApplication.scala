package ru.red.etl_stellar

import akka.actor.ActorSystem

object EtlStellarApplication extends App {
  implicit val system = ActorSystem("stellar-sources")
  import scala.concurrent.ExecutionContext.Implicits.global


}
