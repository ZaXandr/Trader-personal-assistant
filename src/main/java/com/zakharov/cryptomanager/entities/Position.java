package com.zakharov.cryptomanager.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Position {

    @Id
    private String id;
    private double entryPrice;
    private double stopLoss;
    private double takeProfit;
    private double volume;
    private UserData userData;
    private LocalDateTime date;
    private boolean result;

    public Position() {
    }

    public Position(double entryPrice, double stopLoss, double takeProfit,double balance, double deposit, double riskPercentage) {
        this.userData = new UserData(balance,deposit,riskPercentage);
        this.entryPrice = entryPrice;
        this.stopLoss = stopLoss;
        this.takeProfit = takeProfit;
        this.volume = userData.getRiskPercentage()/(Math.abs(entryPrice-stopLoss));
        this.date=LocalDateTime.now();
    }



}
