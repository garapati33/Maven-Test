pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout source code from the repository
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests using Maven
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy artifacts to a server or repository
                // Add deployment steps as needed
            }
        }
    }

    post {
        always {
            // Archive artifacts for later reference
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
}
