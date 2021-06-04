package org.ground.play.common.enums

enum class VirtualCoin(val tickerSymbol: String) {
    BITCOIN("BTC"),
    XRP("XRP"),
    ETHEREUM("ETH"),
    LITECOIN("LTC"),
    BITCOIN_CASH("BCH"),
    TETHER("USDT"),
    DOGECOIN("DOGE"),
    BINANCE_COIN("BNB"),
    UNKNOWN("");

    companion object {
        fun findByName(symbol: String) = values().find { it.tickerSymbol == symbol } ?: UNKNOWN
    }
}