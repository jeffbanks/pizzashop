import com.jjbanks.pizzashop.model.order.OrderContact
import com.jjbanks.pizzashop.model.pizza.*
import java.time.ZonedDateTime
import java.util.*

object PizzaTestHelper {

    fun createPizzaOrder1(customer: OrderContact): PizzaOrder {

        val productIdentifier1 = "Canadian bacon & cheese feast"
        val itemNumber = 1

        val pizzaToppings: MutableSet<PizzaToppingDetail> = mutableSetOf()
        pizzaToppings.add(
            PizzaToppingDetail(
                PizzaToppingOption.CANADIAN_BACON,
                true,
                false,
                false
            )
        )

        val pizzaProfile = PizzaProfile(PizzaSize.LARGE, pizzaToppings)
        val orderItems = mutableListOf<PizzaOrderItem>()
        orderItems.add(PizzaOrderItem(productIdentifier1, itemNumber, pizzaProfile))
        return PizzaOrder(
            UUID.randomUUID().toString(),
            customer,
            ZonedDateTime.now(),
            orderItems
        )
    }

    fun createPizzaOrder2(customer: OrderContact): PizzaOrder {

        val productIdentifier1 = "Canadian bacon & cheese feast"
        val productIdentifier2 = "Lotz of Pepperoni"
        val itemNumber = 1

        val pizzaToppings: MutableSet<PizzaToppingDetail> = mutableSetOf()
        pizzaToppings.add(
            PizzaToppingDetail(
                PizzaToppingOption.CANADIAN_BACON,
                true,
                false,
                false
            )
        )
        pizzaToppings.add(
            PizzaToppingDetail(
                PizzaToppingOption.CHEESE,
                true,
                false,
                false
            )
        )

        val pizzaProfile1 = PizzaProfile(PizzaSize.SMALL, pizzaToppings)
        val orderItems = mutableListOf<PizzaOrderItem>()
        val pizzaProfile2 = PizzaProfile(PizzaSize.SMALL, pizzaToppings)
        orderItems.add(PizzaOrderItem(productIdentifier1, itemNumber, pizzaProfile1))
        orderItems.add(PizzaOrderItem(productIdentifier2, itemNumber + 1, pizzaProfile2))
        return PizzaOrder(
            UUID.randomUUID().toString(),
            customer,
            ZonedDateTime.now(),
            orderItems
        )
    }

    fun createPizzaOrderWithoutItems(customer: OrderContact): PizzaOrder {

        val orderItems = mutableListOf<PizzaOrderItem>()
        // On purpose, forget to add anything to the order item
        return PizzaOrder(
            UUID.randomUUID().toString(),
            customer,
            ZonedDateTime.now(),
            orderItems
        )
    }
}