package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"ORDER\"")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private Customer cust;

    public Order() {
    }
    
    public Order(Customer cust) {
        this.cust = cust;
    }
    
    public long getId() {
        return id;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    
    @Override
    public String toString() {
        return "Order{" + "id=" + id + '}';
    }
    
    
}
