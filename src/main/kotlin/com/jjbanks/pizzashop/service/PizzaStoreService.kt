package com.jjbanks.pizzashop.service

import com.jjbanks.pizzashop.model.pizza.PizzaOrder
import com.jjbanks.pizzashop.processor.PizzaProcessor
import com.jjbanks.pizzashop.processor.ProcessResult

class PizzaStoreService {

    fun fulfillOrder(order: PizzaOrder): List<ProcessResult> {

        println("Processing pizza Order: $order")
        val processor = PizzaProcessor()
        val fulfillmentResults: MutableList<ProcessResult> = mutableListOf()

        // Defensive check for missing information.
        order.validate()

        // Processing each order item
        order.orderItems.forEach { item ->
            fulfillmentResults.add(processor.process(item))
        }
        return fulfillmentResults
    }
}
