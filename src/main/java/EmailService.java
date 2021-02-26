public class EmailService
{
    private static EmailService instance;
        public String message;
        public Order order;

        public EmailService() {
        }

        public EmailService(String message, Order order)
        {
            this.message = message;
            this.order = order;
        }
        public static EmailService getInstance() {
        if (instance == null) {
            instance = new EmailService();
        }
          return instance;
        }

   public static void sendEmail(Order order) throws RuntimeException
   {
        if(order.getItemName() != null && order.getQuantity() != 0 && order.getPrice() != 0)
        {
            System.out.println("Order Deliverable");
            System.out.println("ItemName: "+order.getItemName()+"\tQuantity: "+order.getQuantity()+
                    "\tPrice: "+order.getPrice());
        }
        else
        {
            throw new RuntimeException();
        }
   }

   boolean sendEmail(Order order, String cc)
   {
       if(order.getItemName() != null && order.getQuantity() != 0 && order.getPrice() != 0 && cc != null)
       {
           System.out.println("\nCC: "+cc);
           System.out.println("Order Deliverable");
           System.out.println("ItemName: "+order.getItemName()+"\tQuantity: "+order.getQuantity()+
                   "\tPrice: "+order.getPrice());

           return true;
       }
       else
       {
           return false;
       }
   }
}