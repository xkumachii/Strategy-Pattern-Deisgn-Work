/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This class implements a kind of Attack, which is long ranged.
 */

package Abilities;
import Monsters.*;

public class RangedAttack implements Attack {

    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }
}
