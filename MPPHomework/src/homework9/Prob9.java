package homework9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob9 {
	private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Prob9(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Prob9> menu =
            Arrays.asList( new Prob9("pork", false, 800, Prob9.Type.MEAT),
                           new Prob9("beef", false, 700, Prob9.Type.MEAT),
                           new Prob9("chicken", false, 400, Prob9.Type.MEAT),
                           new Prob9("french fries", true, 530, Prob9.Type.OTHER),
                           new Prob9("rice", true, 350, Prob9.Type.OTHER),
                           new Prob9("season fruit", true, 120, Prob9.Type.OTHER),
                           new Prob9("pizza", true, 550, Prob9.Type.OTHER),
                           new Prob9("prawns", false, 400, Prob9.Type.FISH),
                           new Prob9("salmon", false, 450, Prob9.Type.FISH));
    
    private static boolean findFood(List<Prob9> lst, String creteria)
    {
    	switch(creteria)
    	{
    	case "veg":
    		return lst.stream().filter(x->x.isVegetarian()).findAny().isPresent();
    	case "healthy":
    		return lst.stream().anyMatch(x->x.getCalories() < 1000);
    	case "unhealthy":
    		return lst.stream().filter(x->x.getCalories() >= 1000).findAny().isPresent();
    	default:
    		return false;
    	}
    }
    private static Optional<Prob9> findFood(List<Prob9> lst)
    {
    	return lst.stream().filter(x->x.getType() == Type.MEAT).findFirst();
    }
    
    private static int calculateTotalCalories(List<Prob9> lst)
    {
    	return lst.stream().map(x->x.getCalories()).reduce(0, Integer::sum);
    }
    
    private static int calculateTotalCaloriesMethodReference(List<Prob9> lst)
    {
    	return lst.stream().map(Prob9::getCalories).reduce(0, Integer::sum);
    }
    
    public static void main(String[] args)
    {
    	System.out.println("Is there any veg food? " +findFood(menu, "veg"));
    	System.out.println("Is there any healthy food? "+findFood(menu, "healthy"));
    	System.out.println("Is there any unhealthy food? "+findFood(menu, "unhealthy"));
    	Optional<Prob9> result = findFood(menu);
    	System.out.println("Finding first meat food: " + result.orElse(null));
    	
    	System.out.println("Calculating total calories: "+ calculateTotalCalories(menu));
    	System.out.println("Calculating total calories by method ref: "+ calculateTotalCaloriesMethodReference(menu));
    }
    
}