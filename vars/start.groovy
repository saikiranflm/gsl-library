def call(){
  pipeline {
    agent none
    stages {
        stage('Example') {
            steps {
                echo 'My first code'
            }
        }
    }
}
}
  
  
