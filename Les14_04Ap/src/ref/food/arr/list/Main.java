package ref.food.arr.list;



public class Main {

	public static void main(String[] args) {
		
		 Refrigerator foods = new Refrigerator ();
		
		
		foods.add(new Food("milk", "Molochnyy mir", "cooling", 4));
		foods.add(new Food("milk", "Lyahovichek", "cooling", 4));
		foods.add(new Food("beer", "Lidskae", "cooling", 1));
		foods.add(new Food("cottage cheese", "Domashniy", "cooling", 2));
		
		foods.printAllFood();
		
		foods.add(new Food("pizza", "Barbecue", "cooling", 3));
		foods.add(new Food("minced chicken", "Farmer's", "freezer", 2));

		foods.printAllFood();
		
        foods.deleteID(5);
		
		foods.printAllFood();
		
		foods.deleteType("beer");
		foods.deleteType("pizza");
		
		
		foods.printAllFood();
		
		foods.add(new Food("yogurt", "Savushkin", "cooling", 1));
		
		foods.printAllFood();
		
		
		
		Food type= foods.findByType("milk");  
		
		
		if (type != null) {
			System.out.println("--------------------------");
			System.out.println("The list find food in the refrigerator: ");
			
				String message = "Food: type: " + type.getType() + ", brand: " + type.getBrand() + ", chamber: "
						+ type.getChamber() + ", number of shelf: " + type.getShelf_number();
				System.out.println(message);
				
			}	else {
			System.out.println("No this food in the Refrigerator");
		}
		
		
		System.out.println(
				"Is there such a food in the Refrigerator? " + foods.isInFridge(new Food("milk", "Lyahovichek", "cooling", 4)));
				
		
	}

}
