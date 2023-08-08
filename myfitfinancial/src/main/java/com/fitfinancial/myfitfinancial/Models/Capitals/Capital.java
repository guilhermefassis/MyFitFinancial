package com.fitfinancial.myfitfinancial.Models.Capitals;

import java.util.Date;


public abstract class Capital {

    private String description;
    private Date paymentDate;
    private double value;
    private CapitalType type;


    public Capital(String description, Date paymentDate, double value, CapitalType type) {
        this.description = description;
        this.paymentDate = paymentDate;
        this.value = value;
        this.type = type;
    }

    public Capital() {
        
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public CapitalType getType() {
        return type;
    }
    public void setType(CapitalType type) {
        this.type = type;
    }


}
