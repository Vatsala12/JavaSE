class Odexception extends Exception{
    double deficit;
    Odexception(String msg,double def) {
        super(msg);
        this.deficit=def;
    }
}

 class CustomException {
    double balance;
    public CustomException(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amt) throws Odexception {
        if (amt <= balance) {
            {
                balance = balance - amt;
                System.out.println("Withdrawn : "+amt+"\nCurrent Balance is :"+balance);
            }
        } else {
            throw new Odexception("Insufficient balance", amt - balance);
        }
    }

    public static void main(String ar[]) {
        try {
            new CustomException(1000).withdraw(5000);
        } catch (Odexception e) {
            System.out.println(e.getMessage());
        }
    }
}
