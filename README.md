# Buzz
A full-featured social media platform where users can create, like, save, repost and comment on posts, enjoy real-time messaging and video/voice calls, share short-form “reels,” and customize their profile with follow/unfollow functionality.

## Table of Contents
1. [Features](#features)
2. [Tech Stack](#tech-stack)
3. [Project Structure](#project-structure)
4. [Prerequisites](#prerequisites)
5. [Installation & Running](#installation--running)
6. [Configuration](#configuration)
7. [API Reference](#api-reference)
8. [Testing](#testing)
9. [Future Development](#future-development)
10. [Contributing](#contributing)
11. [License](#license)
12. [Contact](#contact)
    
## Features
- **Posts**: Create, like, save, repost & comment  
- **Real-Time Communication**: One-to-one and group messaging; video & voice calls  
- **Reels**: Record, upload and browse short-form videos  
- **User Profiles**: Update profile details; follow/unfollow other users  
- **Notifications**: Get notified for likes, comments, follows, and messages
  
## Tech Stack
- **Language & Framework**: Java 22, Spring Boot 3  
- **Data**: Spring Data JPA, MySQL 8  
- **Build**: Maven  
- **IDE**: IntelliJ IDEA
- **Utilities**: Lombok 
- **Testing**: Postman  
- **(Frontend)**: React, Redux (coming)

## Project Structure
```text
buzz/
└── backend/
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/matildaerenius/
    │   │   │       ├── config/
    │   │   │       │   ├ AppConfig.java
    │   │   │       │   ├ JwtProvider.java
    │   │   │       │   └ jwtValidator.java
    │   │   │       ├── controller/
    │   │   │       │   ├ AuthController.java
    │   │   │       │   ├ HomeController.java
    │   │   │       │   ├ PostController.java
    │   │   │       │   └ UserController.java
    │   │   │       ├── models/
    │   │   │       │   ├ Post.java
    │   │   │       │   └ User.java
    │   │   │       ├── repository/
    │   │   │       │   ├ PostRepository.java
    │   │   │       │   └ UserRepository.java
    │   │   │       ├── response/
    │   │   │       │   ├ ApiResponse.java
    │   │   │       │   └ AuthResponse.java
    │   │   │       └── service/
    │   │   │           ├ CustomerUserDetailsService.java
    │   │   │           ├ PostService.java
    │   │   │           ├ PostServiceImplementation.java
    │   │   │           ├ UserService.java
    │   │   │           └ UserServiceImplementation.java
    │   │   └── resources/
            └ application.properties.example
 ```

## Prerequisites
- Java 17+  
- Maven 3.6+
- Lombok
- MySQL 8 (with database `buzz` created)  
- (Later) Node.js & npm  

## Installation & Running

1. **Clone the repository**  
   ```bash
   git clone https://github.com/matildaerenius/buzz.git
   cd buzz
   ```
2. **Start the backend**
```bash
  cd backend
  mvn clean install
  cp src/main/resources/application.properties.example src/main/resources/application.properties
  # ← Edit src/main/resources/application.properties with your DB credentials
  mvn spring-boot:run
   ```

## Configuration

Before you run the app, copy the example properties and set your real values:

```bash
cp backend/src/main/resources/application.properties.example \
   backend/src/main/resources/application.properties
```
## API Reference

| Method | Path                    | Description            |
| ------ | ----------------------- | ---------------------- |
| GET    | `/users`                | List all users         |
| POST   | `/users`                | Register new user      |
| PUT    | `/users/{id}`           | Update user            |
| DELETE | `/users/{id}`           | Delete user            |
| GET    | `/posts`                | List all posts         |
| POST   | `/posts/user/{userId}`  | Create a new post      |
| PUT    | `/posts/{id}/user/{uid}`| Toggle save/like post  |
| DELETE | `/posts/{id}/user/{uid}`| Delete a post          |

For full examples and payload definitions, see [docs/API.md](docs/API.md) or import `docs/postman-collection.json`.

## Testing

## Future Development

## Contributing
- Fork and clone the repository
- Create a branch: feature/your-feature-name
- Commit and push following the Conventional Commits specification
- Open a Pull Request

## License
MIT © Matilda Erenius

## Contact
matildaerenius@hotmail.com · GitHub
