API pour une application de gestion de voisin
Oumarou Mamane Nouridine et Hangachi Alassane Chafiou
28/07/2020

avant de demarrer le projet vous  devez bien configurer les identifiants de la base de donnée  dans le fichier src/main/resources/application.propertities, creé la base de donnée dans mysql avec le nom entrevoisins et renseigné le bon login et mot de passe de la BD dans application.properties.

pour demarrer l'application vous devez disposer d'un environnement java 8
avec la variable d'environnement 	JAVA_HOME contenant le chemin du jdk 8 ainsi que maven(gestionnaire de package java   ) qu'il faudra aussi installer qui va vous permettre de telecharger les dépendances du projet il faut aussi créé la variable d'environnement M2_HOME contenant le chemin de maven.

ensuite vous pouvez tappé la commande suivante en ligne de commande dans le repertoire racine du projet pour demmarrer : mvn spring-boot:run

        repertoire-du-projet>mvn spring-boot:run


NB: executer la commande mvn install afin d'installer les dependances avant de démarrer.

        repertoire-du-projet>mvn install
