pipeline{
   agent any
	tools {
        maven 'Maven' 
    }
	stages{
		stage('checkout'){
		  steps{
		      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/mayankc5/RestAssuredAPIAutomation.git']]])
		     
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
		stage('report generation'){
			steps{
			cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
			}
		}
		
	}
}
