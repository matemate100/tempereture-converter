# Temperature Converter

A simple Java console program that converts temperatures between units using a text menu.

## Features

- Menu-driven interface in the terminal
- Celsius to Fahrenheit conversion
- Clean separation of code: menu, logic and conversion in separate classes

## Project Structure

```
src/
├── Main.java                 # Entry point, starts the program
├── Logic.java                # Runs the program flow
├── menu.java                 # Displays the menu and reads user choices
└── CelsiusToFahrenheit.java  # Conversion formula
```

## Requirements

- Java JDK 17 or newer (check with `java -version`)

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/matemate100/tempereture-converter.git
   cd tempereture-converter
   ```
2. Compile the code:
   ```bash
   javac -d out src/*.java
   ```
3. Run it:
   ```bash
   java -cp out Main
   ```

Or open the folder in IntelliJ IDEA and run `Main.java`.

## Example

```
1. Celsius to Fahrenheit
2. Exit
Choose an option: 1
Enter temperature in Celsius: 25
25.0°C = 77.0°F
```

## Formula

Fahrenheit = (Celsius × 9/5) + 32

## Future Improvements

- Add Fahrenheit to Celsius
- Add Kelvin conversions
- Validate user input

## Author

Made by [Alfred Mate](https://github.com/matemate100)
