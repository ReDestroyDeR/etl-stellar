package ru.red.etl_stellar
package actor

object ExtractorActor {
  sealed trait ExtractorProtocol
  final case class ExtractLedgers(startSequenceNumber: Int, endSequenceNumber: Int)

  sealed trait ExtractorState
  final case class Batch() extends ExtractorState
  final case class RealTime() extends ExtractorState
  final case class Idle() extends ExtractorState
}
