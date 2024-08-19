def call(){
  pipeline{
    agent any
    stages("code"){
      steps{
        git"https://github.com/saikiranflm/one.git"
      }
    }
    stages("build"){
      steps{
        sh "mvn clean package"
      }
    }
  }
}
  
  
