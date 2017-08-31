package com.testFrontEnd;

import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testFrontEnd.configuration.SecurityConfiguration;
import com.testFrontEnd.domain.Medicine;
 
@SpringBootApplication
public class Spring_Boot_Web_Application {
	private static final Logger LOGGER = Logger.getLogger("JPA");
	
	public static void main(String[] args) {
		Spring_Boot_Web_Application main = new Spring_Boot_Web_Application();
		main.run();
		SpringApplication.run(Spring_Boot_Web_Application.class, args);
	}
    
	public void run() {
    		EntityManagerFactory factory = null;
    		EntityManager entityManager = null;
    		try {
    			factory = Persistence.createEntityManagerFactory("PersistenceUnit");
    			entityManager = factory.createEntityManager();
    			persistMedicine(entityManager);
    			
    		} catch (Exception e){
    			//LOGGER.log(Level.SEVERE, e.getMessage());
    			e.printStackTrace();
    		} finally {
    			if(entityManager != null) {
    				entityManager.close();
    			}
    			if (factory != null) {
    				factory.close();
    				
    			}
    		}
        
    }
	
	
	private void persistMedicine(EntityManager entityManager) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			Medicine medicine = new Medicine();
			
		} catch(Exception e){}
	}
    
    
}


