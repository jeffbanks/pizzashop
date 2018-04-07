package com.jjbanks.pizzashop.model.order

import java.time.ZonedDateTime

interface Order {
    val identifier: String
    val customer: OrderContact
    val orderDateTime: ZonedDateTime
}