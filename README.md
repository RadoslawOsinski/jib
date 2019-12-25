Building:
```
mvn package
mvn jib:dockerBuild
```        

Run:
```
docker run -p 8080:8080 eu.com.cwsfe.jib/test-project/jib-demo
```
