package org.example;

import org.example.models.Capital;
import org.example.models.Country;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();


        Capital newCapital = new Capital();
        newCapital.setName("Washington DC");

        Country newCountry = new Country();
        newCountry.setName("USA");

        newCountry.setCapital(newCapital);

        transaction.begin();
        entityManager.persist(newCountry);
        entityManager.persist(newCapital);
        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}