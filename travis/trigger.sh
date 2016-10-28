#!/usr/bin/env bash

if [ ${TRAVIS_PULL_REQUEST} = 'false' ]; then
    body='{
    "request": {
      "branch":"master"
    }}'

    # TODO: abstract over repository, so we can trigger more than one build
    curl -s -X POST \
      -H "Content-Type: application/json" \
      -H "Accept: application/json" \
      -H "Travis-API-Version: 3" \
      -H "Authorization: token ${TRAVIS_TOKEN}" \
      -d "$body" \
      https://api.travis-ci.org/repo/GeoscienceAustralia%2Fgeodesy-domain-model/requests
fi
