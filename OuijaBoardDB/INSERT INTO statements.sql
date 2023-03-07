INSERT INTO death (cause_of_death, who_killed_them, where_they_died, are_they_in_the_house)VALUES
('murder', 'My father', 'The house', true),
('suicide', 'Myself', 'The lake', true),
('poison', 'My wife', 'Lake House', true),
('suicide', 'Myself', 'Bridge', false),
('car accident','Drunk Driver', 'Highway', true),
('murder', 'Girlfriend', 'Bar', false),
('suicide', 'Myself', 'Bathroom', true),
('explosion', NULL, 'Gas Station', false),
('murder', 'Brother', 'Bedroom', true),
('suicide', 'Myself', 'Backyard', true);

INSERT INTO People (name, birthday, deathday, cause_of_death) VALUES
  ('John Doe', '1987-02-14', '2017-05-20', 'murder'),
  ('Jane Smith', '1975-11-28', '2018-09-15', 'suicide'),
  ('Robert Johnson', '1911-05-08', '1938-08-16', 'poison'),
  ('Sarah Lee', '1993-09-02', '2022-02-12', 'suicide'),
  ('James Brown', '1946-05-03', '1976-08-01', 'car accident'),
  ('Emily Davis', '1989-12-24', '2020-06-18', 'murder'),
  ('Michael Wilson', '1965-07-12', '1995-09-30', 'suicide'),
  ('Amanda Hernandez', '2001-03-07', '2023-03-07', 'explosion'),
  ('Brandon Nguyen', '1996-02-01', '2022-11-13', 'murder'),
  ('Megan Carter', '1982-08-17', '2013-10-25', 'suicide');
  