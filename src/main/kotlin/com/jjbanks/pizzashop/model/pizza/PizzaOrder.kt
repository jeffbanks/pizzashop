package com.jjbanks.pizzashop.model.pizza

import com.jjbanks.pizzashop.model.order.Order
import com.jjbanks.pizzashop.model.order.OrderContact
import java.lang.IllegalArgumentException
import java.time.ZonedDateTime

/**
 * Specific pizza type of order.
 */
data class PizzaOrder(
    override val identifier: String,
    override val customer: OrderContact,
    override val orderDateTime: ZonedDateTime,
    val orderItems: List<PizzaOrderItem>
) : Order {

    /**
     * Apply validation to ensure no missing values.
     */
    fun validate()  {

        customer.validate()
        if (identifier.isEmpty() || orderItems.isEmpty()) {
            throw IllegalArgumentException("Pizza order is invalid: ${this}")
        }
    }
}