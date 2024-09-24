pipeline {
  agent any
  stages {
    stage('Verify tooling') {
      steps {
        sh '''
          sudo docker version
          sudo docker info
          sudo docker-compose version
          curl --version
          jq --version
          '''
      }
    }
      stage('Prune all docker data') {
        steps {
          sh 'sudo docker system prune -a --volumes -f'
      }
     }
      stage('Build container') {
        steps {
         sh '''
         sudo docker-compose build
         sudo docker-compose down
         sudo docker-compose up -d --no-color
         '''
      }
    }
  }
  post {
    success {
      sh '''
      sudo docker-compose up -d --no-color
      '''
    }
  }
}
