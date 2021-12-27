package com.yongjincompany.moneyconverter.main

import com.yongjincompany.moneyconverter.data.models.MoneyResponse
import com.yongjincompany.moneyconverter.util.Resource

interface MainRepository {

    suspend fun  getRates(base: String): Resource<MoneyResponse>
}