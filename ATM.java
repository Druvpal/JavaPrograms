import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

class ATMMachine{
    float Balance;
    int PIN = 5674;
    
    public void checkPin(){
        System.out.println("Enter the Valid PIN :");
        Scanner sc = new Scanner(System.in);
        int pin1 = sc.nextInt();

        if(pin1 != PIN){
            //System.out.println("Enter the valid PIN");
            checkPin();
        }
        else{
            menu();
        }
    }

    public void menu(){
        System.out.println("1. Check Balance :");
        System.out.println("2. Deposite Money :");
        System.out.println("3. Withdraw Money :");
        System.out.println("4. exit :");

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        if(choose == 1){
            CheckBalance();
        }
        else if( choose == 2){
            DepositeMoney();
        }
        else if(choose == 3){
            WithdrawMoney();
        }
        else if(choose == 4){
            exit();
        }
        else{
            System.out.println("Invalid Choise!");
            menu();
        }
    }

    public void CheckBalance(){
        System.out.println("Amount is : " + Balance);
        menu();
    }

    public void DepositeMoney(){
        Scanner sc = new Scanner(System.in);
        float depo = sc.nextFloat();

        Balance = Balance + depo;

        System.out.println("Money Deposited Successfuly.");

        menu();
    }

    public void WithdrawMoney(){
        Scanner sc = new Scanner(System.in);
        float with = sc.nextFloat();

        if(with>Balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            Balance = Balance - with;
            System.out.println("Deposited Successfuly.");
            menu();
        }
    }

    public void exit(){
        return;
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMMachine obj = new ATMMachine();
        obj.checkPin();
    }
}
