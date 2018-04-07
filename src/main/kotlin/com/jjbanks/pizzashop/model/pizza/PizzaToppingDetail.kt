package com.jjbanks.pizzashop.model.pizza

/**
 * Pizza topping details
 */
data class PizzaToppingDetail(val topping: PizzaToppingOption,
                              val extra: Boolean,
                              val kosher: Boolean,
                              val organic: Boolean)