#!/usr/bin/env groovy
node {

    environment {
        registry = "panduboyina/bankingapp-2.0-snapshot"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }


        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile Stage') {
            steps {
                echo "compile the  code"
                sh './gradlew clean build'


            }
        }

        stage('Build image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', registryCredential)
                    // dockerImage = docker.build(registry + ":$BUILD_NUMBER")
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
                    docker.withRegistry('https://registry.hub.docker.com', registryCredential) {
                        dockerImage.push()
                    }
                }

            }
        }
        stage('Publish Image') {
            steps {
                echo 'publish image into kubernates....'
            }
        }

}
