import java.util.ArrayList;

public class Player {
    int health = 20;
    ArrayList<Card> weapon_stack = new ArrayList<>();
    String name;

    Player(String name) {
        this.name = name;
    }

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

    public void take_weapon(Card weapon) {
        weapon_stack.clear();
        weapon_stack.add(weapon);
    }
    
    public void main(String[] args) {
        if (weapon_stack.get(weapon_stack.size()-1).suit.equals("Spades")) {

        }
    }
}
