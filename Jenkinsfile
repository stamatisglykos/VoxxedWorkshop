pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        parallel(
          "Compile": {
            sh 'ls -al'
            sh 'chmod +x mvnw'
            sh './mvnw compile'
            
          },
          "": {
            sleep 60
            
          }
        )
      }
    }
    stage('Unit test') {
      steps {
        sh './mvnw test'
      }
    }
    stage('Build') {
      steps {
        sh './mvnw -Dskip.test package'
      }
    }
    stage('Build Docker Image') {
      steps {
        sh 'docker build -t 10.0.2.15:5000/voxxedsg .'
        sh 'docker push 10.0.2.15:5000/voxxedsg'
      }
    }
  }
  triggers {
    pollSCM('* * * * *')
  }
}