#!/bin/bash
cat <<EOF | sudo tee /etc/systemd/system/myapp.service
[Unit]
Description=My Spring Boot App
After=network.target

[Service]
WorkingDirectory=/opt/myapp
ExecStart=/usr/bin/java -jar /opt/myapp/app.jar --server.port=80
Restart=always
User=root

[Install]
WantedBy=multi-user.target
EOF

sudo systemctl daemon-reload
