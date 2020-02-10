DROP TABLE IF EXISTS jeu;
DROP TABLE IF EXISTS type_jeu;
DROP TABLE IF EXISTS genre_jeu;
DROP TABLE IF EXISTS theme_jeu;
DROP TABLE IF EXISTS editeur_jeu;
DROP TABLE IF EXISTS note_jeu;

CREATE TABLE jeu(
id SERIAL,
nom_jeu TEXT,
id_type INT,
id_genre INT,
id_theme INT,
id_editeur INT,
age_minimum INT,
nombre_joueurs_minimum INT,
nombre_joueurs_maximum INT);

CREATE TABLE type_jeu(
id SERIAL,
nom_type TEXT);

CREATE TABLE genre_jeu(
id SERIAL,
nom_genre TEXT);

CREATE TABLE theme_jeu(
id SERIAL,
nom_theme TEXT);

CREATE TABLE editeur_jeu(
id SERIAL,
nom_editeur TEXT);

CREATE TABLE note_jeu(
id SERIAL,
note INT,
nom_testeur TEXT,
id_jeu INT);