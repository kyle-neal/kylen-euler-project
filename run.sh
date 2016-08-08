#!/usr/bin/env bash

CLASS="$1"

if [ -z "${CLASS}" ]; then
    echo "Usage: ./run <CLASS>"
    exit 1
fi

java -cp bin/ ${CLASS}
