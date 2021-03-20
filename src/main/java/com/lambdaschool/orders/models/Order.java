package com.lambdaschool.orders.models;


import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;

    private double ordamount;
    private double advanceamount;
    private String orderdescription;

    //ORDERS has ManyToOne with CUSTOMERS
    //ORDERS has ManyToMany with PAYMENTS

}
