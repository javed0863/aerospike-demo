docker run -it --rm aerospike/aerospike-tools aql -h  $(docker inspect -f '{{.NetworkSettings.IPAddress }}' aerospike)