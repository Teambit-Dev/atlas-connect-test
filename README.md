To get started:

    npm install
    npm run build

before starting the spring boot app.

Use:
    
    npm run watch 

to watch for changes to your frontend code and re-webpack it

    
To run project:

    ./mvnw spring-boot:run -Dspring-boot.run.arguments="--addon.base-url=https://rnqhh-88-118-134-161.a.free.pinggy.link/" -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005"


Query issue

    http://localhost:8080/issue?hostBaseUrl=https://teambitdev.atlassian.net&issueKey=DEMO1
