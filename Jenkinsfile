pipeline {
    agent any
environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE    = 'sqlite'
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

                        }
                    }

        stage('Build') {
            steps {
            echo "My branch is: ${env.BRANCH_NAME}"
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        stage('publish image') {
                    steps {
                        echo 'publish image into kubernates....'
                    }
                }
    }
}