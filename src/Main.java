import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();

        intro();
    }

    public static void intro() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("----Welcome to Scoundrel----");
            System.out.println("1. Play");
            System.out.println("2. Rules");
            System.out.println("3. Exit");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    play();
                    break;
                case 2:
                    rules();
                    break;
                case 3:
                    running = false;
                    System.out.println("Thanks for Playing!");
                    break;
            }
        }
    }

    public static void rules() {
        System.out.println("---Rules---");
        System.out.println("Each turn there are four cards revealed");
        System.out.println("You must perform an action on 3 of them");
        System.out.println("The different suits mean different things:");
        System.out.println(" -Hearts: Heal you the card value");
        System.out.println(" -Diamonds: Is stored as a weapon thats card value is its value and replaces/clears any other weapon");
        System.out.println(" -Spades / Clubs: these are monsters and they deal damage to you. You subtract the weapons value from the monsters.");
        System.out.println(" Note: after fighting a monster with a weapon, you put the monster that weapon (or on the monster on the weapon if you fight multiple) and can only fight monsters with value less than the top monsters.");
    }
    
    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome the Scoundrel\nEnter your name:  ");

        // INIT
        Player player = new Player(sc.nextLine());
        Deck deck = new Deck();
        deck.build();

        //Game loop
        boolean running = true;
        while (running) {
            System.out.println("==========\n"+player.name + "'s stats");
            System.out.println(" -Health: " + player.health);
            System.out.println("==========");

        }
    }
}