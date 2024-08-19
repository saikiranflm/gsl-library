#!/usr/bin/groovy
def call(){
pipeline {
    agent any
    stages{
        stage("code"){
            steps{
               git"https://github.com/saikiranflm/one.git"
            }
        }
        stage("build"){
            steps{
                sh "mvn clean install"
            }
        }
        // stage("sonar"){
        //     steps{

        //     }
        // }
        // stage("artifact"){
        //     steps{

        //     }
        // }
        // stage("deploy"){
        //     steps{

        //     }
        // }
    }
}
}
  
