package com.lambdaschool.orders.models;


import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;

    @Column(nullable = false)
    private String type;

    //ORDERPAYMENTS is the join table
}
