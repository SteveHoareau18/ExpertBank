ExpertBank : La Banque des Expert
========================

<p>Auteur : Steve HOAREAU</p>
<p>Contributions: Maxime Clain et Samuel Etienne</p>
<p>Projet cible : WildFly</p>
<p>Source : https://github.com/wildfly/quickstart/</p>

Qu'est-ce que c'est?
C'est le back end d'ExpertBank en Java EE (Jakarta)

L'application produite par ce projet est conçue pour être exécutée sur JBoss WildFly.

Configurer Maven
Si ce n'est pas déjà fait, vous devez Configurer Maven avant de tester les guides rapides.

Démarrer JBoss WildFly avec le profil Web
Ouvrez une ligne de commande et naviguez jusqu'à la racine du répertoire du serveur JBoss.
La ligne de commande suivante montre comment démarrer le serveur avec le profil web :
```bash
# Pour Linux
JBOSS_HOME/bin/standalone.sh


# Pour Windows
JBOSS_HOME\bin\standalone.bat
```
Construire et déployer le guide rapide
REMARQUE : La commande de construction suivante suppose que vous avez configuré vos paramètres utilisateur Maven. Sinon, vous devez inclure les arguments de configuration Maven à la ligne de commande. Voir Construire et déployer les guides rapides pour des instructions complètes et des options supplémentaires.

Assurez-vous d'avoir démarré le serveur JBoss comme décrit ci-dessus.
Ouvrez une ligne de commande et naviguez jusqu'au répertoire racine de ce guide rapide.
Tapez cette commande pour construire et déployer l'archive :
```bash
mvn clean package wildfly:deploy
```
Cela déploiera target/ExpertBank.war sur l'instance en cours du serveur.

Accéder à l'application
L'application sera accessible à l'URL suivante : http://localhost:8080/ExpertBank/.

Désinstaller l'archive
Assurez-vous d'avoir démarré le serveur JBoss comme décrit ci-dessus.
Ouvrez une ligne de commande et naviguez jusqu'au répertoire racine de ce guide rapide.
Lorsque vous avez terminé les tests, tapez cette commande pour désinstaller l'archive :
```bash
mvn wildfly:undeploy
```
Exécuter les tests Arquillian
Ce guide rapide propose des tests Arquillian. Par défaut, ces tests sont configurés pour être ignorés car les tests Arquillian nécessitent l'utilisation d'un conteneur.

REMARQUE : Les commandes suivantes supposent que vous avez configuré vos paramètres utilisateur Maven. Sinon, vous devez inclure les arguments de configuration Maven à la ligne de commande. Voir Exécuter les tests Arquillian pour des instructions complètes et des options supplémentaires.

Assurez-vous d'avoir démarré le serveur JBoss comme décrit ci-dessus.
Ouvrez une ligne de commande et naviguez jusqu'au répertoire racine de ce guide rapide.
Tapez la commande suivante pour exécuter l'objectif de test avec le profil activé :
```bash
mvn clean test -Parq-wildfly-remote
```
Exécuter le guide rapide dans JBoss Developer Studio ou Eclipse
Vous pouvez également démarrer le serveur et déployer les guides rapides depuis Eclipse à l'aide des outils JBoss. Pour plus d'informations, consultez Utiliser JBoss Developer Studio ou Eclipse pour exécuter les guides rapides.

Déboguer l'application
Si vous souhaitez déboguer le code source ou consulter la documentation Java de n'importe quelle bibliothèque du projet, exécutez l'une des commandes suivantes pour les extraire dans votre dépôt local. L'IDE devrait alors les détecter.

```bash
mvn dependency:sources
mvn dependency:resolve -Dclassifier=javadoc
```
