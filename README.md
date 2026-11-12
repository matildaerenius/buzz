<div align="center">

# 🐝 Buzz

<p align="center">
  <img src="https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL" />
</p>

> **A full-featured social media platform for real-time connection and content sharing** 📱

</div>

<br>

**Buzz** is a comprehensive social media platform that allows users to create, like, save, repost, and comment on posts. The application supports rich interactions including real-time messaging, video and voice calls, and the ability to share short-form "reels". 

Users can customize their profiles, follow or unfollow others, and stay updated with real-time notifications for likes, comments, follows, and messages. 

---

## ✨ Features

- 📝 **Posts:** Create, like, save, repost, and comment on user-generated content.
- 💬 **Real-Time Communication:** Enjoy one-to-one and group messaging, as well as video and voice calls.
- 🎬 **Reels:** Record, upload, and browse short-form videos.
- 👤 **User Profiles:** Update personal profile details and manage follow/unfollow functionality.
- 🔔 **Notifications:** Get instantly notified for likes, comments, follows, and messages.

---

## 🛠 Tech Stack

**Backend**
- **Language & Framework:** Java 22, Spring Boot 3
- **Data:** Spring Data JPA, MySQL 8
- **Build Tool:** Maven
- **Security:** Spring Security, JWT
- **Utilities:** Lombok
- **Testing:** Postman
- **IDE:** IntelliJ IDEA

**Frontend (in progress)**

---

## 🚀 Getting Started

### Prerequisites

**Backend**
- Java 17+
- Maven 3.6+
- Lombok
- MySQL 8 (with database `buzz` created)

**Frontend**

### 1. Clone the repository
Open your terminal and run the following command:
```bash
git clone https://github.com/matildaerenius/buzz.git
cd buzz
```

### 2. Set up the Backend
```bash
cd backend
mvn clean install
cp src/main/resources/application.properties.example src/main/resources/application.properties
```
> 💡 **Tip:** Edit `src/main/resources/application.properties` with your actual MySQL database credentials before running the application.

```bash
mvn spring-boot:run
```

### 3. Set up the Frontend

---

## 🔌 API Reference

| Method   | Path                         | Description                  |
| -------- | ---------------------------- | ---------------------------- |
| `GET`    | `/api/users`                 | List all users               |
| `POST`   | `/auth/signup`               | Register new user            |
| `PUT`    | `/users/{id}`                | Update a user                |
| `DELETE` | `/users/{id}`                | Delete a user                |
| `GET`    | `/api/posts`                 | List all posts               |
| `POST`   | `/api/posts/user/{userId}`   | Create a new post for a user |
| `PUT`    | `/api/posts/{id}/user/{uid}` | Toggle save/like post        |
| `DELETE` | `/api/posts/{id}/user/{uid}` | Delete a post                |
| `GET`    | `/api/chats`                 | List all chats               |
| `POST`   | `/api/chats`                 | Create a new chat            |
| `GET`    | `/api/chats/{chatId}`        | Get messages from a chat     |

---

## 🧪 Testing (Postman)

### 1. Run in Postman
Click on the button below to directly import the collection:  
[![Run in Postman](https://run.pstmn.io/button.svg)](https://raw.githubusercontent.com/matildaerenius/Buzz/main/docs/postman-collection.json)

### 2. Or import manually
- Open Postman -> **Import** -> **Link**.
- Copy and paste this link:
  ```text
  https://raw.githubusercontent.com/matildaerenius/buzz/refs/heads/main/docs/Buzz.postman_collection.json
  ```
- Click **Continue** -> **Import**

---

## 👩‍💻 Author
**Matilda Erenius**

[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:matildaerenius@hotmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/matildaerenius)

---

## 📄 License
This project is licensed under the MIT License. © Matilda Erenius
