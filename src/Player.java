import java.util.ArrayList;
import java.lang.Math;
public class Player {
    int health = 20;
    ArrayList<Card> weapon_stack = new ArrayList<>();
    String name;

    Player(String name) {
        this.name = name;
    }

    // Manages taking potion cards that heal the player
    public void take_pot(int value) {
        if (health + value < 20) {
            health += value;
            System.out.println("You healed " + value + " health points and have " + health + " HP!");
        }
        else {
            health = 20;
            System.out.println("You healed all the way up and are at 20 HP!");
        }
    }

    // Manage taking weapons that are used to fight monsters
    public void take_weapon(Card weapon) {
        System.out.println("You took the weapon: " + weapon.get());
        weapon_stack.clear();
        weapon_stack.add(weapon);
    }

    // returns a bool signifying if it can be fought with the current weapon
    public boolean can_fight(Card monster) {
        return weapon_stack.size() < 2 || weapon_stack.getLast().value > monster.value;
    }

    // Fights the monster, returns false if the player dies
    public boolean fight(Card monster) {
        if (weapon_stack.isEmpty() || !can_fight(monster)) {
            System.out.println("You fought the " + monster.get());
            health -= monster.value;
            System.out.println("You lost " + monster.value + " HP");
        }
        else {
            int life_lost = Math.max(monster.value - weapon_stack.getFirst().value, 0);
            health -= life_lost;
            weapon_stack.add(monster);
            System.out.println("You lost " + life_lost + " HP");
        }
        return health > 0;
    }

    // Simply prints weapon stack
    public StringBuilder print_weapon_stack() {
        StringBuilder s = new StringBuilder();
        if (weapon_stack.isEmpty()) {
            s.append("No Weapon");
        }
        else {
            s.append("Your current weapon is ").append(weapon_stack.getFirst().get());
        }

        if (weapon_stack.size() > 1) {
            s.append("\nYou have fought the: ");
            for (Card card : weapon_stack) {
                if (card != weapon_stack.getFirst()) {
                    if (card == weapon_stack.getLast()) {
                        if (weapon_stack.size() >= 3) {
                            s.append(" and ").append(card.value);
                        } else {
                            s.append(card.value);
                        }
                    } else {
                        s.append(card.value).append(", ");
                    }
                }
            }
        }
        return s;
    }
}
