package entities;

import java.util.List;
import javax.persistence.*;

public class Facade {
    private final EntityManagerFactory emf;
    private final EntityManager em;

    public Facade() {
        emf = Persistence.createEntityManagerFactory("com.mycompany_JPA1_jar_1.0-SNAPSHOTPU");
        this.em = emf.createEntityManager();
    }

    public void createCustomer(String name, String email) {
        persist(new Customer(name, email));
    }

    public void createOrder(Customer cust) {
        persist(new Order(cust));
    }

    public void createOrderLine(int quanity, Order order, ItemType item) {
        persist(new OrderLine(quanity, order, item));
    }

    public void createItemType(String name, String desc, int price) {
        persist(new ItemType(name, desc, price));
    }
    
    public ItemType findItemType(long id) {
        return em.find(ItemType.class, id);
    }

    public Customer findCustomer(long id) {
        return em.find(Customer.class, id);
    }

    public List<Customer> findAllCustomers() {
        Query query = em.createQuery("SELECT c FROM Customer c");
        return query.getResultList();
    }
    
    public void addOrderToCustomer(Customer cust, Order o){
        o.setCust(cust);
        persist(o);
    }
    
    public Order findOrder(long id) {
        return em.find(Order.class, id);
    }
    
    public double findTotalPrice(Order order) {
        Query query = em.createQuery("SELECT line FROM OrderLine line WHERE line.order.id = " + order.getId());
        List<OrderLine> list = query.getResultList();
        int sum = 0;
        for(OrderLine line : list) {
            sum += line.getQuanity() * line.getItem().getPrice();
        }
        return (double) sum;
    }

    public void persist(Object o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }

    public void close() {
        em.close();
        emf.close();
    }

}
