-- execute as admin
create table t_dummy(
                        dummy_id INT NOT NULL AUTO_INCREMENT,
                        dummy_title VARCHAR(100) NOT NULL,
                        dummy_author VARCHAR(40) NOT NULL,
                        dummy_date DATE,
      PRIMARY KEY ( dummy_id )
);