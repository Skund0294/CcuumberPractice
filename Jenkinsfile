pipeline{
	
	agent any
	
	tools {
        maven "My_MAVEN"
        jdk "JDK"
    }
  
  parameters{
  string(name:'Tag to execute', defaultValue:'@SampleTest')
  string(name:'Threads', defaultValue:'12')
  }
	
	stages{
		stage("Clean and Build"){
		steps{
		echo 'Running the clean and build stage.'
		}
		}
		stage("Execute Tests"){
		steps{
			script{
			sh 'mvn clean install'
			}
		}
		}
		stage("Cleanup and Reporting"){
		steps{
		echo 'Running the cleanup and reporting stage.'
		}
		}
		
		{
stage(“Publish Reports”) {
echo "***** Publish Reports ***"
step([
$class: ‘CucumberReportPublisher’,
failedFeaturesNumber: 0,
failedScenariosNumber: 0,
failedStepsNumber: 0,
fileExcludePattern: ‘’,
fileIncludePattern: '**/*.json’,
jsonReportDirectory: ‘target/cucumber-reports’,
parallelTesting: true,
pendingStepsNumber: 0,
skippedStepsNumber: 0,
trendsLimit: 0,
undefinedStepsNumber: 0,
classifications: runClassifications
])
}
}
		
		
		
		
		
		
		
		
		
		
		
}}
