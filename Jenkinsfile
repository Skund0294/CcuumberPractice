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
}
post {
        success {
        
echo "Test succeeded"
            script {
            cucumber fileIncludePattern: '**/cucumber-report.json', sortingMethod: 'ALPHABETICAL'
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: true, reportDir: '/home/reports', reportFiles: 'reports.html', reportName: 'Performance Test Report', reportTitles: ''])
            }
     
        }
        failure {
            echo "Test failed"
            cucumber fileIncludePattern: '**/cucumber-report.json', sortingMethod: 'ALPHABETICAL'
publishHTML([allowMissing: true, alwaysLinkToLastBuild: false, keepAll: true, reportDir: '/home/tester/reports', reportFiles: 'reports.html', reportName: 'Performance Test Report', reportTitles: ''])
        }
    }
}
}