#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
GENOME_NEXUS_API_DOCS=${1:-http://genomenexus.org/v2/api-docs}
SWAGGER_CODEGEN_CLI_JAR="swagger-codegen-cli.jar"

# switch to the script directory
cd ${SCRIPT_DIR}

# only download the client if it is not already downloaded
if [ ! -f ${SWAGGER_CODEGEN_CLI_JAR} ]; then
    wget http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.3.1/swagger-codegen-cli-2.3.1.jar -O ${SWAGGER_CODEGEN_CLI_JAR}
fi

# generate java modules (see config json files for more details)
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${GENOME_NEXUS_API_DOCS} -l java -c genomeNexusPublicApiClientConfig.json -o ../genomeNexusPublicApiClient
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${GENOME_NEXUS_API_DOCS}?group=internal -l java -c genomeNexusInternalApiClientConfig.json -o ../genomeNexusInternalApiClient
