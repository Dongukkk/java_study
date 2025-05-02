package study.practice.practice33;

public class AccountMain {

	public static void main(String[] args) {
		Account a1 = new Account("김이름",500000);
		System.out.printf("저축 금액 : %d\n",a1.deposit(50000));
		System.out.printf("인출 후 잔여 금액 : %d\n",a1.withdraw(300000));
		System.out.printf("인출 후 잔여 금액 : %d\n",a1.withdraw(400000));

        
	}

}
