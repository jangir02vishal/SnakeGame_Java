# Snake Game - Java GUI Project

This is a GUI-based Java project that demonstrates Object-Oriented programming principles such as inheritance, abstraction, and encapsulation. It utilizes the Java Swing and AWT libraries to organize all the elements.

## Project Structure

The project consists of two main classes:
1. **Snake** (extends `JFrame` and invokes the `Board` class)
2. **Board** (extends `JPanel`)

The `Board` class provides the following methods:
- `initBoard()`: Initializes the game board panel.
- `loadImages()`: Loads images of the snake's head, snake body, and food.
- `initGame()`: Initializes the game.
- `checkCollision()`: Checks for collisions of the snake's head with obstacles (itself, food, or walls).
- `locateApple()`: Randomizes the apple's position every time.
- `gameOver()`: Displays a "Game Over" message and the player's score.

## Game Features

This game includes the following functionalities:
- Players can control the snake's movement using arrow keys (left, right, up, and down).
- When the snake eats food, its length increases by one, and the live score is displayed on the screen.
- The food appears at a random position each time, either when the snake eats one or when a new game is started.
- When the snake collides with itself or with any of the walls, a "Game Over" message is displayed, along with the player's score.

## Design Elements

- Snake head: represented by a green dot.
- Snake body: represented by red dots.
- Food: represented by an apple.

## How to Run the Project Locally

To run this project on your local machine, follow these steps:
1. Ensure you have Java Development Kit (JDK) installed on your computer.
2. Clone this repository to your local machine using the following command:
3. Navigate to the project directory.
4. Compile the Java source files and run the Snake game.

The game should launch, and you can start playing.
Have fun and enjoy the Snake game!

#### Play Screen & Game Over- ####
<div style="display: flex;">
<img src="https://github.com/jangir02vishal/SnakeGame/assets/136950731/ba80f8fe-3199-4476-8b94-b903948f32e5" alt="Image Description" width="340" height="340">
<img src="https://github.com/jangir02vishal/SnakeGame/assets/136950731/50f830c1-5661-4031-a624-2d4cdbb76940" alt="Image Description" width="340" height="340">
</div>


