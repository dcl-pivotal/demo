pipeline { 
    agent any 
    stages {
        stage('Build') { 
            steps { 
            	sh 'mvn clean install'
            }
        }
        stage('Run Tests') {
            parallel {
                stage('Smoke Test') {

                    steps {
                        echo 'this build  is validated now'
                    }

                }
                stage('L&P Test') {
    
                    steps {
                        echo 'this build  is L&P tested now'
                    }

                }
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