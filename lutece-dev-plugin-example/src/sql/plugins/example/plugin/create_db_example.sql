
--
-- Structure for table example_project
--

DROP TABLE IF EXISTS example_project;
CREATE TABLE example_project (
    id_project INT NOT NULL,
    name VARCHAR(50) NOT NULL ,
    description VARCHAR(255) NOT NULL ,
    image_url VARCHAR(255) NOT NULL ,
    PRIMARY KEY (id_project)
);
