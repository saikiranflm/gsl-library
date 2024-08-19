def call(){
  stage("checkout"){
    git"https://github.com/saikiranflm/one.git"
  }
   stage("Build"){
     sh "mvn clean install"
   }
}
  
  
