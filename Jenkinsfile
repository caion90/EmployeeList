pipeline {
  agent any
  stages {
    stage('Verify tooling') {
      steps {
        sh '''
          sudo docker-compose down
          sudo docker version
          sudo docker info
          sudo docker-compose version
          curl --version
          jq --version
          '''
      }
    }
     }
      stage('Build container') {
        steps {
         sh '''
         sudo docker-compose build
         sudo docker-compose up -d --no-color
         '''
      }
      }
    }
