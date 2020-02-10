# notes-jeux

## Configuration du serveur Postgres

* Télécharger la dernière version de Postgres via le lien : https://www.postgresql.org/download/
* Lancer l'installation, un mot de passe sera demandé pour le superuser *postgres*
* Lancer pgAdmin4 une fois l'installation terminée.

## Configuration requise

### Maven

Maven est nécessaire pour le démarrage de l'application, il est possible de le télécharger via le lien : https://maven.apache.org/download.cgi

Sous un environnement Linux, il est possible de l'installer via la commande : 
```
sudo apt install maven
```

## Démarrage de l'application

Installer les dépendances du projet via la commande : 
```
mvn clean install
```

Lancer l'application via la commande : 
```
mvn spring-boot:run
```
