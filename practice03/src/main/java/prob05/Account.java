package prob05;

public class Account {
	private String AccountNo;
	private static int balance = 0;
	
	
	Account(){return;}
	Account(String AccountNo) {
		this.AccountNo = AccountNo;
		System.out.println( getAccountNo() + "계좌가 개설되었습니다." );
	}
	
	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int money) {
		balance+=money;
		System.out.println( getAccountNo() + "계좌에 " + money + "만원이 입금되었습니다." );
	}
	
	public void deposit(int money) {
		balance-=money;
		System.out.println( getAccountNo() + "계좌에 " + money + "만원이 출금되었습니다." );
	}	
	
}
