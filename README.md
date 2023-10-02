
# Clean Android Architecture Template

This project serves as a template for building Android applications using the best practices of clean architecture. It's underpinned by modern Android components and tools to ensure the app is scalable, maintainable, and cutting-edge.

## Features

- **Clean Architecture**: A multi-layered structure, segregating the different concerns of the application:
    - `Presentation Layer`: Contains the UI components and handles the presentation logic using MVVM pattern.
    - `Domain Layer`: Holds the business logic, entities, and use cases of the app.
    - `Data Layer`: Manages data sources, repositories, and data access mechanisms.

- **Gradle Version Catalog**: Centrally manage dependencies in a consistent manner.

- **Jetpack Compose**: The modern way to build native UI for Android apps.

- **Hilt**: Dependency injection built upon Dagger that offers annotated injection.

- **Ktor Client**: A lightweight, yet powerful asynchronous framework to manage API calls and networking tasks.

- **Coroutines**: For asynchronous operations.

- **Flow**: Provides real-time data handling without callback hell.

- **kotlinx.serialization**: Efficient JSON parsing, ensuring data integrity and simplicity.

- **MVVM**: Uses the Model-View-ViewModel architectural pattern for clear and concise data binding and UI management.

- **Modularity**: Promotes feature-based development and ensures independent feature evolution.

- **Testability**: Designed with testing in mind, easily accommodating unit and instrumentation tests.

## Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/michaeltheshah/android-clean-architecture-template.git
   ```

2. Open the project in Android Studio Arctic Fox (or newer).

3. Sync the Gradle files and run the project on an emulator or physical device.

## Dependency Management

Dependencies are managed centrally in the `libs.versions.toml` file using the Gradle version catalog. This ensures a single source of truth for versions and reduces the risks of version conflicts.

To add a new dependency:
1. Update the `libs.versions.toml` with the desired library and version.
2. Reference it in the required module's `build.gradle.kts` file.

## Contributing

Encountered issues or have improvements in mind? Open a pull request or raise an issue.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.