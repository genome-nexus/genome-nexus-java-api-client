#!/usr/bin/env bash
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
SCRIPT_DIR_PARENT="$( cd "$SCRIPT_DIR/.." && pwd )"
GENOME_NEXUS_API_DOCS=${1:-https://genomenexus.org/v2/api-docs}
SWAGGER_CODEGEN_CLI_JAR="$SCRIPT_DIR/openapi-generator-cli.jar"

# only download the client if it is not already downloaded
if [ ! -f ${SWAGGER_CODEGEN_CLI_JAR} ]; then
    if which curl ; then
        curl 'https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.2.0/openapi-generator-cli-7.2.0.jar -O openapi-generator-cli.jar' --output ${SWAGGER_CODEGEN_CLI_JAR}
    else
        if which wget ; then
            wget 'https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.2.0/openapi-generator-cli-7.2.0.jar -O openapi-generator-cli.jar' -O ${SWAGGER_CODEGEN_CLI_JAR}
        else
            echo "Error : could not find curl or wget for downloading openapi-generator-cli" 1>&2
            exit 1
        fi
    fi
fi

# remove the modules if available (otherwise some legacy methods in the test will not get removed)
rm -rf "${SCRIPT_DIR_PARENT}/genomeNexusPublicApiClient"
rm -rf "${SCRIPT_DIR_PARENT}/genomeNexusInternalApiClient"

# generate java modules (see config json files for more details)
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${GENOME_NEXUS_API_DOCS} -g java -c genomeNexusPublicApiClientConfig.json -o "$SCRIPT_DIR_PARENT/genomeNexusPublicApiClient" --skip-validate-spec
java -jar ${SWAGGER_CODEGEN_CLI_JAR} generate -i ${GENOME_NEXUS_API_DOCS}?group=internal -g java -c genomeNexusInternalApiClientConfig.json -o "$SCRIPT_DIR_PARENT/genomeNexusInternalApiClient" --skip-validate-spec

# TODO script the following:
# I manually modified ./genomeNexusPublicApiClient/pom.xml and ./genomeNexusInternalApiClient/pom.xml to compile java 21 code (and also the java style 21)
# <properties>
#   <java.version>21</java.version>
# </properties>
# and
# <googleJavaFormat>
#   <version>21</version>
# </googleJavaFormat>
