CREATE TABLE User(
  user_id      VARCHAR(255) NOT NULL,
  name         VARCHAR(255) NOT NULL,
  email        VARCHAR(255) NOT NULL,
  password     VARCHAR(255) NOT NULL,
  PRIMARY KEY(user_id)
);

INSERT INTO User (user_id, name, email, password) VALUES ('1', 'João Silva', 'jv_rss@hotmail.com', '123');