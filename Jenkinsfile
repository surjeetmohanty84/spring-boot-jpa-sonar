pipeline {
    agent any
    stages {
        stage('Example Stage 1') {
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