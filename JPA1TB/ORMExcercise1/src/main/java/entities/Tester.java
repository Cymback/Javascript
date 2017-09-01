package entities;


public class Tester {
    public static void main(String[] args) {
        Facade facade = new Facade();
        
        facade.createCustomer("First", "first@gmail.com");
        facade.createCustomer("Second", "second@gmail.com");
        
        Customer cust1 = facade.findCustomer(1);
        Customer cust2 = facade.findCustomer(2);
        System.out.println("****************************");    
        System.out.println(facade.findAllCustomers().toString());
        System.out.println("****************************"); 
        
        facade.createOrder(cust1);
        facade.createOrder(cust2);
        
        Order order1 = facade.findOrder(1);
        Order order2 = facade.findOrder(2);
        
        System.out.println("****************************");
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println("****************************");
        
        facade.addOrderToCustomer(cust2, order1);
        
        System.out.println("****************************");
        System.out.println("");
        System.out.println("****************************");
        
        facade.createItemType("Car", "Car desc", 100);
        facade.createItemType("Motor", "Motor desc", 50);
                
        facade.createOrderLine(5, order1, facade.findItemType(1)); 
        facade.createOrderLine(10, order2, facade.findItemType(2));
               
        System.out.println("****************************");
        System.out.println("Total sum for order1 is: " + facade.findTotalPrice(order1));
        System.out.println("Total sum for order2 is: " + facade.findTotalPrice(order2));
        System.out.println("****************************");
        
        facade.close();
    }
}
