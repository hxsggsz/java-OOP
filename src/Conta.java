public class Conta {
  private String titular;
  private double balance;
  private static int total;

  public Conta(String titular) {
    Conta.total++;
    this.titular = titular;
  }

  public void getBalance() {
    System.out.println("the balance of " + this.titular + " is " + this.balance);
  }

  public void setBalance(double value) {
    this.balance += value;
    System.out.println("added value, your balance now is " + this.balance);
  }
  
  public void removeBalance(double value) {
    if(this.balance >= value) {
      this.balance -= value;
      
      System.out.println("removed value, your balance now is " + this.balance);
    }
    System.out.println("cannot remove this value because it is greater than your balance");
  }
  
  public void transferBalance(double value, Conta destination) {
    if(this.balance >= value) {
      this.balance -= value;
      destination.setBalance(value);
      
      System.out.println("removed value, your balance now is " + this.balance);
    }
    System.out.println("cannot transfer this value because it is greater than your balance");
  }

  public static int getTotal() {
    return Conta.total;
  }
}
