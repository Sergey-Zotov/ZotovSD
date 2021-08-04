package homework.lesson9.task4;

import homework.lesson9.task4.food.Food;

import java.util.List;

public abstract class Distributor implements CookChooser {

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }
}
