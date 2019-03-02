/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This class implements a kind of Attack, which is close ranged.
 */

package Abilities;
import Monsters.*;

public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}
