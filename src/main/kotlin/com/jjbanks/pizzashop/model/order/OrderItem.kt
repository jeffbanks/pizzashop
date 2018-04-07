package com.jjbanks.pizzashop.model.order

/**
 * Item product and item number attributes used by various order item types
 */
interface OrderItem {
    val productIdentifier: String
    val itemNumber: Int
}