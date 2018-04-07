package com.jjbanks.pizzashop.model.pizza

import com.jjbanks.pizzashop.model.order.OrderItem

/**
 * Pizza product order item details.
 * Identifies the product id and item number for a specific order.
 */
data class PizzaOrderItem(
    override val productIdentifier: String,
    override val itemNumber: Int,
    val pizzaProfile: PizzaProfile
) : OrderItem {
}