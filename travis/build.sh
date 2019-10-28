#!/usr/bin/env bash

if [ "${TRAVIS_PULL_REQUEST}" = "false" ]; then
    nix-shell --command "mvn deploy"
else
    nix-shell --command "mvn test"
fi
