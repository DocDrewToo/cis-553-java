# cis557
cis557 project

* Setup / build
* Running / Testing

Download Project:
```shell
git clone https://github.com/DocDrewToo/cis-553-java.git
```

# Build:
From the directory: cis-553-java/project/
```shell
/mvnw clean install
```

# Deploy (to GCP)
To Deploy to GCP App Engine
From Google Console
```shell
gcloud auth list
gcloud config set account docdrew@umich.edu
git clone https://github.com/DocDrewToo/cis-553-java.git
cd cis-553-java/
gcloud app create --region us-central
./mvnw appengine:deploy
```

# Deploy (locally)
* Manual Execution from command line: 
`./mvnw spring-boot:run`

# Deploy (via IntelliJ)
* Just press the 'run' button


# Application Endpoints:
1. Rest endpoint directly:
  http://localhost:8080/greeting

2. Always up-to-date docs on all API's
  http://localhost:8080/swagger-ui/index.html

