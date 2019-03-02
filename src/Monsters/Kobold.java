/**
 * Name: Marc Alejandro
 * Date: 02/28/19
 * Explanation: This Kobold class is an extension of the abstract Monster class.
 */

package Monsters;
import Abilities.*;

import java.util.HashMap;

public class Kobold extends Monster {

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }

}
