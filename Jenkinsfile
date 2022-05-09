pipeline {
    agent any
    stages {
        stage('SonarQube Code Quality Check') {
        	agent {
        	    docker {
    	            image 'dockerrock123/spring-boot-jpa:v1'
    	        }
        	}

            steps {
                parallel(
                        "step 1": { echo "hello" },
                        "step 2": { echo "world" },
                        "step 3": { echo "world" }
                )
            }
        }
        stage('Example Stage 2') {
            steps {
                parallel(
                        "step 1": { echo "hello" },
                        "step 2": { echo "world" },
                        "step 3": { echo "world" }
                )
            }
        }
    }
}