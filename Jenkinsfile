pipeline {
    agent any

    environment {
        registry = "panduboyina/bankingapp-2.0-snapshot"
        registryCredential = 'panduboyina'
        dockerImage=''
    }

    stages {
    stage('Checkout') {
                steps {
                  echo "environment is ${DISABLE_AUTH}"
                   checkout scm
                }
            }

          stage ('Compile Stage')  {
                        steps {
                         echo "compile the  code"
                         sh './gradlew clean build'


                        }
                    }

        stage('Build image') {
            steps {
            script {
                dockerImage = docker.build registry + ":$BUILD_NUMBER"
                    }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }

        stage('Deploy image') {
            steps {
            script {
                       docker.withRegistry( 'https://registry.hub.docker.com', registryCredential) {
                        dockerImage.push()
                                }
                        }

            }

        stage('Publish Image') {
                    steps {
                        echo 'publish image into kubernates....'
                    }
                }
    }
}