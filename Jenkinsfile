#!/usr/bin/env groovy
node {

    environment {
        registry = "panduboyina/bankingapp-2.0-snapshot"
        registryCredential = 'dockerhub'
        dockerImage = ''
    }


        stage('Checkout') {

                checkout scm

        }

        stage('Compile Stage') {

                echo "compile the  code"
                sh './gradlew clean build'



        }

        stage('Build image') {

                script {
                    docker.withRegistry('https://registry.hub.docker.com', ":$registryCredential")
                    // dockerImage = docker.build(registry + ":$BUILD_NUMBER")
                }

        }
        stage('Test') {

                echo 'Testing..'

        }

        stage('Deploy image') {

                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
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
