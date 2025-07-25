#!/bin/env groovy
def call() {

    echo "building the jar file for the branch $BRANCH_NAME"
    sh "mvn package"
}