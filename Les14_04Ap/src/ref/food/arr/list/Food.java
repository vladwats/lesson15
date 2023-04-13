package ref.food.arr.list;

import java.util.Objects;

public class Food {

	private String type; // вид (тип) продукта питания
	private String brand; // торговая марка продукта питания
	private String chamber; // холодильная камера (cooling) или морозильная (freezer)
	private int shelf; // номер полки, отсчет сверху вниз (где 1-я полка - самая верхняя);
						// для холодильной камеры и морозильной отсчет полок раздельный (1-я полка
						// холод. камеры; 1-я- морозильной)
						// боковых полок и выдвижных ящиков в холодильной камере в холодильнике нет

	public Food() {
	}

	public Food(String type, String brand, String chamber, int shelf) {
		super();
		this.type = type;
		this.brand = brand;
		this.chamber = chamber;
		this.shelf = shelf;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getChamber() {
		return chamber;
	}

	public void setChamber(String chamber) {
		this.chamber = chamber;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf_number(int shelf) {
		this.shelf = shelf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, chamber, shelf, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(chamber, other.chamber) && shelf == other.shelf
				&& Objects.equals(type, other.type);
	}

}

