package com.jjbanks.pizzashop.processor

import com.jjbanks.pizzashop.model.pizza.PizzaOrderItem

/**
 * Processing pipeline for building a pizza.
 */
class PizzaProcessor {

    fun process(item: PizzaOrderItem): ProcessResult {
        try {
            prepare(item)
            bake(item)
            cut(item)
            box(item)
        } catch (e: Exception) {
            return ProcessResult(
                false,
                "Failed to build pizza order item: $item due to: $e.message"
            )
        }
        return ProcessResult(
            true,
            "Completed building pizza order item: $item"
        )
    }

    private fun prepare(orderItem: PizzaOrderItem) {
        println("Preparing pizza for $orderItem")
    }

    private fun bake(orderItem: PizzaOrderItem) {
        println("Baking pizza for $orderItem")
    }

    private fun cut(orderItem: PizzaOrderItem) {
        println("Cutting pizza for $orderItem")
    }

    private fun box(orderItem: PizzaOrderItem) {
        println("Boxing pizza for $orderItem")
    }
}