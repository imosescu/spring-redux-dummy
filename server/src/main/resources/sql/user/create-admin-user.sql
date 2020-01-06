-- execute as sys (root)

CREATE USER 'admin-startup'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL PRIVILEGES ON startup.* TO 'admin-startup'@'localhost';
FLUSH PRIVILEGES;