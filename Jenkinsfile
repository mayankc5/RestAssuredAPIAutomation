pipeline{
   agent any
	tools {
        maven 'Maven' 
    }
	stages{
		stage('checkout'){
		  steps{
		      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/mayankc5/seleniumautomationframework.git']]])
		     
		   }
		}
		
		stage('compile'){
			steps{
				bat label: '', script: 'mvn compile'
				}
			
		}
		stage('test'){
			steps{
				bat label: '', script: 'mvn test'
				}
			
		}
		
	}
}
