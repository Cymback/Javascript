package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private long id;
    private int quanity;
    
    @ManyToOne
    private Order order;
    
    @ManyToOne
    private ItemType item;

    public OrderLine() {
    }

    public OrderLine(int quanity, Order order, ItemType item) {
        this.quanity = quanity;
        this.order = order;
        this.item = item;
    }

    

    public long getId() {
        return id;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setItem(ItemType item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public ItemType getItem() {
        return item;
    }

    
    
    @Override
    public String toString() {
        return "OrderLine{" + "id=" + id + ", quanity=" + quanity + '}';
    }
    
    
}
