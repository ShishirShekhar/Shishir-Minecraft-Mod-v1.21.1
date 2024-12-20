# Shishir Mod

Welcome to the **Shishir Mod** project! This is a Forge-based Minecraft mod that introduces custom items to enhance your gameplay.

## Project Overview

- **Mod ID**: `shishirmod`
- **Mod Name**: Shishir Mod
- **Version**: `0.0.1-1.21.1`
- **Minecraft Version**: `1.21.1`
- **Forge Version**: `52.0.28`
- **License**: MIT
- **Author**: Shishir Shekhar

This mod provides a foundational setup for creating a Minecraft mod using Forge. It includes necessary configurations, a basic structure, and is ready for customization.

---

## Features

- **Custom Items**:
  - *Shishirmite*: A rare and powerful material for advanced crafting.
  - *Raw Shishirmite*: The unrefined version of Shishirmite, obtained through mining.

- **Creative Mode Integration**:
  - Items are added to the "Ingredients" tab in Creative Mode.

---

## Getting Started

### Prerequisites

Ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 21 or higher.
- **Gradle**: Version compatible with the project (`6.8+` recommended).
- **Minecraft Forge MDK**: Version `52.0.28`.

### Setting Up the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/ShishirShekhar/Shishir-Minecraft-Mod-v1.21.1.git
   cd Shishir-Minecraft-Mod-v1.21.1
   ```

2. Import the project into your preferred IDE:
   - For **IntelliJ IDEA**:
     - Open the project folder and let IntelliJ automatically detect the Gradle build file.
   - For **Eclipse**:
     - Use the `gradlew eclipse` command to generate project files.

3. Build the project:

   ```bash
   ./gradlew build
   ```

4. Run the mod in the Minecraft client:

   ```bash
   ./gradlew runClient
   ```

---

## Project Structure

```bash
src/
├── main/
│   ├── java/                # Main Java source files.
│   │   └── net/shishirshekhar/shishirmod/
│   ├── resources/           # Assets and data files.
│   │   ├── META-INF/        # Mod metadata.
│   │   ├── assets/          # Mod textures, models, and localization.
│   │   └── data/            # Data pack files (recipes, advancements, etc.).
gradle/                      # Gradle wrapper files.
build.gradle                 # Gradle build configuration.
settings.gradle              # Gradle settings file.
```

---

## Contribution Guidelines

Contributions are welcome! Please follow these steps:

1. Fork the repository.  
2. Create a feature branch for your changes.  
3. Commit your updates with clear and descriptive messages.  
4. Open a pull request for review and inclusion.  

---

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

Special thanks to:

- The **Minecraft Forge** team for providing modding tools and support.
- The Minecraft modding community for tutorials and inspiration.

---

## Contact

For any inquiries, please open an issue in this repository or email me at [sspdav02@gmail.com].

---

*Note: This mod is under active development, and new features will be added in future updates. Stay tuned!*

This `README.md` is designed to provide a comprehensive overview of your project while remaining clear and professional.
