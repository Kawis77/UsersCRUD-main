CREATE DATABASE IF NOT EXISTS workshop3 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS users (
              id INT NOT NULL AUTO_INCREMENT,
               username VARCHAR(255) NOT NULL UNIQUE,
               email VARCHAR(255) NOT NULL UNIQUE,
               password VARCHAR(255) NOT NULL,
               PRIMARY KEY (id)
            );
DROP TABLE users;
INSERT INTO users(username, email, password) VALUES ('Ania', 'niewiem','tete')