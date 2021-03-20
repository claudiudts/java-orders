package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;
    private String agentname;
    private double commission;
    private String country;
    private String phone;
    private String workingarea;

    public Agents()
    {

    }

    public Agents(long agentcode, String agentname, double commission, String country, String phone, String workingarea) {
        this.agentcode = agentcode;
        this.agentname = agentname;
        this.commission = commission;
        this.country = country;
        this.phone = phone;
        this.workingarea = workingarea;
    }

    public long getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(long agentcode) {
        this.agentcode = agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }
}
