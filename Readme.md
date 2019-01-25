{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Aplicaci\'f3n spring conectada a CouchDatabase\
\
Aplicaci\'f3n realizada en springboot conectada a Una base de datos nosql (CouchDatabase)\
\
## Requisitos:\
Clonar el docker de la siguiente url:\
Working..\
\
## Instalaci\'f3n\
\
Limpiar e instalar dependencias\
\
```bash\
mvn clean install\
```\
\
Iniciar aplicaci\'f3n\
```bash\
mvn spring-boot:run\
```\
\
## Uso\
\
Para visualizar los servicios activos acceder a swagger en la siguiente ruta:\
```bash\
http://localhost:8080/swagger-ui.html\
```\
\
## Caracter\'edsticas:\
\
:zap: Conexi\'f3n a couchdatabase\
\
:zap: Swagger habilitado\
\
:zap: Consulta de registros (todos, por ciudad)\
\
:zap: Crear registro por medio de un servicio post\
\
\
}