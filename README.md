# genome-nexus-java-api-client
Java API Client for [Genome Nexus](https://www.genomenexus.org)

The api generation script (`scripts/generateApiClientModules.sh`) defaults to using `http://genomenexus.org/v2/api-docs`. However, the user can override this by passing in an alternate URL as a command line argument.

### Generate API Client Based on Production Genome Nexus
To generate the api client based on the production Genome Nexus instance, run:
```
. scripts/generateApiClientModules.sh
```

### Generate API Client Based on Custom Genome Nexus
To generate the api client based on a custom instance of Genome Nexus, deploy a local Genome Nexus instance using desired codebase and run:
```
. scripts/generateApiClientModules.sh localhost:38080/v2/api-docs
```

## Get latest release from jitpack
[![Release](https://jitpack.io/v/genome-nexus/genome-nexus-java-api-client.svg)](https://jitpack.io/#genome-nexus/genome-nexus-java-api-client)
