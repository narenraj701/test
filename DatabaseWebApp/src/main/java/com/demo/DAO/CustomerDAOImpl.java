package com.demo.DAO;

import com.demo.DAO.CustomerDAO;
import com.demo.Entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Customer> getCustomers() {
        Session currentSession=sessionFactory.getCurrentSession();

        Query<Customer> theQuery=
                currentSession.createQuery("from Customer " +
                        "order by lastName",Customer.class);
        List<Customer> customers=theQuery.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
    Session currentSession=sessionFactory.getCurrentSession();
    currentSession.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession=sessionFactory.getCurrentSession();
        Customer customer=currentSession.get(Customer.class,theId);
        return customer;
    }

    @Override
    public void delete(int theId) {
        Session currentSession=sessionFactory.getCurrentSession();
        Query query=
                currentSession.createQuery("delete from Customer where id=:customerId");
        query.setParameter("customerId",theId);
        query.executeUpdate();
    }
}
