/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This class details the abstract idea of a general RPG-style monster,
 *              and its attributes and actions thereof.
 */

package Monsters;
import Abilities.*;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {

    // fields

    private Integer hp;
    private Integer xp = 10;
    Integer agi = 5;
    Integer def = 5;
    Integer str = 5;
    Attack attack;
    private Integer maxHP = 30;
    private HashMap<String, Integer> items;


    // getters and setters

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }

        return rand.nextInt(max - min) + min;
    }



    // overridden functions

    @Override
    public String toString() {
        return "hp=" + this.hp + "/" + this.maxHP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHP, monster.maxHP) &&
                Objects.equals(items, monster.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHP, items);
    }


    // methods

    public Integer attackTarget(Monster target) {
        return attack.attack(target);
    }


    // constructor


    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        this.hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }


}