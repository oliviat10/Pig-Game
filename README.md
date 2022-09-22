# Pig-Game
A simple game of Pig!

## About Pig
- The game has one or more players (at least two would probably be most fun)
- The first player to reach the victory score wins (typically this is 100 points, but in this version the victory score can be any positive number of points decided by you the user)
- In this version you may also choose your preferred number of sides for the die (make it at least two)
- On each player's turn:
    1. You start off with zero points for the round
    2. Roll the die. If you roll a 1, you get zero points for the round and your turn is over
    3. If you rolled anything other than a 1,the value on the die will be added to your score for the round. Then, decide if you want to roll again
    4. If you decide not to roll again (but you didn't end on a 1), your score for the round will be added to your total score.
    5. The die will then be passed to the next player.
    
## Running the Game from Command Line:

1) Place the Die.java, Game.java, Player.java, and PlayGame.java files into the same directory
2) cd to their location in Command Prompt/Terminal/etc.
3) Compile the files and run PlayGame!

- javac Die.java Game.java Player.java PlayGame.java
- java PlayGame

## Enjoy! :)
