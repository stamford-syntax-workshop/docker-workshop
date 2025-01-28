# Basic Docker Command for the Workshop

## To build docker image locally
```bash
docker build -t java-app .
```

## To run the built image
```bash
docker run -it java-app
```

## To build docker image for docker hub with multi-platforms
```bash
docker build -t [username]/java --platform linux/amd64,linux/arm64 .java-app
```

## To push built image into docker hub
```bash
docker push [username]/java-app
```

## To pull built image from docker hub
```bash
docker pull [username]/java-app
```
### OR
## To pull and run the image directly
```bash
docker run -it [username]/java-app
```
> **_NOTE:_** "-it" flag in the command is used for running intereactive applications
