package com.customers.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.customers.app.model.Orders;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface OrdersRepository extends CrudRepository<Orders, Integer>{

    @Modifying
    @Query(value = "insert into tbl_orders (prod_id,cust_id) VALUES (:prodId,:custId)", nativeQuery = true)
    @Transactional
    void insertOrders(@Param("prodId") String prodId, @Param("custId") Long custId);

    @Query(value = "SELECT o.cust_id FROM tbl_orders o WHERE o.prod_id= :prodId", nativeQuery = true)
    List<Integer> findAllCustomersByProductId(@Param("prodId") int prodId);

}