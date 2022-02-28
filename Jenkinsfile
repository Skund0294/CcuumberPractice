pipeline{
	
	agent any
  
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
		stage("Destroy everything"){
		steps{
		echo 'Running the destroy everything stage.'
		}
		}
}}
