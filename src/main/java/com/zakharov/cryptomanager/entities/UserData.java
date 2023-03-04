package com.zakharov.cryptomanager.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserData {

    @Id
    private String id;
    private double balance;
    private double deposit;
    private double riskPercentage;

    public UserData(double balance, double deposit, double riskPercentage) {
        this.balance = balance;
        this.deposit = deposit;
        this.riskPercentage = riskPercentage;
    }

    public String getId(){
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getRiskPercentage() {
        return riskPercentage;
    }

    public void setRiskPercentage(double riskPercentage) {
        this.riskPercentage = riskPercentage;
    }
}
