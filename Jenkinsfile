pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ndivhomagidi00/just-testing.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                // Example for Maven projects; adjust as necessary for your build tool
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Run your tests; this example uses Maven
                bat 'mvn test'
            }
            post {
                always {
                    // Archive the test results (adjust the path as needed)
                    archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', allowEmptyArchive: true
                    
                    // Publish test results to Jenkins (adjust path as needed)
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
