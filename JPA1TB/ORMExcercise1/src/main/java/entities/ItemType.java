package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class ItemType implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long id;
    
    private String name;
    private String description;
    private int price;

    public ItemType() {
    }

    public ItemType(String name, String desc, int price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemType{" + "id=" + id + ", name=" + name + ", desc=" + description + ", price=" + price + '}';
    }
    
    
}
