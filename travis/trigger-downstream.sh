#!/usr/bin/env bash

# shellcheck source=/dev/null
. "${BASH_SOURCE%/*}"/trigger-travis.sh

declare -a downstream=("geodesy-domain-model")
trigger-travis "${downstream[@]}"

