pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage 'Gradle Static Analysis'
            withSonarQubeEnv {
                sh "./gradlew clean sonarqube"
            }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}