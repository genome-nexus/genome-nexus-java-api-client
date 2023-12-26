/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import org.genome_nexus.ApiException;
import org.genome_nexus.client.MutationAssessor;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MutationAssessorControllerApi
 */
@Disabled
public class MutationAssessorControllerApiTest {

    private final MutationAssessorControllerApi api = new MutationAssessorControllerApi();

    /**
     * Retrieves mutation assessor information for the provided list of variants
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchMutationAssessorAnnotationGETTest() throws ApiException {
        String variant = null;
        MutationAssessor response = api.fetchMutationAssessorAnnotationGET(variant);
        // TODO: test validations
    }

    /**
     * Retrieves mutation assessor information for the provided list of variants
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postMutationAssessorAnnotationTest() throws ApiException {
        List<String> variants = null;
        List<MutationAssessor> response = api.postMutationAssessorAnnotation(variants);
        // TODO: test validations
    }

}
