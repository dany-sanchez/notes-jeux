INSERT INTO type_jeu (nom_type) VALUES ('jeu de cartes');
INSERT INTO type_jeu (nom_type) VALUES ('jeu de plateau');
INSERT INTO type_jeu (nom_type) VALUES ('jeu de dés');

INSERT INTO genre_jeu (nom_genre) VALUES ('stratégie');
INSERT INTO genre_jeu (nom_genre) VALUES ('ambiance');
INSERT INTO genre_jeu (nom_genre) VALUES ('gestion');
INSERT INTO genre_jeu (nom_genre) VALUES ('hasard');

INSERT INTO theme_jeu (nom_theme) VALUES ('science-fiction');
INSERT INTO theme_jeu (nom_theme) VALUES ('contemporain');
INSERT INTO theme_jeu (nom_theme) VALUES ('fantastique');
INSERT INTO theme_jeu (nom_theme) VALUES ('médieval');

INSERT INTO editeur_jeu (nom_editeur) VALUES ('édijeu');
INSERT INTO editeur_jeu (nom_editeur) VALUES ('eligos');
INSERT INTO editeur_jeu (nom_editeur) VALUES ('hiboujoujou');
INSERT INTO editeur_jeu (nom_editeur) VALUES ('huphélios');

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('tourelles',
(SELECT id from type_jeu where nom_type='jeu de plateau'),
(SELECT id from genre_jeu where nom_genre='stratégie'),
(SELECT id from theme_jeu where nom_theme='médieval'),
(SELECT id from editeur_jeu where nom_editeur='hiboujoujou'),
5,2,5);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('le dernier tour',
(SELECT id from type_jeu where nom_type='jeu de dés'),
(SELECT id from genre_jeu where nom_genre='hasard'),
(SELECT id from theme_jeu where nom_theme='contemporain'),
(SELECT id from editeur_jeu where nom_editeur='édijeu'),
3,2,6);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('la vie est longue, le monde est petit',
(SELECT id from type_jeu where nom_type='jeu de cartes'),
(SELECT id from genre_jeu where nom_genre='ambiance'),
(SELECT id from theme_jeu where nom_theme='contemporain'),
(SELECT id from editeur_jeu where nom_editeur='huphélios'),
9,3,5);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('colonisons le système',
(SELECT id from type_jeu where nom_type='jeu de cartes'),
(SELECT id from genre_jeu where nom_genre='gestion'),
(SELECT id from theme_jeu where nom_theme='science-fiction'),
(SELECT id from editeur_jeu where nom_editeur='eligos'),
12,1,6);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('monstres à Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch',
(SELECT id from type_jeu where nom_type='jeu de plateau'),
(SELECT id from genre_jeu where nom_genre='stratégie'),
(SELECT id from theme_jeu where nom_theme='fantastique'),
(SELECT id from editeur_jeu where nom_editeur='hiboujoujou'),
10,1,4);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('meurtre à Bydgoszcz',
(SELECT id from type_jeu where nom_type='jeu de cartes'),
(SELECT id from genre_jeu where nom_genre='gestion'),
(SELECT id from theme_jeu where nom_theme='médieval'),
(SELECT id from editeur_jeu where nom_editeur='eligos'),
12,2,4);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('planificateur',
(SELECT id from type_jeu where nom_type='jeu de plateau'),
(SELECT id from genre_jeu where nom_genre='ambiance'),
(SELECT id from theme_jeu where nom_theme='science-fiction'),
(SELECT id from editeur_jeu where nom_editeur='huphélios'),
7,1,8);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('à l''aquitaine',
(SELECT id from type_jeu where nom_type='jeu de dés'),
(SELECT id from genre_jeu where nom_genre='hasard'),
(SELECT id from theme_jeu where nom_theme='médieval'),
(SELECT id from editeur_jeu where nom_editeur='édijeu'),
3,3,3);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('princes et duchesses',
(SELECT id from type_jeu where nom_type='jeu de cartes'),
(SELECT id from genre_jeu where nom_genre='ambiance'),
(SELECT id from theme_jeu where nom_theme='médieval'),
(SELECT id from editeur_jeu where nom_editeur='hiboujoujou'),
5,2,6);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('nom d''une tentacule',
(SELECT id from type_jeu where nom_type='jeu de dés'),
(SELECT id from genre_jeu where nom_genre='gestion'),
(SELECT id from theme_jeu where nom_theme='fantastique'),
(SELECT id from editeur_jeu where nom_editeur='eligos'),
10,2,4);

INSERT INTO jeu (nom_jeu,id_type,id_genre,id_theme,id_editeur,age_minimum,nombre_joueurs_minimum,nombre_joueurs_maximum)
VALUES ('la bataille de Thiruvananthapuram',
(SELECT id from type_jeu where nom_type='jeu de plateau'),
(SELECT id from genre_jeu where nom_genre='stratégie'),
(SELECT id from theme_jeu where nom_theme='contemporain'),
(SELECT id from editeur_jeu where nom_editeur='édijeu'),
12,1,2);

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (6,'Giuseppe Pino',
(SELECT id from jeu where nom_jeu='tourelles'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (9,'Stefan Bergdorf',
(SELECT id from jeu where nom_jeu='colonisons le système'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (1,'Uwe Klinentir',
(SELECT id from jeu where nom_jeu='meurtre à Bydgoszcz'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (4,'Armande Moly',
(SELECT id from jeu where nom_jeu='la bataille de Thiruvananthapuram'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (9,'Gaston Portaleau',
(SELECT id from jeu where nom_jeu='à l''aquitaine'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (8,'Stefan Bergdorf',
(SELECT id from jeu where nom_jeu='princes et duchesses'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (7,'Liz Smallhead',
(SELECT id from jeu where nom_jeu='princes et duchesses'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (9,'Stefan Bergdorf',
(SELECT id from jeu where nom_jeu='la bataille de Thiruvananthapuram'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (5,'Mike Looflow',
(SELECT id from jeu where nom_jeu='à l''aquitaine'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (5,'Armande Moly',
(SELECT id from jeu where nom_jeu='monstres à Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (10,'Stefan Bergdorf',
(SELECT id from jeu where nom_jeu='tourelles'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (8,'Marta Hernanmingues',
(SELECT id from jeu where nom_jeu='à l''aquitaine'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (6,'Armande Moly',
(SELECT id from jeu where nom_jeu='nom d''une tentacule'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (2,'Didier Loyal',
(SELECT id from jeu where nom_jeu='meurtre à Bydgoszcz'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (10,'Liz Smallhead',
(SELECT id from jeu where nom_jeu='colonisons le système'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (7,'Uwe Klinentir',
(SELECT id from jeu where nom_jeu='le dernier tour'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (4,'Mike Looflow',
(SELECT id from jeu where nom_jeu='à l''aquitaine'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (4,'Stefan Bergdorf',
(SELECT id from jeu where nom_jeu='le dernier tour'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (7,'Marta Hernanmingues',
(SELECT id from jeu where nom_jeu='nom d''une tentacule'));

INSERT INTO note_jeu (note, nom_testeur, id_jeu)
VALUES (3,'Giuseppe Pino',
(SELECT id from jeu where nom_jeu='planificateur'));