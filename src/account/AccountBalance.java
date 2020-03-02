/*
 * Mateo Shkurti
 * Student ID: 991570115
 * Syst10199- Web Programming
 */
package account;

/**
 *
 * @author shkur
 */
public class AccountBalance{
    private double balance;
    private double interestrate;
    
    public AccountBalance(double balance, double interestrate){
    this.balance=balance;
    this.interestrate=interestrate;
    }
    
    public double BalanceMonthly(){
        double interest= this.balance*this.interestrate;
        this.balance=this.balance+interest;
        return this.balance;
    }
    
    public double BalanceYearly(){
        
        for(int i=0;i<12;i++){
        double interest= this.balance*this.interestrate;
        this.balance=this.balance+interest;
        }
        
        return this.balance;
    }
}

