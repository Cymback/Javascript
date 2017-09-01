/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Entity.Customer;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author caspergrosslarsen
 */
public class Testing {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_OrmExercise3_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Customer cus = new Customer();
        try{
         em.getTransaction().begin();
            em.persist(cus);
            
            em.getTransaction().commit();
            } finally {
            em.close();
            System.out.println("customer" + " " +cus );
        
    }    
    
 }
}