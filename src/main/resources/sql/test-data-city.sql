CREATE TABLE city (
    id BIGINT,
    name VARCHAR(32) NOT NULL ,
    state VARCHAR(32) NOT NULL ,
    PRIMARY KEY (id)
);

INSERT INTO city(id, name, state) VALUES (1, 'test_name', 'test_state'), (2, 'test_name_2', 'CA');