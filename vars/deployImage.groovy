#!/bin/env groovy

def call(String imageName){
    def dockerRunCommand = "docker run -d -p 8080:8080 ${imageName}"
    echo "deploying the code"

    sshagent(['ec2-node-react']) {
        sh "ssh -o StrictHostKeyChecking=no ec2-user@13.201.191.234 ${dockerRunCommand}"
    }
}