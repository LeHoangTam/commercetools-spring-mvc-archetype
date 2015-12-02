Create a project
----------------

```bash
mvn archetype:generate \
  -DarchetypeGroupId=io.sphere.maven-archetypes \
  -DarchetypeArtifactId=commercetools-spring-mvc-quickstart \
  -DarchetypeVersion=0.1.9 \
  -DgroupId=io.sphere.demo \
  -DartifactId=commercetools-spring-mvc \
  -Dversion=0.2.0-SNAPSHOT \
  -DcommercetoolsProjectKey=<YOUR PROJECT KEY> \
  -DcommercetoolsClientId=<YOUR CLIENT ID> \
  -DcommercetoolsClientSecret=<YOUR CLIENT SECRET>
```

Run the project
----------------

```bash
mvn tomcat7:run
```

Test on the browser
-------------------

[http://localhost:8080/](http://localhost:8080/)


Creating a new project in Eclipse
----------------------------------

* Import archetype URI by `Import ... > Projects from Git > Clone URI`
* Install the archetype in local repository with `mvn install`
* Go to `Preferences > Maven > Archetypes` and `Add Local Catalog`
* Select the catalog from file (`archetype-catalog.xml`) 
* Create new Maven project and select the archetype (remember so select `Include snapshot archetypes`)

If you have any troubles with installation in Eclipse, you may want to have a look at this issue: #74

Credits
-------

This template is a modified copy of https://github.com/kolorobot/spring-mvc-quickstart-archetype