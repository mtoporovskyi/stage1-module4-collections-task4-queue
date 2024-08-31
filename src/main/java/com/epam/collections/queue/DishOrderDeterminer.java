package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> dishesQueue = new LinkedList<>();
        List<Integer> eatenDishesList = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishesQueue.add(i);
        }

        while (!dishesQueue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                dishesQueue.add(dishesQueue.poll());
            }
            eatenDishesList.add(dishesQueue.poll());
        }

        return eatenDishesList;
    }
}
