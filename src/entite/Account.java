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
public class Account {

    private Integer number;
    private String holder;
    protected Double balance;// sera acessado por outra class deste pacote-- modificador de acesso

    //Contrutores
    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    //Metodos
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;

    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
//Não precisa em si declarar o ove
    public void deposit(double amount) {
        balance += amount;
    }
    

}
