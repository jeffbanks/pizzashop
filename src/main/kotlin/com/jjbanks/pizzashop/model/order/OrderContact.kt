package com.jjbanks.pizzashop.model.order

import java.lang.IllegalArgumentException

/**
 * Contact information for the Order
 */
data class OrderContact(
    private val firstName: String,
    private val lastName: String,
    private val phoneContact: String
) {
    fun validate()  {
        if (firstName.isEmpty() || lastName.isEmpty() || phoneContact.isEmpty()) {
            throw IllegalArgumentException("Pizza order's contact is invalid: ${this}")
        }
    }
}