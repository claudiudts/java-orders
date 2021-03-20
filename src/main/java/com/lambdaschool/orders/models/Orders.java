package com.lambdaschool.orders.models;


import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;
    private double advanceamount;
    private double orderamount;
    private String orderdescription;

    public Orders()
    {

    }

    public Orders(long ordnum, double advanceamount, double orderamount, String orderdescription) {
        this.ordnum = ordnum;
        this.advanceamount = advanceamount;
        this.orderamount = orderamount;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public double getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(double orderamount) {
        this.orderamount = orderamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }
}
