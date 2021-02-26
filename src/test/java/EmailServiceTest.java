import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest
{
    EmailService emailServiceInstance;
    @BeforeEach
    void setup()
    {
        emailServiceInstance = EmailService.getInstance();
    }

    @Test
    void getInstanceTest()
    {
        //given
        EmailService newEmailServiceInstance = EmailService.getInstance();

        //when
        EmailService resultEmailServiceInstance = EmailService.getInstance();

        //then
        assertEquals(newEmailServiceInstance,resultEmailServiceInstance);
    }

    @Test
   void sendMail_With_Only_Order_Only_Param()
    {
        //given
        EmailService newEmailServiceInstance = EmailService.getInstance();
        Order newOrder = new Order();
        boolean excepted = true;

        //when
        Executable executable = ()-> newEmailServiceInstance.sendEmail(newOrder);

        //then
        assertThrows(RuntimeException.class, (org.junit.jupiter.api.function.Executable) executable);
    }

    @Nested
    class sendEmailWithOrderCC
    {
        @Test
        void send_Email_With_Order_And_CC_Return_True()
        {
            //given
            EmailService newEmailServiceInstance = EmailService.getInstance();
            Order newOrder = new Order(1,"Laptop",45000.12);
            String cc = "name.lastname@mail.com";

            //when
            boolean result = newEmailServiceInstance.sendEmail(newOrder,cc);

            //then
            assertTrue(result);
        }

        @Test
        void send_Email_With_Order_And_CC_Return_False()
        {
            //given
            EmailService newEmailServiceInstance = EmailService.getInstance();
            Order newOrder = new Order(1,"Laptop",45000.12);
            String cc = null;

            //when
            boolean result = newEmailServiceInstance.sendEmail(newOrder,cc);

            //then
            assertFalse(result);
        }
    }
}