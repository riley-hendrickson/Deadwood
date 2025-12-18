# Deadwood

A feature-complete digital implementation of the board game *Deadwood*, built in Java with a custom Swing GUI and XML-driven game state management.

![Deadwood Game Interface](https://github.com/user-attachments/assets/6a16fdac-4028-466a-9ce5-e9666c7eec71)

## Overview

Deadwood is a turn-based board game where players take on acting roles to earn money and fame in a Wild West film studio. This implementation demonstrates strong software engineering principles through comprehensive OOP design, dynamic XML parsing, and an interactive graphical interface.

## Technical Highlights

- **XML-Driven Architecture**: Flexible game configuration through XML parsing for board layouts, scene cards, roles, and game rules
- **Object-Oriented Design**: Clean separation of concerns using MVC pattern with well-defined interfaces and inheritance hierarchies
- **Custom Swing GUI**: Interactive board with clickable elements, dynamic player positioning, and real-time game state visualization
- **Complex Game Logic**: Full implementation of game mechanics including role selection, acting/rehearsal systems, scene completion, and multi-player scoring

## Key Features

- **Dynamic Board State**: Visual representation of 12 set locations with scene cards, shot counters, and player positions
- **Turn-Based Gameplay**: Complete action system (Move, Take Role, Act, Rehearse, Upgrade, End Turn)
- **Role Management**: Support for both on-card and off-card roles with rank requirements
- **Scoring System**: Automated bonus distribution, practice chip tracking, and winner determination
- **Validation Layer**: `SystemValidator` ensures all moves comply with game rules (neighbor checking, rank requirements, budget validation)

## Architecture

The project follows a layered architecture:

- **Model Layer**: Game state management (`GameData`, `GameState`, `Player`, `SetScene`, `Card`, `Role`)
- **View Layer**: Swing-based UI components (`BoardView`, `SetView` implementations)
- **Controller Layer**: Action handling and game flow coordination
- **Parser Layer**: XML processing (`SetParser`, `CardParser`, `GameDataParser`)

![UML Class Diagram](https://github.com/user-attachments/assets/532b56fb-d7a3-4ac8-8971-3a0e65023390)

## Technologies

- **Language**: Java
- **Build Tool**: Gradle
- **GUI Framework**: Swing
- **Data Format**: XML
- **Design Patterns**: MVC, Builder (CardBuilder), Strategy (SystemValidator)

## Setup & Running

```bash
# Clone the repository
git clone https://github.com/[your-username]/Deadwood.git
cd Deadwood

# Build the project
./gradlew build

# Run the application
./gradlew run
```

## Game Rules

Players compete over multiple days, taking roles on movie sets to earn money and credits. Higher-ranking roles pay better but require rank upgrades. The game ends after a set number of days, and the player with the highest combined score wins.

## Project Context

Developed as a coursework project during my undergraduate studies at Western Washington University. This project demonstrates proficiency in Java development, XML processing, GUI design, and software architecture principles.

---

## Future Enhancements

- Network multiplayer support
- AI opponent implementation  
- Saved game functionality
- Enhanced animations and visual effects

---