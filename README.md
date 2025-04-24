# Spring Boot Web Application

This is a Spring Boot web application project developed for FTN. It includes REST APIs, database integration, security, and email functionality.

## Prerequisites

Before you begin, ensure you have the following installed:
- Java JDK 17 or later
- Maven 3.6 or later
- PostgreSQL 12 or later
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

## Database Setup

1. Install PostgreSQL if you haven't already
2. Create a new database and user:
   ```sql
   CREATE DATABASE ftnDB;
   CREATE USER ftnuser WITH PASSWORD 'ftnpass';
   GRANT ALL PRIVILEGES ON DATABASE ftnDB TO ftnuser;
   ```

## Project Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd webapp
   ```

2. Configure application properties:
   - The default configuration is set in `src/main/resources/application.properties`
   - Default port is 8443
   - Database connection is configured to use:
     - URL: `jdbc:postgresql://localhost:5432/ftnDB`
     - Username: `ftnuser`
     - Password: `ftnpass`

## Running the Application

### Using Maven Command Line

1. Build the project:
   ```bash
   ./mvnw clean install
   ```

2. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

### Using IDE

1. Import the project as a Maven project
2. Run the main application class (should be located in `src/main/java`)

The application will be available at `http://localhost:8443`

## Key Features

- REST API endpoints
- PostgreSQL database integration
- Spring Security implementation
- Email service integration
- Session management with JDBC
- Spring Dev Tools for development
- Lombok for reducing boilerplate code

## Project Structure

```
webapp/
├── src/
│   ├── main/
│   │   ├── java/          # Java source files
│   │   └── resources/     # Configuration files
│   └── test/              # Test files
├── target/                # Compiled files
├── .mvn/                  # Maven wrapper files
├── pom.xml               # Project dependencies
└── README.md             # This file
```

## Dependencies

The project includes the following major dependencies:
- Spring Boot Starter Data REST
- Spring Boot Starter Security
- Spring Boot Starter Web
- Spring Boot Starter Mail
- PostgreSQL Driver
- Lombok
- Spring Session JDBC
- Spring Boot DevTools

## Development

- The project uses Spring Boot 3.4.4
- JPA/Hibernate is configured to automatically update the database schema
- SQL logging is enabled for development purposes
- DevTools is included for automatic restarts during development

## Testing

Run the tests using:
```bash
./mvnw test
```

## Troubleshooting

1. Database Connection Issues:
   - Verify PostgreSQL is running
   - Check database credentials in application.properties
   - Ensure database and user are created correctly

2. Port Already in Use:
   - Change the port in application.properties if 8443 is already taken
   - Kill any process using the required port

3. Build Issues:
   - Ensure JAVA_HOME is set correctly
   - Clear Maven cache if needed: `./mvnw clean`

## Contributing

1. Create a new branch for your feature
2. Make your changes
3. Submit a pull request

## Additional Notes

- The application uses Lombok, ensure your IDE has Lombok plugin installed
- Spring Security is enabled, configure security settings as needed
- Email service needs to be configured before use
