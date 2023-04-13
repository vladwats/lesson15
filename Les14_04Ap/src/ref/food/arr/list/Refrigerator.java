package ref.food.arr.list;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {

	private List<Food> foods;

	public Refrigerator() {
		foods = new ArrayList<Food>();
	}

	public boolean add(Food f) {
		return foods.add(f);
	}

	
	public void printAllFood() {
		System.out.println("--------------------------");
		System.out.println("The list of food in the refrigerator: ");
		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String message = "Food: type: " + f.getType() + ", brand: " + f.getBrand() + ", chamber: " + f.getChamber()
					+ ", number of shelf: " + f.getShelf();
			System.out.println(i + " - " + message);
		}

	}

	
	public boolean deleteID(int id) {
		int deleteIndex = -1;
		for (int i = 0; i < foods.size(); i++) {
			deleteIndex = id;
		}

		if (deleteIndex < 0) {
			return false;
		}

		if (deleteIndex > foods.size()) {
			return false;
		}

		foods.remove(deleteIndex);
		return true;
	}

	
	public void deleteType(String type) {
		int deleteType = -1;
		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String typeFood = f.getType();

			if (typeFood.contains(type)) {
				deleteType = i;
				foods.remove(deleteType);
				i--;
			}
		}
	}

	
	public Food findByType(String type) {

		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String typeFood = f.getType();
			if (typeFood.contains(type)) {
				return f;
			}
		}
		return null;
	}

	
	public List<Food> findListByType(String type) {
		List<Food> result = new ArrayList<Food>();

		for (int i = 0; i < foods.size(); i++) {
			Food f = foods.get(i);
			String typeFood = f.getType();
			if (typeFood.contains(type)) {
				result.add(f);
			}
		}
		return result;
	}

	
	public boolean isInFridge(Food food) {

		return foods.contains(food);

	}

}
