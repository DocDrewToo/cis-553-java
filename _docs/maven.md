Clearing the Maven Cache
```sh
rm -rf ~/.m2
``` 
--or--
```sh
cd project
./mvnw dependency:purge-local-repository
```