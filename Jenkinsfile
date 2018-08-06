pipeline { 
    agent any 
    stages {
        stage('Build') { 
            steps { 
            	sh 'mvn clean install'
            }
        }
        stage('Test') { 
            steps { 
               echo 'the application is validated now'
            }
        }           
        stage('NexusPush') { 
            steps { 
               echo 'the application is pushed to nexus!'
            }
        } 
        stage('PCF-Deploy') { 
            steps { 
				pushToCloudFoundry cloudSpace: 'development', credentialsId: 'f95dddac-4eaf-426a-8f76-420cddaa1c0c', organization: 'PCF-Deloitte', target: 'api.run.pivotal.io'
            }
        }
    }
}