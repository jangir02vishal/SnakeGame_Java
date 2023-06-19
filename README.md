# SnakeGame
It is a GUI-based Java project which is created using the Object-Oriented programming principles such as inheritence, abstraction, and encapsulation. It uses the JAVA Swing and AWT library to organize all the elements.

It icludes two main classes: 
1. Snake (extends JFrame and invokes the Board class)
2. Board (extends JPanel)

The Board class provides following methods:
* initBoard() - It initializes Board Panel.
* loadImages() - It loads images of Snake head, Snake body and food.
* initGame() - It initializes Game.
* checkCollision() - It checks collision of Snake's head with an obstacle (itself/food/wall).
* locateApple() - It randomize Apple position every time.
* gameOver() - It displays Game Over massage and player's score.

This game includes the following functionalities:
* The player can move the snake left, rigt, up, and down as per the given direction using respective arrow keys.
* Whenever the snake eats food, its length increases by one and live score is displayed on screen.
* The food appears on random position each time, either when the snake eats one or the new game is started.
* When the snake collides with itself or with any of the wall, the "Game Over" massage it displayed along with player's score.

Design elements -
* Snake head: represented by green dot.
* Snake body: represented by red dot.
* Food: represented by an apple.


#### Play Screen - ####
![LivePlay](https://github.com/jangir02vishal/SnakeGame/assets/136950731/ba80f8fe-3199-4476-8b94-b903948f32e5)

#### Game Over - ####
![Gameover](https://github.com/jangir02vishal/SnakeGame/assets/136950731/50f830c1-5661-4031-a624-2d4cdbb76940)
