pipeline{
    agent any
    
    stages {
        stage ('build') {
            steps {
                withMaven(maven : 'maven_3_5_4') {
                    sh 'mvn clean install'
                }
            }

        }
        stage('push'){
            steps {
                pushToCloudFoundry cloudSpace: 'HCSC-dev', credentialsId: 'PCF-Credentials', organization: 'deloitte-poc', target: 'api.run.pivotal.io'
            }
        }
    }
}
