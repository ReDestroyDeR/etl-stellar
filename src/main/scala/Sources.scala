package ru.red.etl_stellar

import akka.NotUsed
import akka.stream.scaladsl.Source
import stellar.sdk.TestNetwork
import stellar.sdk.model.response.LedgerResponse

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Sources {
  val ledgerSource: Source[LedgerResponse, Future[NotUsed]] = Source.futureSource(
    TestNetwork.ledgers().map(Source(_))
  );
}
