/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiException;
import org.genome_nexus.client.CuriousCases;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CuriousCasesControllerApi
 */
@Ignore
public class CuriousCasesControllerApiTest {

    private final CuriousCasesControllerApi api = new CuriousCasesControllerApi();

    
    /**
     * Retrieves Curious Cases info by a genomic location
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchCuriousCasesGETTest() throws ApiException {
        String genomicLocation = null;
        CuriousCases response = api.fetchCuriousCasesGET(genomicLocation);

        // TODO: test validations
    }
    
}
