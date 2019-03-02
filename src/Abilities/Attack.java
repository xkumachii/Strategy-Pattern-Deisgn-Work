/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This interface outlines the "idea" of an attack, implemented in MeleeAttack and RangedAtrack
 */


package Abilities;
import Monsters.*;

public interface Attack extends Ability {

    Integer attack(Monster attacker);
}
