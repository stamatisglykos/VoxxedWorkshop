pipeline{
	agent any
	stages{
		stage('Compile'){
			sh 'mvnw compile'
		}
		stage('Unit test'){
			sh 'mvnw test'
		}
		stage('Build'){
			sh 'mvnw -Dskip.test package'
		}
		stage('Code Coverege'){
		}
		stage('Static code analysis') {
		}		
	}	
}