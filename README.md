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
### Backend
- **Language & Framework**: Java 22, Spring Boot 3  
- **Data**: Spring Data JPA, MySQL 8  
- **Build Tool**: Maven  
- **IDE**: IntelliJ IDEA
- **Utilities**: Lombok
- **Security**: Spring Security, JWT  
- **Testing**: Postman

### Frontend (coming soon)
- **Library**: React
- **State Management**: Redux
- **Styling**: Tailwind CSS, MUI
- **IDE**: Visual Studio Code
- **Build Tool**: Webpack 

## Project Structure
```text
buzz/
└── backend/
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/matildaerenius/
    │   │   │       ├── security/                  
    │   │   │       │   ├── SecurityConfig.java     
    │   │   │       │   ├── JwtTokenProvider.java
    │   │   │       │   └── JwtAuthenticationFilter.java
    │   │   │       ├── controller/
    │   │   │       │   ├── AuthController.java
    │   │   │       │   ├── ChatController.java
    │   │   │       │   ├── CommentController.java
    │   │   │       │   ├── HomeController.java
    │   │   │       │   ├── MessageController.java
    │   │   │       │   ├── PostController.java
    │   │   │       │   ├── ReelsController.java
    │   │   │       │   ├── StoryController.java
    │   │   │       │   └── UserController.java
    │   │   │       ├── dto/
    │   │   │       │    ├── request/
    │   │   │       │    │   ├── ChatCreateRequest.java
    │   │   │       │    │   └── LoginRequest.java
    │   │   │       │    └── response/
    │   │   │       │        ├── ApiResponse.java
    │   │   │       │        └── AuthResponse.java
    │   │   │       ├── entity/                       
    │   │   │       │   ├── Chat.java
    │   │   │       │   ├── Comment.java
    │   │   │       │   ├── Message.java
    │   │   │       │   ├── Post.java
    │   │   │       │   ├── Reels.java
    │   │   │       │   ├── Story.java
    │   │   │       │   └── User.java
    │   │   │       ├── exception/                  
    │   │   │       │   ├── ErrorDetails.java     
    │   │   │       │   ├── GlobalException.java
    │   │   │       │   └── UserException.java
    │   │   │       ├── repository/
    │   │   │       │   ├── ChatRepository.java
    │   │   │       │   ├── CommentRepository.java
    │   │   │       │   ├── MessageRepository.java
    │   │   │       │   ├── PostRepository.java
    │   │   │       │   ├── ReelsRepository.java
    │   │   │       │   ├── StoryRepository.java
    │   │   │       │   └── UserRepository.java
    │   │   │       ├── service/
    │   │   │       │   ├── ChatService.java
    │   │   │       │   ├── ChatServiceImpl.java
    │   │   │       │   ├── CommentService.java
    │   │   │       │   ├── CommentServiceImpl.java
    │   │   │       │   ├── MessageService.java
    │   │   │       │   ├── MessageServiceImpl.java
    │   │   │       │   ├── PostService.java
    │   │   │       │   ├── PostServiceImpl.java
    │   │   │       │   ├── ReelsService.java
    │   │   │       │   ├── ReelsServiceImpl.java
    │   │   │       │   ├── StoryService.java
    │   │   │       │   ├── StoryServiceImpl.java
    │   │   │       │   ├── UserService.java
    │   │   │       │   └── UserServiceImpl.java
    │   │   │       └── BuzzApplication.java
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

| Method   | Path                        | Description                  |
| ------   | ----------------------------| ---------------------------- |
| `GET`    | `/api/users`                | List all users               |
| `POST`   | `/auth/signup`              | Register new user            |
| `PUT`    | `/users/{id}`               | Update a user                |
| `DELETE` | `/users/{id}`               | Delete a user                |
| `GET`    | `/api/posts`                | List all posts               |
| `POST`   | `/api/posts/user/{userId}`  | Create a new post for a user |
| `PUT`    | `/api/posts/{id}/user/{uid}`| Toggle save/like post        |
| `DELETE` | `/api/posts/{id}/user/{uid}`| Delete a post                |
| `GET`    | `/api/chats`                | List all chats               |
| `POST`   | `/api/chats`                | Create a new chat            |
| `GET`    | `/api/chats/{chatId}`       | Get messages from a chat     |
| …        | …                           | …                            |

## Importing Postman Collection
1. **Run in Postman**
- Click on the button “Run in Postman”:  
   [![Run in Postman](https://run.pstmn.io/button.svg)](https://raw.githubusercontent.com/matildaerenius/Buzz/main/docs/postman-collection.json)

2. **Or import manually**
   - Open Postman → **Import** → **Link**.
   - Copy & paste this link:
     ```
     https://raw.githubusercontent.com/matildaerenius/buzz/refs/heads/main/docs/Buzz.postman_collection.json
     ```
   - Click **Continue** → **Import**
     
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
