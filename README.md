# genome-nexus-java-api-client
Java API Client for [Genome Nexus](https://www.genomenexus.org)

To generate the api client, run:
```
. scripts/generateApiClientModules.sh
```

The script defaults to using `http://genomenexus.org/v2/api-docs` to generate the api client modules. However, the user can override this by passing in an alternate URL as a command line argument.

Deploy a local Genome Nexus instance using desired codebase and run:
```
. scripts/generateApiClientModules.sh localhost:38080/v2/api-docs
```

## Get latest release from jitpack
[![Release](https://jitpack.io/v/genome-nexus/genome-nexus-java-api-client.svg)](https://jitpack.io/#genome-nexus/genome-nexus-java-api-client)
