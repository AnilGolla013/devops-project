pipeline{
  agent any

  stages{
    stage('build'){
      steps{
        echo 'Compiling Java file...'
        bat 'javac *.java'
      }
    }
    stage('test'){
      steps{
        echo 'Running Tests...'
        bat 'java test'
      }
    }
    stage('deply'){
      steps{
        echo 'Running deploy..'
        bat 'java deploy'
      }
    }
  }
  post {
      success {
          echo '✅ Build, Test, Deploy pipeline completed successfully!'
      }
      failure {
          echo '❌ Something went wrong in the pipeline.'
      }
  }
}
