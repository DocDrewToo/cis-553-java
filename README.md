# cis557
cis557 project


Download Project:
```shell
git clone https://github.com/DocDrewToo/cis-553-java.git
```

To build:
From: cis-553-java/project/
```shell
/mvnw clean install
```

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


