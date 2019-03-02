/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This is the driver program which runs the Monster and Abilities packages.
 */

import Monsters.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<String, Integer>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for (Monster m : monsters) {
            System.out.println(m);
        }

        System.out.println(monsters.get(0).attackTarget(monsters.get(1)));
        System.out.println(monsters.get(1).attackTarget(monsters.get(0)));
    }
}
