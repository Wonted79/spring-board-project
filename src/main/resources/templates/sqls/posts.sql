CREATE TABLE posts (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       user_id BIGINT NOT NULL,
                       title VARCHAR(100) NOT NULL,
                       content TEXT NOT NULL,
                       view_count INT NOT NULL DEFAULT 0,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                       CONSTRAINT fk_posts_user
                           FOREIGN KEY (user_id)
                               REFERENCES users(id)
                               ON DELETE CASCADE
);
