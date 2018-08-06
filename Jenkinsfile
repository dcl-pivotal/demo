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
            	pushToCloudFoundry cloudSpace: 'HCSC-dev', credentialsId: 'PCF-Credentials', organization: 'deloitte-poc', target: 'api.run.pivotal.io'
            }
        }
    }
}