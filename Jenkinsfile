pipeline{
	agent any
	stages{
		stage('Compile'){
			steps {
			    sh 'ls -al'
			    sh 'chmod +x mvnw'
				sh './mvnw compile'
			}			
		}
		stage('Unit test'){
			steps {
				sh './mvnw test'
			}			
		}
		stage('Build'){
			steps {
				sh './mvnw -Dskip.test package'
			}			
		}
				
	}	
}