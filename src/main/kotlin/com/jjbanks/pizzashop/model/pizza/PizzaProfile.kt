package com.jjbanks.pizzashop.model.pizza

/**
 * Specific profile
 */
data class PizzaProfile(val size: PizzaSize, val toppings:Set<PizzaToppingDetail>)