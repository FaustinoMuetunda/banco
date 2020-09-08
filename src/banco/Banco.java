/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import entite.Account;
import entite.BusinessAccount;
import entite.SavingsAccount;

/**
 *
 * @author faust
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       /*
        
           
        
        
        Account acc= new Account(1001, "Alex", 0.0);
        BusinessAccount bacc= new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        //UPcasting
        
        Account acc1=bacc;
        Account acc2= new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3= new SavingsAccount(1004, "Anna", 0.0, 0.01);
        
        //DownCasting
        
        BusinessAccount acc4=(BusinessAccount)acc2;
        acc4.loan(100.0);
        
        
       // BusinessAccount acc5=(BusinessAccount)acc3; //da erro em tempo de execução porque não e possivel nestes casos e o compilador não dete isso
        //Para testar se o objeto pertence a esta classe exemple
        
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 =(BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        
        }
        
        //saida possivel--
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5=(SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        
        }
        
        */
                
        
     
        
        Account acc1= new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        
        System.out.println(acc1.getBalance());
        
        Account acc2= new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
        
         Account acc3= new BusinessAccount(1003, "Bob", 1000.0, 500.0);
         acc3.withdraw(200.0);
         System.out.println(acc3.getBalance());
        
        
        
        
        
    }
    
}
