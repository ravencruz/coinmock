package org.ground.play.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import org.ground.play.common.enums.VirtualCoin

@Controller("/coin")
class CoinController {

    @Get(uri = "/delay/{symbol}")
    @Produces(MediaType.TEXT_PLAIN)
    fun mockGetPriceOf(symbol: String): Float {
        Thread.sleep(1000)

        return when (VirtualCoin.findByName(symbol.toUpperCase())) {
            VirtualCoin.BITCOIN -> 37811.92f
            VirtualCoin.XRP -> 0.9948f
            VirtualCoin.ETHEREUM -> 2737.38f
            VirtualCoin.LITECOIN -> 182.92f
            VirtualCoin.BITCOIN_CASH -> 688.66f
            VirtualCoin.TETHER -> 1.0f
            VirtualCoin.BINANCE_COIN -> 406.59f
            VirtualCoin.DOGECOIN -> 0.384f
            VirtualCoin.UNKNOWN -> 0f
        }
    }

}