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
import org.genome_nexus.client.EnsemblFilter;
import org.genome_nexus.client.EnsemblGene;
import org.genome_nexus.client.EnsemblTranscript;
import org.genome_nexus.client.GeneXref;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnsemblControllerApi
 */
@Disabled
public class EnsemblControllerApiTest {

    private final EnsemblControllerApi api = new EnsemblControllerApi();

    /**
     * Retrieves Ensembl canonical gene id by Entrez Gene Id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblGeneIdByEntrezGeneIdGETTest() throws ApiException {
        String entrezGeneId = null;
        EnsemblGene response = api.fetchCanonicalEnsemblGeneIdByEntrezGeneIdGET(entrezGeneId);
        // TODO: test validations
    }

    /**
     * Retrieves canonical Ensembl Gene ID by Entrez Gene Ids
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOSTTest() throws ApiException {
        List<String> entrezGeneIds = null;
        List<EnsemblGene> response = api.fetchCanonicalEnsemblGeneIdByEntrezGeneIdsPOST(entrezGeneIds);
        // TODO: test validations
    }

    /**
     * Retrieves Ensembl canonical gene id by Hugo Symbol
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblGeneIdByHugoSymbolGETTest() throws ApiException {
        String hugoSymbol = null;
        EnsemblGene response = api.fetchCanonicalEnsemblGeneIdByHugoSymbolGET(hugoSymbol);
        // TODO: test validations
    }

    /**
     * Retrieves canonical Ensembl Gene ID by Hugo Symbols
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblGeneIdByHugoSymbolsPOSTTest() throws ApiException {
        List<String> hugoSymbols = null;
        List<EnsemblGene> response = api.fetchCanonicalEnsemblGeneIdByHugoSymbolsPOST(hugoSymbols);
        // TODO: test validations
    }

    /**
     * Retrieves Ensembl canonical transcript by Hugo Symbol
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblTranscriptByHugoSymbolGETTest() throws ApiException {
        String hugoSymbol = null;
        String isoformOverrideSource = null;
        EnsemblTranscript response = api.fetchCanonicalEnsemblTranscriptByHugoSymbolGET(hugoSymbol, isoformOverrideSource);
        // TODO: test validations
    }

    /**
     * Retrieves Ensembl canonical transcripts by Hugo Symbols
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOSTTest() throws ApiException {
        List<String> hugoSymbols = null;
        String isoformOverrideSource = null;
        List<EnsemblTranscript> response = api.fetchCanonicalEnsemblTranscriptsByHugoSymbolsPOST(hugoSymbols, isoformOverrideSource);
        // TODO: test validations
    }

    /**
     * Retrieves the transcript by an Ensembl transcript ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchEnsemblTranscriptByTranscriptIdGETTest() throws ApiException {
        String transcriptId = null;
        EnsemblTranscript response = api.fetchEnsemblTranscriptByTranscriptIdGET(transcriptId);
        // TODO: test validations
    }

    /**
     * Retrieves Ensembl Transcripts by Ensembl transcript IDs, hugo Symbols, protein IDs, or gene IDs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchEnsemblTranscriptsByEnsemblFilterPOSTTest() throws ApiException {
        EnsemblFilter ensemblFilter = null;
        List<EnsemblTranscript> response = api.fetchEnsemblTranscriptsByEnsemblFilterPOST(ensemblFilter);
        // TODO: test validations
    }

    /**
     * Retrieves Ensembl Transcripts by protein ID, and gene ID. Retrieves all transcripts in case no query parameter provided
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchEnsemblTranscriptsGETTest() throws ApiException {
        String geneId = null;
        String proteinId = null;
        String hugoSymbol = null;
        List<EnsemblTranscript> response = api.fetchEnsemblTranscriptsGET(geneId, proteinId, hugoSymbol);
        // TODO: test validations
    }

    /**
     * Perform lookups of Ensembl identifiers and retrieve their external references in other databases
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fetchGeneXrefsGETTest() throws ApiException {
        String accession = null;
        List<GeneXref> response = api.fetchGeneXrefsGET(accession);
        // TODO: test validations
    }

}
