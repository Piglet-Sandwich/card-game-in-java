Mini-Project 1: Build Your Own Card Game (Java)
Student Requirements Outline

Student Name: Sam Edmonds
Date: 4/5/26

--------------------------------------------------
1) GAME CONCEPT
--------------------------------------------------
Game Title:
Scoundrel

Brief Description (2-4 sentences):
Scoundrel is a solo dungeon-crawler card game where you navigate through a
"dungeon" of 4-card rooms. The goal is to clear all cards by fighting monster cards,
equipping weapons, and using health potions, without your health,
which starts at 20 reaching zero.

Primary Objective of the Game:
Survive the deck

Target Player Experience (fun, challenge, strategy, etc.):
Strategy, challenge, fun
--------------------------------------------------
2) PLOT TWIST (REQUIRED)
--------------------------------------------------
Describe your creative plot twist (unexpected rule, event, or mechanic):


When does this plot twist happen in gameplay?

How does it change strategy or outcomes?

--------------------------------------------------
3) UNITS 1-4 CONCEPTS (REQUIRED)
--------------------------------------------------
List where you use each concept in your program:

- Variables / Data Types:
    -Life / Int
    -Name / String
    -Card suit / String
    -Card Value / Int

- Control Structures (if/else, switch):
    -basic menu using switch case
- Loops (for, while):
    -while alive
- Methods (with purpose):
    -drawing cards
    -shuffling
    -managing player actions
- Additional Unit 1-4 concept(s):
    -classes
    -arraylists

--------------------------------------------------
4) MATH LIBRARY USAGE (KEY REQUIREMENT)
--------------------------------------------------
Which Math library method(s) are you using? (examples: Math.random, Math.abs, Math.max, Math.min, Math.pow, etc.)
Math.random, Math.max
Where in the game is each method used?
shuffling and damage stuff
Why is Math usage important to your game logic?
cuz it makes stuff easier and it is good for random
--------------------------------------------------
5) GAME FLOW (START TO FINISH)
--------------------------------------------------
Describe the full game flow in steps:

e.g 1. 4 cards are flipped
e.g 2. you take a weapon
e.g 3. you fight a monster
e.g 4. you take a pot
e.g 5. you fight a monster
e.g 6. you fight a monster
e.g 7. you fight a monster
e.g 8. you die

How does the game end?
either dying or going through the deck
How is a winner or final result determined?
by dying or surviving
--------------------------------------------------
6) USER INTERACTION (INPUT/OUTPUT)
--------------------------------------------------
What inputs does the player provide?
name and choices
What outputs/feedback does the game display?
cards, what happens
How do you handle invalid input?
i use try except to make sure numnbers are entered and that they are in range
--------------------------------------------------
7) CODE STRUCTURE AND DESIGN
--------------------------------------------------
List your planned classes and their roles:

- e.g Class 1:Card, is a card with getable value suit and print
- e.g Class 2: Deck, that is built of cards and can be shuffled or drawn from
- e.g Class 3: Player, all the player actions

List key methods and what each method does:

- e.g  draw()  draw a card:
- e.g  fight_monster() does monster fight logic:
- e.g  heal() uses a card to heal:

