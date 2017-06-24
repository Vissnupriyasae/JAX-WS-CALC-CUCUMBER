Simple calculator application using JAX-WS webservice API with Cucumber Integration
-------------------------------------

* This application uses JAX-WS java webservice to do all the operation.
* This application also has the small UI which we can perform simple arithmetic functionality
* The UI will use the webservice to do these arithmetic expression.

Technology Used
---------------

* JAX-WS
* CUCUMBER
* SELENIUM
* HTML,CSS,JAVASCRIPT
* TOMCAT

How to use this app
-------------------

This app will be used mostly in CI/ CD

* when you run this app using "maven clean test", This will do unit test and create a war file.
* Once the war is created, then you can deploy this in any webcontainer.
* Then if you run this app using "mvn clean verify -P integration-test", This will launch you app using selenium and run the integration test.
* If you use jenkins as CI/CD tool, then you can do the following

- Create a free style job
- Check out this code using Git
- Build the code using "maven clean test"
- In your POST build action, Use tomcat deplyment plugin to deploy the war file in to the container
- Then add another post build action and use "mvn clean verify -P integration-test" to run the selenium integration test.

Note: In your webapp, go to JS folder,open script.js, change your app port. By default, it is 8080.

How to run
----------


You can run unit tests by running the following command at the command prompt:

    mvn clean test

You can run integration tests by running the following command at the command prompt:

    mvn clean verify -P integration-test
    