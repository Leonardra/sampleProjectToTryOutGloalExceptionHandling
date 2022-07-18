create database cityDb;
create user 'city_user'@'localhost' identified by 'myPassword';
grant all privileges on cityDb.* to 'city_user'@'localhost';

flush privileges;