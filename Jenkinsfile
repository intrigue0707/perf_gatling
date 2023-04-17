pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                https://github.com/intrigue0707/perf_gatling.git

                // Run Maven on a Unix agent.
                sh 'mvn gatling:test'

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    gatlingArchive()
                }
            }
        }
    }
}
