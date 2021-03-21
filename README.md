# Aerospike-Demo
================

This repository contains the simple sample Springboot code to show how can we connect Aerospike database.

Getting Started
---------------
This project uses the Maven build system, JAVA 8 and Docker(*to setup Aerospike for development*). 
You can create JAR using `mvn clean package`

*   Setup Aerospike DB `sh start-aerospike.sh`
*   Setup AQL for querying DB `sh start-aql.sh` - This can be used later to query Aerospike to verify DB operations and can act as playground for accessing Aerospike.
*   Run main from `com.javedrpi.aerospikedemo.AerospikeDemoApplication`

DB Operations
-------------
* Add a record - Response(HTTP 201: Created)
`curl --location --request POST 'http://localhost:8080/customers' \
 --header 'Content-Type: application/json' \
 --data-raw '{
     "id":2,
     "name": "Jane",
     "email": "Jane@gmail.com",
     "age": 25
 }'`
 
 * Query the record using ID
 `http://localhost:8080/customers/2`
