

Create a project
----------------

```bash
mvn archetype:generate \
    -DarchetypeGroupId=com.github.spring-mvc-archetypes \
    -DarchetypeArtifactId=spring-mvc-quickstart \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=my.groupid \
    -DartifactId=my-artifactId \
    -Dversion=version
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