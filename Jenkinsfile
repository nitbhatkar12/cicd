pipeline {
  agent any
  environment {
    OPENSHIFT_SERVER = 'https://api.crc.testing:6443'
    NAMESPACE = 'cicd'
  }
  stages {
    stage('Deploy with Helm') {
      steps {
        withCredentials([string(credentialsId: 'openshift-token', variable: 'TOKEN')]) {
          sh '''
            oc login --token=$TOKEN --server=$OPENSHIFT_SERVER --insecure-skip-tls-verify
            oc project $NAMESPACE
            helm upgrade --install cicd-app ./helm-deployment
          '''
        }
      }
    }
  }
}
