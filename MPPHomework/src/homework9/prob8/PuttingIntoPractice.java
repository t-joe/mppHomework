package homework9.prob8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

public class PuttingIntoPractice {
	public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		transactions.stream().filter(x->x.getYear() == 2011)
		.sorted((x, y) -> Integer.compare(x.getValue(), y.getValue()))
		.collect(Collectors.toList()).forEach(System.out::println);

        
        // Query 2: What are all the unique cities where the traders work?
		transactions.stream().map(x->x.getTrader().getCity()).distinct().collect(Collectors.toList()).forEach(System.out::println);
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream().map(x->x.getTrader()).filter(x-> x.getCity().equals("Cambridge"))
        .sorted((x, y) -> x.getName().compareTo(y.getName()))
        .collect(Collectors.toList()).forEach(System.out::println);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        transactions.stream().map(x->x.getTrader().getName()).sorted(String::compareTo).forEach(System.out::println);

        // Query 5: Are there any trader based in Milan?
        Optional<Trader> mtrader = transactions.stream().map(x->x.getTrader()).filter(x->x.getCity().equals("Milan")).findAny();
        mtrader.ifPresent(System.out::println);
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream().map(x->x.getTrader()).filter(x->x.getCity().equals("Milan")).forEach(x->x.setCity("Cambridge"));
        System.out.println("milan updated to campbridge\n\tSearching for trader in Milan.\n\tResult: ");
        transactions.stream().map(x->x.getTrader()).filter(x->x.getCity().equals("Milan")).findAny().ifPresent(System.out::println);
        
        // Query 7: What's the highest value in all the transactions?
        Optional<Transaction> maxTrans = transactions.stream().max((x, y) -> Double.compare(x.getValue(), y.getValue()));
        maxTrans.ifPresent(System.out::println);
    }
}
