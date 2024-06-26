package miniproject.dao;

import miniproject.model.Customer;

import java.util.List;

public interface CustomerDao {
    // this is a standard interface to provide CRUD and Query operations on Customer object
    // it is a interface as it contain on fxn declaration not defination
    // CRUD

    public Customer save(Customer customer) throws DaoException;

    public Customer getById(int id) throws DaoException;

    public void update(Customer customer) throws DaoException;

    public Customer deleteById(int id) throws DaoException;

    // Queries

    public List<Customer> getAll() throws DaoException;

    public Customer getByEmail(String email) throws DaoException;

    public Customer getByPhone(String phone) throws DaoException;

    public List<Customer> getByCity(String city) throws DaoException;
}