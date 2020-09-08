/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author faust
 */
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        //caso na class padrao se execute uma logica normal
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {

            balance += amount - 10.0;            //deposit(amount);
        }

    }
    
    //usando o super

    @Override
    public void withdraw(double amount) {
       super.withdraw(amount);
       balance-=2.0;
    }

}
