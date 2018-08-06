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
				pushToCloudFoundry cloudSpace: 'development', credentialsId: 'f95dddac-4eaf-426a-8f76-420cddaa1c0c', organization: 'PCF-Deloitte', target: 'api.run.pivotal.io'
            }
        }
    }
}