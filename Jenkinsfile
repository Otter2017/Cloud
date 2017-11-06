pipeline {
  agent any
  stages {
    stage('git') {
      steps {
        echo 'Begin Fetch code from  GitHub'
      }
    }
    stage('fetch Code') {
      steps {
        git(url: 'https://github.com/otter2017/cloud/configserver', branch: 'master', changelog: true)
      }
    }
    stage('') {
      steps {
        echo 'Fetch Code end'
      }
    }
  }
}