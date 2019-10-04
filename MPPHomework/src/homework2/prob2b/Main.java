package homework2.prob2b;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Order ord = new Order(LocalDate.of(2019, 05, 02));
		ord.addOrderLine(100, 2);
		ord.addOrderLine(200, 4);
		ord.addOrderLine(400, 6);
		ord.getOrderLines().forEach(e -> {
			System.out.println(
					e.getOrder().getODate() + ": " + e.getLineNum() + "-> " + (e.getPrice() * e.getQuantity()));
		});
	}
}
