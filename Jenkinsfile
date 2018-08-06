pipeline { 
    agent any 
    stages {
        stage('Build') { 
            steps { 
            	sh 'mvn clean install'
            }
        }
        stage('Deploy') { 
            steps { 
            	pushToCloudFoundry cloudSpace: 'development', credentialsId: 'PCF-Credentials', organization: 'balu-org', target: 'api.run.pivotal.io'
            }
        }
    }
}