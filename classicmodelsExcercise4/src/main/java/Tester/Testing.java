/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Entity.Customers;
import Entity.Employees;
import Entity.Orders;
import static Tester.Testing.GetEmployeCount;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author caspergrosslarsen
 */
public class Testing {

    public static void main(String[] args) {

        GetEmployeCount();
        GetCustomerInCity();
        
        System.out.println("The Employee count is " + GetEmployeCount()+ " " + "," + "Customer in barcelona is " + GetCustomerInCity() );
    }

    public static long GetEmployeCount() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_classicmodels_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT count(e) FROM Employees e");
        Long resultNumber = (Long) q.getSingleResult();

        return resultNumber;
    }

    public static List<Customers> GetCustomerInCity() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_classicmodels_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Query q = em.createNamedQuery("Customers.findByCity");
        q.setParameter("city", "Barcelona");
        List<Customers> customer = (List<Customers>) q.getResultList();

       return customer;

}

public Employees GetEmployeMaxCustomers() {
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_classicmodels_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        
        
        
        
        
        
        return null;
    }
    
    public Orders GetOrdersOnHold() {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_classicmodels_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        
        
        
        
        
        return null;
        
    }
    
    public Orders GetOrdersOnHold(int customerNumber) {
    
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_classicmodels_jar_1.0-SNAPSHOTPU");
            EntityManager em = emf.createEntityManager();
            
            
            
            
            
            
            return null;
    
    }
    
}
