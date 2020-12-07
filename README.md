# insider

# HOW TO RUN

```
    mvn package docker:build
    docker images
    docker run -p 127.0.0.1:8080:8080/tcp <IMAGE_ID>

```
# API's
  ```
  localhost:8080/top-stories
  localhost:8080/comments/<story_id>
  localhost:8080/past-stories
  ```
