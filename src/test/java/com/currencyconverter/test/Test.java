package com.currencyconverter.test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {

        PriorityQueue<Item> priorityQueue = new PriorityQueue<>(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                //if (o1.priority == 5) return 1;
                //if (o2.priority == 4) return 0;
                return o2.priority.compareTo(o1.priority);
            }
        });

        Item item = new Item();
        item.priority = 5;
        item.text = "High";

        Item item2 = new Item();
        item2.priority = 4;
        item2.text = "Low";

        Item item3 = new Item();
        item3.priority = 3;
        item3.text = "Low";

        priorityQueue.add(item3);
        priorityQueue.add(item);
        priorityQueue.add(item2);


        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().text);
        }
    }

    static class Item {
        public Integer priority;
        public String text;
    }
}
