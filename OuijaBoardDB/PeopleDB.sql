DROP TABLE IF EXISTS Life;
DROP TABLE IF EXISTS People;
DROP TABLE IF EXISTS Death;

CREATE TABLE Death (
  cause_of_death VARCHAR(255) PRIMARY KEY,
  who_killed_them VARCHAR(255),
  where_they_died VARCHAR(255) NOT NULL,
  are_they_in_the_house BOOLEAN NOT NULL
);

CREATE TABLE People (
  name VARCHAR(255) PRIMARY KEY NOT NULL,
  birthday DATE NOT NULL,
  deathday DATE NOT NULL,
  cause_of_death VARCHAR(255) NOT NULL,
  FOREIGN KEY (cause_of_death) REFERENCES Death (cause_of_death)
);

CREATE TABLE Life (
  id INTEGER PRIMARY KEY,
  name VARCHAR(255),
  occupation VARCHAR(255),
  location VARCHAR(255),
  FOREIGN KEY (name) REFERENCES People (name)
);