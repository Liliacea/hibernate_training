
create schema users;
CREATE TABLE users.users(
                      username VARCHAR(128) primary key ,
                      firstname varchar(128),
                      lastname varchar(128),
                    birthdate date,
                      age int

);