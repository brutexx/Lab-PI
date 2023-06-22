#!/bin/bash

pom_achado=false;

#Vê se algum arquivo do diretório atual é pom.xml
for i in `find . -maxdepth 1 -type f` do
    if [ $i = 'pom.xml' ] then
        break;
    fi
done

#Vê se 
for i in `find . -maxdepth 1 -type d` do