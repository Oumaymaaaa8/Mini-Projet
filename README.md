Bien sûr, voici une introduction améliorée pour votre projet Git :

---

# Projet Java : Communication Distribuée

Ce projet Java explore les technologies de communication distribuée, à savoir Java RMI, gRPC et les sockets. L'objectif principal est de comprendre en profondeur les différences, les fonctionnalités et les cas d'utilisation de chacune de ces technologies en implémentant des serveurs et des clients pour chaque approche.

Ce projet se concentre sur trois technologies majeures :

1. **Java RMI (Remote Method Invocation)** : Un mécanisme intégré à Java pour permettre l'appel de méthodes sur des objets distants, offrant une communication transparente entre les processus Java.
2. **gRPC** : Un framework RPC (Remote Procedure Call) open-source développé par Google, basé sur le protocole HTTP/2 pour une communication efficace et polyglotte entre des services distribués.

3. **Sockets** : Les sockets offrent un moyen bas niveau de communication entre des applications sur un réseau, permettant un contrôle total sur la communication à un niveau de granularité plus fin.

## Objectif

Ce projet vise à comparer ces trois approches en implémentant des fonctionnalités similaires à l'aide de chacune d'elles. Chaque technologie sera utilisée pour développer des fonctionnalités spécifiques, permettant ainsi une évaluation comparative de leurs performances, de leur complexité de mise en œuvre et de leur extensibilité.

## Structure du Projet

Le projet est divisé en plusieurs parties, chaque partie étant dédiée à une technologie spécifique de communication distribuée :

- **Partie I : Gestion des Tâches avec Java RMI**
- **Partie II : Communication Distribuée avec gRPC**
- **Partie III : Service de Chat avec les Sockets**

Chaque partie du projet contient des instructions détaillées sur la configuration et le test des serveurs et des clients pour cette technologie particulière. \*_lien rapport_ : https://tinyurl.com/3bdzk7fy

---

## Partie I : Gestion des Tâches avec Java RMI

### Instructions de Test :

1. Ouvrez un terminal dans le dossier du projet.
2. Compilez toutes les classes Java existantes en utilisant la commande suivante : `javac *.java`.
3. Démarrez le registre RMI en tapant la commande suivante (pour Linux) : `rmiregistry &`.
4. Démarrez le serveur en tapant la commande `java ServeurRmi`.
5. Enfin, dans un autre terminal, démarrez le client avec la commande `java ClientRMI`.

## Partie I : Envoi et reception des messages avec gRPC

Voici les instructions de test pour exécuter le serveur et le client gRPC dans Eclipse :

### Instructions de Test :

#### Exécuter le Serveur gRPC :

1. Ouvrez Eclipse.
2. Importez le dossier "GRPCmessagerie" dans Eclipse en tant que projet Java.
3. Ouvrez la classe principale du serveur gRPC dans Eclipse (assurez-vous que la classe principale est correctement identifiée dans le projet : le dossier est nommé ArtifactId ).
4. Cliquez avec le bouton droit sur la classe principale du serveur : src/main/java/Server.java.
5. Sélectionnez "Run As" > "Java Application".
   Le serveur gRPC démarrera et affichera les logs dans la console Eclipse.

#### Exécuter le Client gRPC :

1. Dans Eclipse, assurez-vous que le projet "GRPCmessagerie" est ouvert.
2. Ouvrez la classe principale du client gRPC dans Eclipse (assurez-vous qu'elle est correctement identifiée dans le projet: le dossier est nommé id ).
3. Cliquez avec le bouton droit sur la classe principale du client : src/main/java/id/Client.java.
4. Sélectionnez "Run As" > "Java Application".
   Le client gRPC démarrera et commencera à envoyer des requêtes au serveur.

## Partie III : Service de Chat avec les Sockets

### Instructions de Test :

1. Ouvrez un terminal dans le dossier du projet.
2. Compilez toutes les classes Java existantes en utilisant la commande suivante : `javac *.java`.
3. Démarrez le serveur en tapant la commande `java SocketServeur`.
4. La création d'un nouveau client se fait en utilisant l'application Telnet : ouvrez la ligne de commande dans le dossier du projet et tapez la commande `telnet localhost 9090`. Le port 9090 est utilisé par le serveur. Vous pouvez ajouter un nouveau client en se connectant au serveur, en utilisant la même méthode, dans un autre terminal.
