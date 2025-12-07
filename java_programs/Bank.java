public class Bank {
    public static void main(String[] args) {
        BankAccounts b = new BankAccounts();
        
        b.setName("Rishi");
        System.out.println("Name: " + b.getName());
        System.out.println();
        
        b.setAccno("234545654");
        System.out.println("Account Number: " + b.getAccNo());
        System.out.println();
        
        
        b.display();
        System.out.println();
        b.deposit(50);
        b.display();
        System.out.println();
        b.withdraw(20);
        b.display();
        System.out.println();
    }
}
class BankAccounts{
    private String name;
    private String accNo;
    private double balance;
    
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid Amount");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Invalid Amount");
            return;
        }
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw Successfull");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null){
            System.out.println("Invalid Name");
            return;
        }
        this.name = name;
    }
    public String getAccNo(){
        return accNo;
    }
    public void setAccno(String accNo){
        if(name == null){
            System.out.println("Invalid Account Number");
            return;
        }
        this.accNo = accNo;
    }

    public void display(){
        System.out.println("name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}
