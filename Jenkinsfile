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
		stage("Install Dependencies"){
		steps{
		echo 'Running the install dependencies stage.'
		}
		}
		stage("Execute Tests"){
		steps{
		echo 'Running the execute tests stage.'
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
