# notes-jeux

## Configuration du serveur Postgres
* Télécharger la dernière version de Postgres via le lien : https://www.postgresql.org/download/
* Lancer l'installation, un mot de passe sera demandé pour le superuser *postgres*
* Lancer pgAdmin4 une fois l'installation terminée.

## Démarrage de l'application

Installer les dépendances du projet via la commande : 
```
mvn clean install
```

Lancer l'application via la commande : 
```
mvn spring-boot:run
```