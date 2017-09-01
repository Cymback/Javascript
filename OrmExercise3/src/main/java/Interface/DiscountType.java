/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author caspergrosslarsen
 */
@Inheritance(strategy = InheritanceType.JOINED)
public interface DiscountType {
    
    public double calcDiscount(double priceItem, int quantity);
}
    
   
