# Job Portal Backend

A professional backend project built using Spring Boot and MySQL.

## Features

- User Registration
- User Login
- BCrypt Password Encryption
- JWT Authentication
- Spring Security
- REST APIs
- MySQL Database Integration

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT
- Hibernate / JPA
- MySQL
- Maven
- Postman

## API Endpoints

### Register User

POST `/api/users/register`

Request:

```json
{
  "name": "Gowri",
  "email": "gowri@gmail.com",
  "password": "12345",
  "role": "JOB_SEEKER"
}
```

---

### Login User

POST `/api/users/login`

Request:

```json
{
  "email": "gowri@gmail.com",
  "password": "*****"
}
```

Response:

```json
{
  "token": "JWT_TOKEN"
}
```

## Security

- Passwords encrypted using BCrypt
- JWT Token Authentication implemented
- Spring Security configured

## Future Enhancements

- Add Job Module
- Apply Job Feature
- Resume Upload
- Role-Based Access
- Swagger Documentation

## Author

Gowri
