import com.jjbanks.pizzashop.model.order.OrderContact;
import com.jjbanks.pizzashop.model.pizza.PizzaOrder;
import com.jjbanks.pizzashop.processor.ProcessResult;
import com.jjbanks.pizzashop.service.PizzaStoreService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests covering pizza shop service
 */
public class PizzaShopTests {

    @Test
    public void singleOrderItem() {

        // Given
        PizzaStoreService service = new PizzaStoreService();
        OrderContact customer = new OrderContact("Jason", "Davies", "555.555.5555");
        PizzaOrder order = PizzaTestHelper.INSTANCE.createPizzaOrder1(customer);

        // When
        List<ProcessResult> results = service.fulfillOrder(order);

        // Then
        assertEquals("One result returned", results.size(), 1);
        assertEquals("Result is complete", results.get(0).isComplete(), true);
    }

    @Test
    public void multipleOrderItems() {

        // Given
        PizzaStoreService service = new PizzaStoreService();
        OrderContact customer = new OrderContact("Jason", "Davies", "555.555.5555");
        PizzaOrder order = PizzaTestHelper.INSTANCE.createPizzaOrder2(customer);

        // When
        List<ProcessResult> results = service.fulfillOrder(order);

        // Then
        assertEquals("One result returned", results.size(), 2);
        assertEquals("Result is complete", results.get(0).isComplete(), true);
        assertEquals("Result is complete", results.get(1).isComplete(), true);
    }

    @Test(expected=IllegalArgumentException.class)
    public void pizzaOrderMissingItems() {

        // Given
        PizzaStoreService service = new PizzaStoreService();
        OrderContact customer = new OrderContact("Jason", "Davies", "555.555.5555");
        PizzaOrder order = PizzaTestHelper.INSTANCE.createPizzaOrderWithoutItems(customer);

        // When
        List<ProcessResult> results = service.fulfillOrder(order);

        // Then expected illegal argument exception is thrown indicating missing items for order.

    }
}
