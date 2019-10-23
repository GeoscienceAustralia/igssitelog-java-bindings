#!/usr/bin/env bash

export AWS_DEFAULT_REGION=ap-southeast-2

if [ "${TRAVIS_PULL_REQUEST}" = "false" ]; then
    nix-shell --command "mvn --settings travis/maven-settings.xml deploy"
else
    nix-shell --command "mvn --settings travis/maven-settings.xml test"
fi
