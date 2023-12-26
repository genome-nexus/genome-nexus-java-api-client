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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.genome_nexus.JSON;

/**
 * MutationAssessor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:07.493659809-05:00[America/New_York]")
public class MutationAssessor {
  public static final String SERIALIZED_NAME_CODON_START_POSITION = "codonStartPosition";
  @SerializedName(SERIALIZED_NAME_CODON_START_POSITION)
  private String codonStartPosition;

  public static final String SERIALIZED_NAME_COSMIC_COUNT = "cosmicCount";
  @SerializedName(SERIALIZED_NAME_COSMIC_COUNT)
  private Integer cosmicCount;

  public static final String SERIALIZED_NAME_FUNCTIONAL_IMPACT = "functionalImpact";
  @SerializedName(SERIALIZED_NAME_FUNCTIONAL_IMPACT)
  private String functionalImpact;

  public static final String SERIALIZED_NAME_FUNCTIONAL_IMPACT_SCORE = "functionalImpactScore";
  @SerializedName(SERIALIZED_NAME_FUNCTIONAL_IMPACT_SCORE)
  private Double functionalImpactScore;

  public static final String SERIALIZED_NAME_HGVS = "hgvs";
  @SerializedName(SERIALIZED_NAME_HGVS)
  private String hgvs;

  public static final String SERIALIZED_NAME_HUGO_SYMBOL = "hugoSymbol";
  @SerializedName(SERIALIZED_NAME_HUGO_SYMBOL)
  private String hugoSymbol;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_MAPPING_ISSUE = "mappingIssue";
  @SerializedName(SERIALIZED_NAME_MAPPING_ISSUE)
  private String mappingIssue;

  public static final String SERIALIZED_NAME_MSA_GAPS = "msaGaps";
  @SerializedName(SERIALIZED_NAME_MSA_GAPS)
  private Double msaGaps;

  public static final String SERIALIZED_NAME_MSA_HEIGHT = "msaHeight";
  @SerializedName(SERIALIZED_NAME_MSA_HEIGHT)
  private Integer msaHeight;

  public static final String SERIALIZED_NAME_MSA_LINK = "msaLink";
  @SerializedName(SERIALIZED_NAME_MSA_LINK)
  private String msaLink;

  public static final String SERIALIZED_NAME_PDB_LINK = "pdbLink";
  @SerializedName(SERIALIZED_NAME_PDB_LINK)
  private String pdbLink;

  public static final String SERIALIZED_NAME_REFERENCE_GENOME_VARIANT = "referenceGenomeVariant";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOME_VARIANT)
  private String referenceGenomeVariant;

  public static final String SERIALIZED_NAME_REFERENCE_GENOME_VARIANT_TYPE = "referenceGenomeVariantType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOME_VARIANT_TYPE)
  private String referenceGenomeVariantType;

  public static final String SERIALIZED_NAME_REFSEQ_ID = "refseqId";
  @SerializedName(SERIALIZED_NAME_REFSEQ_ID)
  private String refseqId;

  public static final String SERIALIZED_NAME_REFSEQ_POSITION = "refseqPosition";
  @SerializedName(SERIALIZED_NAME_REFSEQ_POSITION)
  private Integer refseqPosition;

  public static final String SERIALIZED_NAME_REFSEQ_RESIDUE = "refseqResidue";
  @SerializedName(SERIALIZED_NAME_REFSEQ_RESIDUE)
  private String refseqResidue;

  public static final String SERIALIZED_NAME_SNP_COUNT = "snpCount";
  @SerializedName(SERIALIZED_NAME_SNP_COUNT)
  private Integer snpCount;

  public static final String SERIALIZED_NAME_UNIPROT_ID = "uniprotId";
  @SerializedName(SERIALIZED_NAME_UNIPROT_ID)
  private String uniprotId;

  public static final String SERIALIZED_NAME_UNIPROT_POSITION = "uniprotPosition";
  @SerializedName(SERIALIZED_NAME_UNIPROT_POSITION)
  private Integer uniprotPosition;

  public static final String SERIALIZED_NAME_UNIPROT_RESIDUE = "uniprotResidue";
  @SerializedName(SERIALIZED_NAME_UNIPROT_RESIDUE)
  private String uniprotResidue;

  public static final String SERIALIZED_NAME_VARIANT = "variant";
  @SerializedName(SERIALIZED_NAME_VARIANT)
  private String variant;

  public static final String SERIALIZED_NAME_VARIANT_CONSERVATION_SCORE = "variantConservationScore";
  @SerializedName(SERIALIZED_NAME_VARIANT_CONSERVATION_SCORE)
  private Double variantConservationScore;

  public static final String SERIALIZED_NAME_VARIANT_SPECIFICITY_SCORE = "variantSpecificityScore";
  @SerializedName(SERIALIZED_NAME_VARIANT_SPECIFICITY_SCORE)
  private Double variantSpecificityScore;

  public MutationAssessor() {
  }

  public MutationAssessor codonStartPosition(String codonStartPosition) {
    this.codonStartPosition = codonStartPosition;
    return this;
  }

   /**
   * Codon start position
   * @return codonStartPosition
  **/
  @javax.annotation.Nullable
  public String getCodonStartPosition() {
    return codonStartPosition;
  }

  public void setCodonStartPosition(String codonStartPosition) {
    this.codonStartPosition = codonStartPosition;
  }


  public MutationAssessor cosmicCount(Integer cosmicCount) {
    this.cosmicCount = cosmicCount;
    return this;
  }

   /**
   * Number of mutations in COSMIC for this protein
   * @return cosmicCount
  **/
  @javax.annotation.Nullable
  public Integer getCosmicCount() {
    return cosmicCount;
  }

  public void setCosmicCount(Integer cosmicCount) {
    this.cosmicCount = cosmicCount;
  }


  public MutationAssessor functionalImpact(String functionalImpact) {
    this.functionalImpact = functionalImpact;
    return this;
  }

   /**
   * Functional impact
   * @return functionalImpact
  **/
  @javax.annotation.Nullable
  public String getFunctionalImpact() {
    return functionalImpact;
  }

  public void setFunctionalImpact(String functionalImpact) {
    this.functionalImpact = functionalImpact;
  }


  public MutationAssessor functionalImpactScore(Double functionalImpactScore) {
    this.functionalImpactScore = functionalImpactScore;
    return this;
  }

   /**
   * Functional impact score
   * @return functionalImpactScore
  **/
  @javax.annotation.Nullable
  public Double getFunctionalImpactScore() {
    return functionalImpactScore;
  }

  public void setFunctionalImpactScore(Double functionalImpactScore) {
    this.functionalImpactScore = functionalImpactScore;
  }


  public MutationAssessor hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * Get hgvs
   * @return hgvs
  **/
  @javax.annotation.Nullable
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }


  public MutationAssessor hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return hugoSymbol
  **/
  @javax.annotation.Nullable
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }


  public MutationAssessor input(String input) {
    this.input = input;
    return this;
  }

   /**
   * User-input variants
   * @return input
  **/
  @javax.annotation.Nonnull
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }


  public MutationAssessor mappingIssue(String mappingIssue) {
    this.mappingIssue = mappingIssue;
    return this;
  }

   /**
   * Mapping issue info
   * @return mappingIssue
  **/
  @javax.annotation.Nullable
  public String getMappingIssue() {
    return mappingIssue;
  }

  public void setMappingIssue(String mappingIssue) {
    this.mappingIssue = mappingIssue;
  }


  public MutationAssessor msaGaps(Double msaGaps) {
    this.msaGaps = msaGaps;
    return this;
  }

   /**
   * Portion of gaps in variant position in multiple sequence alignment
   * @return msaGaps
  **/
  @javax.annotation.Nullable
  public Double getMsaGaps() {
    return msaGaps;
  }

  public void setMsaGaps(Double msaGaps) {
    this.msaGaps = msaGaps;
  }


  public MutationAssessor msaHeight(Integer msaHeight) {
    this.msaHeight = msaHeight;
    return this;
  }

   /**
   * Number of diverse sequences in multiple sequence alignment (identical or highly similar sequences filtered out)
   * @return msaHeight
  **/
  @javax.annotation.Nullable
  public Integer getMsaHeight() {
    return msaHeight;
  }

  public void setMsaHeight(Integer msaHeight) {
    this.msaHeight = msaHeight;
  }


  public MutationAssessor msaLink(String msaLink) {
    this.msaLink = msaLink;
    return this;
  }

   /**
   * Link to multiple sequence alignment
   * @return msaLink
  **/
  @javax.annotation.Nullable
  public String getMsaLink() {
    return msaLink;
  }

  public void setMsaLink(String msaLink) {
    this.msaLink = msaLink;
  }


  public MutationAssessor pdbLink(String pdbLink) {
    this.pdbLink = pdbLink;
    return this;
  }

   /**
   * Link to 3d structure browser
   * @return pdbLink
  **/
  @javax.annotation.Nullable
  public String getPdbLink() {
    return pdbLink;
  }

  public void setPdbLink(String pdbLink) {
    this.pdbLink = pdbLink;
  }


  public MutationAssessor referenceGenomeVariant(String referenceGenomeVariant) {
    this.referenceGenomeVariant = referenceGenomeVariant;
    return this;
  }

   /**
   * Reference genome variant
   * @return referenceGenomeVariant
  **/
  @javax.annotation.Nullable
  public String getReferenceGenomeVariant() {
    return referenceGenomeVariant;
  }

  public void setReferenceGenomeVariant(String referenceGenomeVariant) {
    this.referenceGenomeVariant = referenceGenomeVariant;
  }


  public MutationAssessor referenceGenomeVariantType(String referenceGenomeVariantType) {
    this.referenceGenomeVariantType = referenceGenomeVariantType;
    return this;
  }

   /**
   * Reference genome variant type
   * @return referenceGenomeVariantType
  **/
  @javax.annotation.Nullable
  public String getReferenceGenomeVariantType() {
    return referenceGenomeVariantType;
  }

  public void setReferenceGenomeVariantType(String referenceGenomeVariantType) {
    this.referenceGenomeVariantType = referenceGenomeVariantType;
  }


  public MutationAssessor refseqId(String refseqId) {
    this.refseqId = refseqId;
    return this;
  }

   /**
   * Refseq protein ID
   * @return refseqId
  **/
  @javax.annotation.Nullable
  public String getRefseqId() {
    return refseqId;
  }

  public void setRefseqId(String refseqId) {
    this.refseqId = refseqId;
  }


  public MutationAssessor refseqPosition(Integer refseqPosition) {
    this.refseqPosition = refseqPosition;
    return this;
  }

   /**
   * Variant position in Refseq protein, can be different from the one in Uniprot
   * @return refseqPosition
  **/
  @javax.annotation.Nullable
  public Integer getRefseqPosition() {
    return refseqPosition;
  }

  public void setRefseqPosition(Integer refseqPosition) {
    this.refseqPosition = refseqPosition;
  }


  public MutationAssessor refseqResidue(String refseqResidue) {
    this.refseqResidue = refseqResidue;
    return this;
  }

   /**
   * Reference residue in Refseq protein, can be different from the one in Uniprot
   * @return refseqResidue
  **/
  @javax.annotation.Nullable
  public String getRefseqResidue() {
    return refseqResidue;
  }

  public void setRefseqResidue(String refseqResidue) {
    this.refseqResidue = refseqResidue;
  }


  public MutationAssessor snpCount(Integer snpCount) {
    this.snpCount = snpCount;
    return this;
  }

   /**
   * Number of SNPs in dbSNP for this protein
   * @return snpCount
  **/
  @javax.annotation.Nullable
  public Integer getSnpCount() {
    return snpCount;
  }

  public void setSnpCount(Integer snpCount) {
    this.snpCount = snpCount;
  }


  public MutationAssessor uniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
    return this;
  }

   /**
   * Uniprot protein accession ID
   * @return uniprotId
  **/
  @javax.annotation.Nullable
  public String getUniprotId() {
    return uniprotId;
  }

  public void setUniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
  }


  public MutationAssessor uniprotPosition(Integer uniprotPosition) {
    this.uniprotPosition = uniprotPosition;
    return this;
  }

   /**
   * Variant position in Uniprot protein, can be different from the one in Refseq
   * @return uniprotPosition
  **/
  @javax.annotation.Nullable
  public Integer getUniprotPosition() {
    return uniprotPosition;
  }

  public void setUniprotPosition(Integer uniprotPosition) {
    this.uniprotPosition = uniprotPosition;
  }


  public MutationAssessor uniprotResidue(String uniprotResidue) {
    this.uniprotResidue = uniprotResidue;
    return this;
  }

   /**
   * Reference residue in Uniprot protein, can be different from the one in Refseq
   * @return uniprotResidue
  **/
  @javax.annotation.Nullable
  public String getUniprotResidue() {
    return uniprotResidue;
  }

  public void setUniprotResidue(String uniprotResidue) {
    this.uniprotResidue = uniprotResidue;
  }


  public MutationAssessor variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Amino acid substitution
   * @return variant
  **/
  @javax.annotation.Nullable
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  public MutationAssessor variantConservationScore(Double variantConservationScore) {
    this.variantConservationScore = variantConservationScore;
    return this;
  }

   /**
   * Variant conservation score
   * @return variantConservationScore
  **/
  @javax.annotation.Nullable
  public Double getVariantConservationScore() {
    return variantConservationScore;
  }

  public void setVariantConservationScore(Double variantConservationScore) {
    this.variantConservationScore = variantConservationScore;
  }


  public MutationAssessor variantSpecificityScore(Double variantSpecificityScore) {
    this.variantSpecificityScore = variantSpecificityScore;
    return this;
  }

   /**
   * Variant specificity score
   * @return variantSpecificityScore
  **/
  @javax.annotation.Nullable
  public Double getVariantSpecificityScore() {
    return variantSpecificityScore;
  }

  public void setVariantSpecificityScore(Double variantSpecificityScore) {
    this.variantSpecificityScore = variantSpecificityScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MutationAssessor mutationAssessor = (MutationAssessor) o;
    return Objects.equals(this.codonStartPosition, mutationAssessor.codonStartPosition) &&
        Objects.equals(this.cosmicCount, mutationAssessor.cosmicCount) &&
        Objects.equals(this.functionalImpact, mutationAssessor.functionalImpact) &&
        Objects.equals(this.functionalImpactScore, mutationAssessor.functionalImpactScore) &&
        Objects.equals(this.hgvs, mutationAssessor.hgvs) &&
        Objects.equals(this.hugoSymbol, mutationAssessor.hugoSymbol) &&
        Objects.equals(this.input, mutationAssessor.input) &&
        Objects.equals(this.mappingIssue, mutationAssessor.mappingIssue) &&
        Objects.equals(this.msaGaps, mutationAssessor.msaGaps) &&
        Objects.equals(this.msaHeight, mutationAssessor.msaHeight) &&
        Objects.equals(this.msaLink, mutationAssessor.msaLink) &&
        Objects.equals(this.pdbLink, mutationAssessor.pdbLink) &&
        Objects.equals(this.referenceGenomeVariant, mutationAssessor.referenceGenomeVariant) &&
        Objects.equals(this.referenceGenomeVariantType, mutationAssessor.referenceGenomeVariantType) &&
        Objects.equals(this.refseqId, mutationAssessor.refseqId) &&
        Objects.equals(this.refseqPosition, mutationAssessor.refseqPosition) &&
        Objects.equals(this.refseqResidue, mutationAssessor.refseqResidue) &&
        Objects.equals(this.snpCount, mutationAssessor.snpCount) &&
        Objects.equals(this.uniprotId, mutationAssessor.uniprotId) &&
        Objects.equals(this.uniprotPosition, mutationAssessor.uniprotPosition) &&
        Objects.equals(this.uniprotResidue, mutationAssessor.uniprotResidue) &&
        Objects.equals(this.variant, mutationAssessor.variant) &&
        Objects.equals(this.variantConservationScore, mutationAssessor.variantConservationScore) &&
        Objects.equals(this.variantSpecificityScore, mutationAssessor.variantSpecificityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codonStartPosition, cosmicCount, functionalImpact, functionalImpactScore, hgvs, hugoSymbol, input, mappingIssue, msaGaps, msaHeight, msaLink, pdbLink, referenceGenomeVariant, referenceGenomeVariantType, refseqId, refseqPosition, refseqResidue, snpCount, uniprotId, uniprotPosition, uniprotResidue, variant, variantConservationScore, variantSpecificityScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MutationAssessor {\n");
    sb.append("    codonStartPosition: ").append(toIndentedString(codonStartPosition)).append("\n");
    sb.append("    cosmicCount: ").append(toIndentedString(cosmicCount)).append("\n");
    sb.append("    functionalImpact: ").append(toIndentedString(functionalImpact)).append("\n");
    sb.append("    functionalImpactScore: ").append(toIndentedString(functionalImpactScore)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    mappingIssue: ").append(toIndentedString(mappingIssue)).append("\n");
    sb.append("    msaGaps: ").append(toIndentedString(msaGaps)).append("\n");
    sb.append("    msaHeight: ").append(toIndentedString(msaHeight)).append("\n");
    sb.append("    msaLink: ").append(toIndentedString(msaLink)).append("\n");
    sb.append("    pdbLink: ").append(toIndentedString(pdbLink)).append("\n");
    sb.append("    referenceGenomeVariant: ").append(toIndentedString(referenceGenomeVariant)).append("\n");
    sb.append("    referenceGenomeVariantType: ").append(toIndentedString(referenceGenomeVariantType)).append("\n");
    sb.append("    refseqId: ").append(toIndentedString(refseqId)).append("\n");
    sb.append("    refseqPosition: ").append(toIndentedString(refseqPosition)).append("\n");
    sb.append("    refseqResidue: ").append(toIndentedString(refseqResidue)).append("\n");
    sb.append("    snpCount: ").append(toIndentedString(snpCount)).append("\n");
    sb.append("    uniprotId: ").append(toIndentedString(uniprotId)).append("\n");
    sb.append("    uniprotPosition: ").append(toIndentedString(uniprotPosition)).append("\n");
    sb.append("    uniprotResidue: ").append(toIndentedString(uniprotResidue)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    variantConservationScore: ").append(toIndentedString(variantConservationScore)).append("\n");
    sb.append("    variantSpecificityScore: ").append(toIndentedString(variantSpecificityScore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("codonStartPosition");
    openapiFields.add("cosmicCount");
    openapiFields.add("functionalImpact");
    openapiFields.add("functionalImpactScore");
    openapiFields.add("hgvs");
    openapiFields.add("hugoSymbol");
    openapiFields.add("input");
    openapiFields.add("mappingIssue");
    openapiFields.add("msaGaps");
    openapiFields.add("msaHeight");
    openapiFields.add("msaLink");
    openapiFields.add("pdbLink");
    openapiFields.add("referenceGenomeVariant");
    openapiFields.add("referenceGenomeVariantType");
    openapiFields.add("refseqId");
    openapiFields.add("refseqPosition");
    openapiFields.add("refseqResidue");
    openapiFields.add("snpCount");
    openapiFields.add("uniprotId");
    openapiFields.add("uniprotPosition");
    openapiFields.add("uniprotResidue");
    openapiFields.add("variant");
    openapiFields.add("variantConservationScore");
    openapiFields.add("variantSpecificityScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("input");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MutationAssessor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MutationAssessor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MutationAssessor is not found in the empty JSON string", MutationAssessor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MutationAssessor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MutationAssessor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MutationAssessor.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("codonStartPosition") != null && !jsonObj.get("codonStartPosition").isJsonNull()) && !jsonObj.get("codonStartPosition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codonStartPosition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codonStartPosition").toString()));
      }
      if ((jsonObj.get("functionalImpact") != null && !jsonObj.get("functionalImpact").isJsonNull()) && !jsonObj.get("functionalImpact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `functionalImpact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("functionalImpact").toString()));
      }
      if ((jsonObj.get("hgvs") != null && !jsonObj.get("hgvs").isJsonNull()) && !jsonObj.get("hgvs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hgvs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hgvs").toString()));
      }
      if ((jsonObj.get("hugoSymbol") != null && !jsonObj.get("hugoSymbol").isJsonNull()) && !jsonObj.get("hugoSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hugoSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hugoSymbol").toString()));
      }
      if (!jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if ((jsonObj.get("mappingIssue") != null && !jsonObj.get("mappingIssue").isJsonNull()) && !jsonObj.get("mappingIssue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappingIssue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mappingIssue").toString()));
      }
      if ((jsonObj.get("msaLink") != null && !jsonObj.get("msaLink").isJsonNull()) && !jsonObj.get("msaLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msaLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msaLink").toString()));
      }
      if ((jsonObj.get("pdbLink") != null && !jsonObj.get("pdbLink").isJsonNull()) && !jsonObj.get("pdbLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdbLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdbLink").toString()));
      }
      if ((jsonObj.get("referenceGenomeVariant") != null && !jsonObj.get("referenceGenomeVariant").isJsonNull()) && !jsonObj.get("referenceGenomeVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceGenomeVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceGenomeVariant").toString()));
      }
      if ((jsonObj.get("referenceGenomeVariantType") != null && !jsonObj.get("referenceGenomeVariantType").isJsonNull()) && !jsonObj.get("referenceGenomeVariantType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceGenomeVariantType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceGenomeVariantType").toString()));
      }
      if ((jsonObj.get("refseqId") != null && !jsonObj.get("refseqId").isJsonNull()) && !jsonObj.get("refseqId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refseqId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refseqId").toString()));
      }
      if ((jsonObj.get("refseqResidue") != null && !jsonObj.get("refseqResidue").isJsonNull()) && !jsonObj.get("refseqResidue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refseqResidue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refseqResidue").toString()));
      }
      if ((jsonObj.get("uniprotId") != null && !jsonObj.get("uniprotId").isJsonNull()) && !jsonObj.get("uniprotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniprotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniprotId").toString()));
      }
      if ((jsonObj.get("uniprotResidue") != null && !jsonObj.get("uniprotResidue").isJsonNull()) && !jsonObj.get("uniprotResidue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniprotResidue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniprotResidue").toString()));
      }
      if ((jsonObj.get("variant") != null && !jsonObj.get("variant").isJsonNull()) && !jsonObj.get("variant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MutationAssessor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MutationAssessor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MutationAssessor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MutationAssessor.class));

       return (TypeAdapter<T>) new TypeAdapter<MutationAssessor>() {
           @Override
           public void write(JsonWriter out, MutationAssessor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MutationAssessor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MutationAssessor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MutationAssessor
  * @throws IOException if the JSON string is invalid with respect to MutationAssessor
  */
  public static MutationAssessor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MutationAssessor.class);
  }

 /**
  * Convert an instance of MutationAssessor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

