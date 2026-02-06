CREATE TABLE USERS(
                      id BIGINT PRIMARY KEY AUTO_INCREMENT,
                      user_name VARCHAR(30) NOT NULL unique,
                      user_password VARCHAR(30) NOT NULL,
                      user_nickname VARCHAR(30),
                      created_at TIMESTAMP DEFAULT current_timestamp
);