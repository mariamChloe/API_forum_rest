# Projet API REST FORUM

## Description
API REST FORUM est une architecture RESTful développée avec le framework Spring Boot. L'objectif principal de ce projet est de créer une API REST complète pour la gestion d'un forum. Cette API permettra aux utilisateurs de créer, lire, mettre à jour et supprimer des sujets, des messages et des forums. Elle est conçue pour être flexible, évolutive et facile à intégrer dans d'autres applications.
## Installation

1-Pour installer et exécuter ce projet, suivez les étapes ci-dessous :

Clonez le dépôt :
https://github.com/mariamChloe/API_forum_rest

2-Configurez la base de données :

Modifiez le fichier application.properties pour configurer votre base de données (par exemple, PostgreSQL).


Exécutez l'application :

mvn sprint-boot:run



## Utilisation

Une fois l'application lancée, vous pouvez accéder aux endpoints de l'API via l'URL http://localhost:8080. Voici quelques exemples d'utilisation :


API Endpoints
Voici une liste des principaux endpoints de l'API :

Forums :

GET /api/forums : Récupère tous les forums.

POST /api/forums : Crée un nouveau forum.

GET /api/forums/{forumId} : Récupère un forum par son ID.

PUT /api/forums/{forumId} : Met à jour un forum par son ID.


Sujets :

GET /api/forums/{forumId}/sujets : Récupère tous les sujets d'un forum.

POST /api/forums/{forumId}/sujets : Crée un nouveau sujet dans un forum.

GET /api/sujets/{sujetId} : Récupère un sujet par son ID.



Messages :

GET /api/sujets/{sujetId}/messages : Récupère tous les messages d'un sujet.

POST /api/sujets/{sujetId}/messages : Crée un nouveau message dans un sujet.

GET /api/messages/{messageId} : Récupère un message par son ID.


## Contribution

Instructions pour contribuer au projet.

## Licence

Ce projet a ete realisé par 
Soumahoro Siriki Aboubacar
Traore Mariam
Cisse Kady
ATOS ACADEMY