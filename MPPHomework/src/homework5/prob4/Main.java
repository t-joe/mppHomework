package homework5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Customer> cs = new ArrayList<Customer>();
		Customer c;
		for(int i = 0; i<5; i++)
		{
			c = CustOrderFactory.createCustomerOrderItem("Customer " + i + 1, LocalDate.of(2019, 10 - i, 10));
			cs.add(c);
		}
		
		for(Customer ci: cs)
		{
			System.out.println(ci);
		}
	}

}
