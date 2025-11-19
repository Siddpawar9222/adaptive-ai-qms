#!/bin/bash
echo "Waiting 60 seconds before health check..."
sleep 60

if curl -fs http://localhost:80/actuator/health/readiness; then
  echo "App is UP"
  exit 0
else
  echo "App failed to start"
  exit 1
fi
