pipeline {

    agent any

    stages {

        stage("Build Maven") {

            steps {

                sh 'mvn -B clean package'

            }

        }

 stage('pullLatestCode'){

                git branch: 'main',

                 url: 'https://github.com/intrigue0707/perf_gatling.git'

        }

        stage("Run Gatling") {

            steps {

                sh 'mvn gatling:test'

            }

            post {

                always {

                    gatlingArchive()

                }

            }

        }

    }

}