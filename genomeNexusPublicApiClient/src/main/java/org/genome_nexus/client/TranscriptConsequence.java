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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * TranscriptConsequence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:02.948968527-05:00[America/New_York]")
public class TranscriptConsequence {
  public static final String SERIALIZED_NAME_AMINO_ACIDS = "amino_acids";
  @SerializedName(SERIALIZED_NAME_AMINO_ACIDS)
  private String aminoAcids;

  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private String canonical;

  public static final String SERIALIZED_NAME_CODONS = "codons";
  @SerializedName(SERIALIZED_NAME_CODONS)
  private String codons;

  public static final String SERIALIZED_NAME_CONSEQUENCE_TERMS = "consequence_terms";
  @SerializedName(SERIALIZED_NAME_CONSEQUENCE_TERMS)
  private List<String> consequenceTerms;

  public static final String SERIALIZED_NAME_EXON = "exon";
  @SerializedName(SERIALIZED_NAME_EXON)
  private String exon;

  public static final String SERIALIZED_NAME_GENE_ID = "gene_id";
  @SerializedName(SERIALIZED_NAME_GENE_ID)
  private String geneId;

  public static final String SERIALIZED_NAME_GENE_SYMBOL = "gene_symbol";
  @SerializedName(SERIALIZED_NAME_GENE_SYMBOL)
  private String geneSymbol;

  public static final String SERIALIZED_NAME_HGNC_ID = "hgnc_id";
  @SerializedName(SERIALIZED_NAME_HGNC_ID)
  private String hgncId;

  public static final String SERIALIZED_NAME_HGVSC = "hgvsc";
  @SerializedName(SERIALIZED_NAME_HGVSC)
  private String hgvsc;

  public static final String SERIALIZED_NAME_HGVSG = "hgvsg";
  @SerializedName(SERIALIZED_NAME_HGVSG)
  private String hgvsg;

  public static final String SERIALIZED_NAME_HGVSP = "hgvsp";
  @SerializedName(SERIALIZED_NAME_HGVSP)
  private String hgvsp;

  public static final String SERIALIZED_NAME_POLYPHEN_PREDICTION = "polyphen_prediction";
  @SerializedName(SERIALIZED_NAME_POLYPHEN_PREDICTION)
  private String polyphenPrediction;

  public static final String SERIALIZED_NAME_POLYPHEN_SCORE = "polyphen_score";
  @SerializedName(SERIALIZED_NAME_POLYPHEN_SCORE)
  private Double polyphenScore;

  public static final String SERIALIZED_NAME_PROTEIN_END = "protein_end";
  @SerializedName(SERIALIZED_NAME_PROTEIN_END)
  private Integer proteinEnd;

  public static final String SERIALIZED_NAME_PROTEIN_ID = "protein_id";
  @SerializedName(SERIALIZED_NAME_PROTEIN_ID)
  private String proteinId;

  public static final String SERIALIZED_NAME_PROTEIN_START = "protein_start";
  @SerializedName(SERIALIZED_NAME_PROTEIN_START)
  private Integer proteinStart;

  public static final String SERIALIZED_NAME_REFSEQ_TRANSCRIPT_IDS = "refseq_transcript_ids";
  @SerializedName(SERIALIZED_NAME_REFSEQ_TRANSCRIPT_IDS)
  private List<String> refseqTranscriptIds;

  public static final String SERIALIZED_NAME_SIFT_PREDICTION = "sift_prediction";
  @SerializedName(SERIALIZED_NAME_SIFT_PREDICTION)
  private String siftPrediction;

  public static final String SERIALIZED_NAME_SIFT_SCORE = "sift_score";
  @SerializedName(SERIALIZED_NAME_SIFT_SCORE)
  private Double siftScore;

  public static final String SERIALIZED_NAME_TRANSCRIPT_ID = "transcript_id";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT_ID)
  private String transcriptId;

  public static final String SERIALIZED_NAME_UNIPROT_ID = "uniprotId";
  @SerializedName(SERIALIZED_NAME_UNIPROT_ID)
  private String uniprotId;

  public static final String SERIALIZED_NAME_VARIANT_ALLELE = "variant_allele";
  @SerializedName(SERIALIZED_NAME_VARIANT_ALLELE)
  private String variantAllele;

  public TranscriptConsequence() {
  }

  public TranscriptConsequence aminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
    return this;
  }

   /**
   * Amino acids
   * @return aminoAcids
  **/
  @javax.annotation.Nullable
  public String getAminoAcids() {
    return aminoAcids;
  }

  public void setAminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
  }


  public TranscriptConsequence canonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

   /**
   * Canonical transcript indicator
   * @return canonical
  **/
  @javax.annotation.Nullable
  public String getCanonical() {
    return canonical;
  }

  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }


  public TranscriptConsequence codons(String codons) {
    this.codons = codons;
    return this;
  }

   /**
   * Codons
   * @return codons
  **/
  @javax.annotation.Nullable
  public String getCodons() {
    return codons;
  }

  public void setCodons(String codons) {
    this.codons = codons;
  }


  public TranscriptConsequence consequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
    return this;
  }

  public TranscriptConsequence addConsequenceTermsItem(String consequenceTermsItem) {
    if (this.consequenceTerms == null) {
      this.consequenceTerms = new ArrayList<>();
    }
    this.consequenceTerms.add(consequenceTermsItem);
    return this;
  }

   /**
   * List of consequence terms
   * @return consequenceTerms
  **/
  @javax.annotation.Nullable
  public List<String> getConsequenceTerms() {
    return consequenceTerms;
  }

  public void setConsequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
  }


  public TranscriptConsequence exon(String exon) {
    this.exon = exon;
    return this;
  }

   /**
   * Get exon
   * @return exon
  **/
  @javax.annotation.Nullable
  public String getExon() {
    return exon;
  }

  public void setExon(String exon) {
    this.exon = exon;
  }


  public TranscriptConsequence geneId(String geneId) {
    this.geneId = geneId;
    return this;
  }

   /**
   * Ensembl gene id
   * @return geneId
  **/
  @javax.annotation.Nullable
  public String getGeneId() {
    return geneId;
  }

  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }


  public TranscriptConsequence geneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return geneSymbol
  **/
  @javax.annotation.Nullable
  public String getGeneSymbol() {
    return geneSymbol;
  }

  public void setGeneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
  }


  public TranscriptConsequence hgncId(String hgncId) {
    this.hgncId = hgncId;
    return this;
  }

   /**
   * HGNC id
   * @return hgncId
  **/
  @javax.annotation.Nullable
  public String getHgncId() {
    return hgncId;
  }

  public void setHgncId(String hgncId) {
    this.hgncId = hgncId;
  }


  public TranscriptConsequence hgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
    return this;
  }

   /**
   * HGVSc
   * @return hgvsc
  **/
  @javax.annotation.Nullable
  public String getHgvsc() {
    return hgvsc;
  }

  public void setHgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
  }


  public TranscriptConsequence hgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
    return this;
  }

   /**
   * HGVSg
   * @return hgvsg
  **/
  @javax.annotation.Nullable
  public String getHgvsg() {
    return hgvsg;
  }

  public void setHgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
  }


  public TranscriptConsequence hgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
    return this;
  }

   /**
   * HGVSp
   * @return hgvsp
  **/
  @javax.annotation.Nullable
  public String getHgvsp() {
    return hgvsp;
  }

  public void setHgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
  }


  public TranscriptConsequence polyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
    return this;
  }

   /**
   * Polyphen Prediction
   * @return polyphenPrediction
  **/
  @javax.annotation.Nullable
  public String getPolyphenPrediction() {
    return polyphenPrediction;
  }

  public void setPolyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
  }


  public TranscriptConsequence polyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
    return this;
  }

   /**
   * Polyphen Score
   * @return polyphenScore
  **/
  @javax.annotation.Nullable
  public Double getPolyphenScore() {
    return polyphenScore;
  }

  public void setPolyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
  }


  public TranscriptConsequence proteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
    return this;
  }

   /**
   * Protein end position
   * @return proteinEnd
  **/
  @javax.annotation.Nullable
  public Integer getProteinEnd() {
    return proteinEnd;
  }

  public void setProteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
  }


  public TranscriptConsequence proteinId(String proteinId) {
    this.proteinId = proteinId;
    return this;
  }

   /**
   * Ensembl protein id
   * @return proteinId
  **/
  @javax.annotation.Nullable
  public String getProteinId() {
    return proteinId;
  }

  public void setProteinId(String proteinId) {
    this.proteinId = proteinId;
  }


  public TranscriptConsequence proteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
    return this;
  }

   /**
   * Protein start position
   * @return proteinStart
  **/
  @javax.annotation.Nullable
  public Integer getProteinStart() {
    return proteinStart;
  }

  public void setProteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
  }


  public TranscriptConsequence refseqTranscriptIds(List<String> refseqTranscriptIds) {
    this.refseqTranscriptIds = refseqTranscriptIds;
    return this;
  }

  public TranscriptConsequence addRefseqTranscriptIdsItem(String refseqTranscriptIdsItem) {
    if (this.refseqTranscriptIds == null) {
      this.refseqTranscriptIds = new ArrayList<>();
    }
    this.refseqTranscriptIds.add(refseqTranscriptIdsItem);
    return this;
  }

   /**
   * List of RefSeq transcript ids
   * @return refseqTranscriptIds
  **/
  @javax.annotation.Nullable
  public List<String> getRefseqTranscriptIds() {
    return refseqTranscriptIds;
  }

  public void setRefseqTranscriptIds(List<String> refseqTranscriptIds) {
    this.refseqTranscriptIds = refseqTranscriptIds;
  }


  public TranscriptConsequence siftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
    return this;
  }

   /**
   * Sift Prediction
   * @return siftPrediction
  **/
  @javax.annotation.Nullable
  public String getSiftPrediction() {
    return siftPrediction;
  }

  public void setSiftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
  }


  public TranscriptConsequence siftScore(Double siftScore) {
    this.siftScore = siftScore;
    return this;
  }

   /**
   * Sift Score
   * @return siftScore
  **/
  @javax.annotation.Nullable
  public Double getSiftScore() {
    return siftScore;
  }

  public void setSiftScore(Double siftScore) {
    this.siftScore = siftScore;
  }


  public TranscriptConsequence transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl transcript id
   * @return transcriptId
  **/
  @javax.annotation.Nonnull
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }


  public TranscriptConsequence uniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
    return this;
  }

   /**
   * Get uniprotId
   * @return uniprotId
  **/
  @javax.annotation.Nullable
  public String getUniprotId() {
    return uniprotId;
  }

  public void setUniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
  }


  public TranscriptConsequence variantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
    return this;
  }

   /**
   * Variant allele
   * @return variantAllele
  **/
  @javax.annotation.Nullable
  public String getVariantAllele() {
    return variantAllele;
  }

  public void setVariantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptConsequence transcriptConsequence = (TranscriptConsequence) o;
    return Objects.equals(this.aminoAcids, transcriptConsequence.aminoAcids) &&
        Objects.equals(this.canonical, transcriptConsequence.canonical) &&
        Objects.equals(this.codons, transcriptConsequence.codons) &&
        Objects.equals(this.consequenceTerms, transcriptConsequence.consequenceTerms) &&
        Objects.equals(this.exon, transcriptConsequence.exon) &&
        Objects.equals(this.geneId, transcriptConsequence.geneId) &&
        Objects.equals(this.geneSymbol, transcriptConsequence.geneSymbol) &&
        Objects.equals(this.hgncId, transcriptConsequence.hgncId) &&
        Objects.equals(this.hgvsc, transcriptConsequence.hgvsc) &&
        Objects.equals(this.hgvsg, transcriptConsequence.hgvsg) &&
        Objects.equals(this.hgvsp, transcriptConsequence.hgvsp) &&
        Objects.equals(this.polyphenPrediction, transcriptConsequence.polyphenPrediction) &&
        Objects.equals(this.polyphenScore, transcriptConsequence.polyphenScore) &&
        Objects.equals(this.proteinEnd, transcriptConsequence.proteinEnd) &&
        Objects.equals(this.proteinId, transcriptConsequence.proteinId) &&
        Objects.equals(this.proteinStart, transcriptConsequence.proteinStart) &&
        Objects.equals(this.refseqTranscriptIds, transcriptConsequence.refseqTranscriptIds) &&
        Objects.equals(this.siftPrediction, transcriptConsequence.siftPrediction) &&
        Objects.equals(this.siftScore, transcriptConsequence.siftScore) &&
        Objects.equals(this.transcriptId, transcriptConsequence.transcriptId) &&
        Objects.equals(this.uniprotId, transcriptConsequence.uniprotId) &&
        Objects.equals(this.variantAllele, transcriptConsequence.variantAllele);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aminoAcids, canonical, codons, consequenceTerms, exon, geneId, geneSymbol, hgncId, hgvsc, hgvsg, hgvsp, polyphenPrediction, polyphenScore, proteinEnd, proteinId, proteinStart, refseqTranscriptIds, siftPrediction, siftScore, transcriptId, uniprotId, variantAllele);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptConsequence {\n");
    sb.append("    aminoAcids: ").append(toIndentedString(aminoAcids)).append("\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    codons: ").append(toIndentedString(codons)).append("\n");
    sb.append("    consequenceTerms: ").append(toIndentedString(consequenceTerms)).append("\n");
    sb.append("    exon: ").append(toIndentedString(exon)).append("\n");
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    geneSymbol: ").append(toIndentedString(geneSymbol)).append("\n");
    sb.append("    hgncId: ").append(toIndentedString(hgncId)).append("\n");
    sb.append("    hgvsc: ").append(toIndentedString(hgvsc)).append("\n");
    sb.append("    hgvsg: ").append(toIndentedString(hgvsg)).append("\n");
    sb.append("    hgvsp: ").append(toIndentedString(hgvsp)).append("\n");
    sb.append("    polyphenPrediction: ").append(toIndentedString(polyphenPrediction)).append("\n");
    sb.append("    polyphenScore: ").append(toIndentedString(polyphenScore)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinId: ").append(toIndentedString(proteinId)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    refseqTranscriptIds: ").append(toIndentedString(refseqTranscriptIds)).append("\n");
    sb.append("    siftPrediction: ").append(toIndentedString(siftPrediction)).append("\n");
    sb.append("    siftScore: ").append(toIndentedString(siftScore)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    uniprotId: ").append(toIndentedString(uniprotId)).append("\n");
    sb.append("    variantAllele: ").append(toIndentedString(variantAllele)).append("\n");
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
    openapiFields.add("amino_acids");
    openapiFields.add("canonical");
    openapiFields.add("codons");
    openapiFields.add("consequence_terms");
    openapiFields.add("exon");
    openapiFields.add("gene_id");
    openapiFields.add("gene_symbol");
    openapiFields.add("hgnc_id");
    openapiFields.add("hgvsc");
    openapiFields.add("hgvsg");
    openapiFields.add("hgvsp");
    openapiFields.add("polyphen_prediction");
    openapiFields.add("polyphen_score");
    openapiFields.add("protein_end");
    openapiFields.add("protein_id");
    openapiFields.add("protein_start");
    openapiFields.add("refseq_transcript_ids");
    openapiFields.add("sift_prediction");
    openapiFields.add("sift_score");
    openapiFields.add("transcript_id");
    openapiFields.add("uniprotId");
    openapiFields.add("variant_allele");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("transcript_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TranscriptConsequence
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranscriptConsequence.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranscriptConsequence is not found in the empty JSON string", TranscriptConsequence.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TranscriptConsequence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TranscriptConsequence` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TranscriptConsequence.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("amino_acids") != null && !jsonObj.get("amino_acids").isJsonNull()) && !jsonObj.get("amino_acids").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amino_acids` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amino_acids").toString()));
      }
      if ((jsonObj.get("canonical") != null && !jsonObj.get("canonical").isJsonNull()) && !jsonObj.get("canonical").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `canonical` to be a primitive type in the JSON string but got `%s`", jsonObj.get("canonical").toString()));
      }
      if ((jsonObj.get("codons") != null && !jsonObj.get("codons").isJsonNull()) && !jsonObj.get("codons").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codons` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codons").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("consequence_terms") != null && !jsonObj.get("consequence_terms").isJsonNull() && !jsonObj.get("consequence_terms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `consequence_terms` to be an array in the JSON string but got `%s`", jsonObj.get("consequence_terms").toString()));
      }
      if ((jsonObj.get("exon") != null && !jsonObj.get("exon").isJsonNull()) && !jsonObj.get("exon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exon").toString()));
      }
      if ((jsonObj.get("gene_id") != null && !jsonObj.get("gene_id").isJsonNull()) && !jsonObj.get("gene_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gene_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gene_id").toString()));
      }
      if ((jsonObj.get("gene_symbol") != null && !jsonObj.get("gene_symbol").isJsonNull()) && !jsonObj.get("gene_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gene_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gene_symbol").toString()));
      }
      if ((jsonObj.get("hgnc_id") != null && !jsonObj.get("hgnc_id").isJsonNull()) && !jsonObj.get("hgnc_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hgnc_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hgnc_id").toString()));
      }
      if ((jsonObj.get("hgvsc") != null && !jsonObj.get("hgvsc").isJsonNull()) && !jsonObj.get("hgvsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hgvsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hgvsc").toString()));
      }
      if ((jsonObj.get("hgvsg") != null && !jsonObj.get("hgvsg").isJsonNull()) && !jsonObj.get("hgvsg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hgvsg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hgvsg").toString()));
      }
      if ((jsonObj.get("hgvsp") != null && !jsonObj.get("hgvsp").isJsonNull()) && !jsonObj.get("hgvsp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hgvsp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hgvsp").toString()));
      }
      if ((jsonObj.get("polyphen_prediction") != null && !jsonObj.get("polyphen_prediction").isJsonNull()) && !jsonObj.get("polyphen_prediction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `polyphen_prediction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("polyphen_prediction").toString()));
      }
      if ((jsonObj.get("protein_id") != null && !jsonObj.get("protein_id").isJsonNull()) && !jsonObj.get("protein_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protein_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protein_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("refseq_transcript_ids") != null && !jsonObj.get("refseq_transcript_ids").isJsonNull() && !jsonObj.get("refseq_transcript_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `refseq_transcript_ids` to be an array in the JSON string but got `%s`", jsonObj.get("refseq_transcript_ids").toString()));
      }
      if ((jsonObj.get("sift_prediction") != null && !jsonObj.get("sift_prediction").isJsonNull()) && !jsonObj.get("sift_prediction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sift_prediction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sift_prediction").toString()));
      }
      if (!jsonObj.get("transcript_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcript_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcript_id").toString()));
      }
      if ((jsonObj.get("uniprotId") != null && !jsonObj.get("uniprotId").isJsonNull()) && !jsonObj.get("uniprotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniprotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniprotId").toString()));
      }
      if ((jsonObj.get("variant_allele") != null && !jsonObj.get("variant_allele").isJsonNull()) && !jsonObj.get("variant_allele").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variant_allele` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variant_allele").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranscriptConsequence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranscriptConsequence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranscriptConsequence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranscriptConsequence.class));

       return (TypeAdapter<T>) new TypeAdapter<TranscriptConsequence>() {
           @Override
           public void write(JsonWriter out, TranscriptConsequence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TranscriptConsequence read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TranscriptConsequence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TranscriptConsequence
  * @throws IOException if the JSON string is invalid with respect to TranscriptConsequence
  */
  public static TranscriptConsequence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranscriptConsequence.class);
  }

 /**
  * Convert an instance of TranscriptConsequence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

