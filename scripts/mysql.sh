#!/bin/bash
sudo apt upgrade
sudo apt upgrade
sudo apt -y install mysql-server
sudo /etc/init.d/mysql start  
mysql < mysql.txt