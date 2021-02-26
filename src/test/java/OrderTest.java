import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;
    private int quantity = 8;
    private String itemName = "Pen";
    private double price = 20.05;


    @BeforeEach
    void setup()
    {
        this.order = new Order(quantity,itemName,price);
    }

    @AfterEach
    void printMessage()
    {
        System.out.println("Test completed");
    }

    @Test
    void getQuantity()
    {
        //given

        quantity= 8;

        //when
        int resultQuantity = order.getQuantity();

        //then

        assertEquals(quantity,resultQuantity);
    }

    @Test
    void setQuantity()
    {
        //given

        int newQuantity = 10;

        //when
        Order resultOrder = order.setQuantity(newQuantity);
        int resultQuantity = resultOrder.getQuantity();

        //then
        assertEquals(newQuantity,resultQuantity);

    }

    @Test
    void getItemName()
    {
        //given
        itemName = "Pen";

        //when
        String resultName = order.getItemName();

        //then
        assertEquals(itemName,resultName);
    }

    @Test
    void setItemName()
    {
        //given
        String newItemName = "Pencil";

        //when
        Order resultOrder = order.setItemName(newItemName);
        String resultItemName = resultOrder.getItemName();

        //then
        assertEquals(newItemName,resultItemName);
    }

    @Test
    void getPrice()
    {
        //given
        price = 20.05;

        //when
        double resultPrice = order.getPrice();

        //then
        assertEquals(price,resultPrice);
    }

    @Test
    void setPrice()
    {
        //given
       double newPrice = 25.05;

        //when
        Order resultOrder = order.setPrice(newPrice);
        double resultPrice = resultOrder.getPrice();

        //then
        assertEquals(newPrice,resultPrice);
    }
}