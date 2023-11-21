pipeline {
    agent any
    environment {
        PATH = "C:/Maven/apache-maven-3.9.5/bin$PATH"
        // Add other environment variables as needed
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat "C:\\Windows\\System32\\cmd.exe /c mvn clean test"
            }
        }
    }
}
