pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -version' // Verify Maven installation
                sh 'mvn clean install -DskipTests' // Execute Maven command
            }
        }
    }
}
