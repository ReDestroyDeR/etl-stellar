package ru.red.etl_stellar
package network

import okhttp3.HttpUrl
import stellar.sdk.inet.{HorizonAccess, OkHorizon}
import stellar.sdk.{FriendBot, Network}

// Doesn't work with SDK extractor since target url returns html
case object StexpNetwork extends Network with FriendBot {
  override val passphrase = "Test STEXP Network ; November 2022"
  override val horizon: HorizonAccess = new OkHorizon(
    HttpUrl.parse("https://testnet.steexp.com/"))
}
