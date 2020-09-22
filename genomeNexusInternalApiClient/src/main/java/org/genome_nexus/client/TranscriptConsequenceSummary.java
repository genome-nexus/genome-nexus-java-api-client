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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.genome_nexus.client.IntegerRange;

/**
 * TranscriptConsequenceSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:48:04.268-04:00")
public class TranscriptConsequenceSummary {
  @SerializedName("aminoAcidAlt")
  private String aminoAcidAlt = null;

  @SerializedName("aminoAcidRef")
  private String aminoAcidRef = null;

  @SerializedName("aminoAcids")
  private String aminoAcids = null;

  @SerializedName("codonChange")
  private String codonChange = null;

  @SerializedName("consequenceTerms")
  private String consequenceTerms = null;

  @SerializedName("entrezGeneId")
  private String entrezGeneId = null;

  @SerializedName("exon")
  private String exon = null;

  @SerializedName("hgvsc")
  private String hgvsc = null;

  @SerializedName("hgvsp")
  private String hgvsp = null;

  @SerializedName("hgvspShort")
  private String hgvspShort = null;

  @SerializedName("hugoGeneSymbol")
  private String hugoGeneSymbol = null;

  @SerializedName("polyphen_prediction")
  private String polyphenPrediction = null;

  @SerializedName("polyphen_score")
  private Double polyphenScore = null;

  @SerializedName("proteinPosition")
  private IntegerRange proteinPosition = null;

  @SerializedName("refSeq")
  private String refSeq = null;

  @SerializedName("sift_prediction")
  private String siftPrediction = null;

  @SerializedName("sift_score")
  private Double siftScore = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("variantClassification")
  private String variantClassification = null;

  public TranscriptConsequenceSummary aminoAcidAlt(String aminoAcidAlt) {
    this.aminoAcidAlt = aminoAcidAlt;
    return this;
  }

   /**
   * Alt Amino Acid
   * @return aminoAcidAlt
  **/
  @ApiModelProperty(value = "Alt Amino Acid")
  public String getAminoAcidAlt() {
    return aminoAcidAlt;
  }

  public void setAminoAcidAlt(String aminoAcidAlt) {
    this.aminoAcidAlt = aminoAcidAlt;
  }

  public TranscriptConsequenceSummary aminoAcidRef(String aminoAcidRef) {
    this.aminoAcidRef = aminoAcidRef;
    return this;
  }

   /**
   * Reference Amino Acid
   * @return aminoAcidRef
  **/
  @ApiModelProperty(value = "Reference Amino Acid")
  public String getAminoAcidRef() {
    return aminoAcidRef;
  }

  public void setAminoAcidRef(String aminoAcidRef) {
    this.aminoAcidRef = aminoAcidRef;
  }

  public TranscriptConsequenceSummary aminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
    return this;
  }

   /**
   * Amino acids change
   * @return aminoAcids
  **/
  @ApiModelProperty(value = "Amino acids change")
  public String getAminoAcids() {
    return aminoAcids;
  }

  public void setAminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
  }

  public TranscriptConsequenceSummary codonChange(String codonChange) {
    this.codonChange = codonChange;
    return this;
  }

   /**
   * Codon change
   * @return codonChange
  **/
  @ApiModelProperty(value = "Codon change")
  public String getCodonChange() {
    return codonChange;
  }

  public void setCodonChange(String codonChange) {
    this.codonChange = codonChange;
  }

  public TranscriptConsequenceSummary consequenceTerms(String consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
    return this;
  }

   /**
   * Consequence terms (comma separated)
   * @return consequenceTerms
  **/
  @ApiModelProperty(value = "Consequence terms (comma separated)")
  public String getConsequenceTerms() {
    return consequenceTerms;
  }

  public void setConsequenceTerms(String consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
  }

  public TranscriptConsequenceSummary entrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Entrez gene id
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "Entrez gene id")
  public String getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(String entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public TranscriptConsequenceSummary exon(String exon) {
    this.exon = exon;
    return this;
  }

   /**
   * Get exon
   * @return exon
  **/
  @ApiModelProperty(value = "")
  public String getExon() {
    return exon;
  }

  public void setExon(String exon) {
    this.exon = exon;
  }

  public TranscriptConsequenceSummary hgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
    return this;
  }

   /**
   * HGVSc
   * @return hgvsc
  **/
  @ApiModelProperty(value = "HGVSc")
  public String getHgvsc() {
    return hgvsc;
  }

  public void setHgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
  }

  public TranscriptConsequenceSummary hgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
    return this;
  }

   /**
   * HGVSp
   * @return hgvsp
  **/
  @ApiModelProperty(value = "HGVSp")
  public String getHgvsp() {
    return hgvsp;
  }

  public void setHgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
  }

  public TranscriptConsequenceSummary hgvspShort(String hgvspShort) {
    this.hgvspShort = hgvspShort;
    return this;
  }

   /**
   * HGVSp short
   * @return hgvspShort
  **/
  @ApiModelProperty(value = "HGVSp short")
  public String getHgvspShort() {
    return hgvspShort;
  }

  public void setHgvspShort(String hgvspShort) {
    this.hgvspShort = hgvspShort;
  }

  public TranscriptConsequenceSummary hugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return hugoGeneSymbol
  **/
  @ApiModelProperty(value = "Hugo gene symbol")
  public String getHugoGeneSymbol() {
    return hugoGeneSymbol;
  }

  public void setHugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
  }

  public TranscriptConsequenceSummary polyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
    return this;
  }

   /**
   * Polyphen Prediction
   * @return polyphenPrediction
  **/
  @ApiModelProperty(value = "Polyphen Prediction")
  public String getPolyphenPrediction() {
    return polyphenPrediction;
  }

  public void setPolyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
  }

  public TranscriptConsequenceSummary polyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
    return this;
  }

   /**
   * Polyphen Score
   * @return polyphenScore
  **/
  @ApiModelProperty(value = "Polyphen Score")
  public Double getPolyphenScore() {
    return polyphenScore;
  }

  public void setPolyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
  }

  public TranscriptConsequenceSummary proteinPosition(IntegerRange proteinPosition) {
    this.proteinPosition = proteinPosition;
    return this;
  }

   /**
   * Protein position (start and end)
   * @return proteinPosition
  **/
  @ApiModelProperty(value = "Protein position (start and end)")
  public IntegerRange getProteinPosition() {
    return proteinPosition;
  }

  public void setProteinPosition(IntegerRange proteinPosition) {
    this.proteinPosition = proteinPosition;
  }

  public TranscriptConsequenceSummary refSeq(String refSeq) {
    this.refSeq = refSeq;
    return this;
  }

   /**
   * RefSeq id
   * @return refSeq
  **/
  @ApiModelProperty(value = "RefSeq id")
  public String getRefSeq() {
    return refSeq;
  }

  public void setRefSeq(String refSeq) {
    this.refSeq = refSeq;
  }

  public TranscriptConsequenceSummary siftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
    return this;
  }

   /**
   * Sift Prediction
   * @return siftPrediction
  **/
  @ApiModelProperty(value = "Sift Prediction")
  public String getSiftPrediction() {
    return siftPrediction;
  }

  public void setSiftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
  }

  public TranscriptConsequenceSummary siftScore(Double siftScore) {
    this.siftScore = siftScore;
    return this;
  }

   /**
   * Sift Score
   * @return siftScore
  **/
  @ApiModelProperty(value = "Sift Score")
  public Double getSiftScore() {
    return siftScore;
  }

  public void setSiftScore(Double siftScore) {
    this.siftScore = siftScore;
  }

  public TranscriptConsequenceSummary transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Transcript id
   * @return transcriptId
  **/
  @ApiModelProperty(required = true, value = "Transcript id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public TranscriptConsequenceSummary variantClassification(String variantClassification) {
    this.variantClassification = variantClassification;
    return this;
  }

   /**
   * Variant classification
   * @return variantClassification
  **/
  @ApiModelProperty(value = "Variant classification")
  public String getVariantClassification() {
    return variantClassification;
  }

  public void setVariantClassification(String variantClassification) {
    this.variantClassification = variantClassification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptConsequenceSummary transcriptConsequenceSummary = (TranscriptConsequenceSummary) o;
    return Objects.equals(this.aminoAcidAlt, transcriptConsequenceSummary.aminoAcidAlt) &&
        Objects.equals(this.aminoAcidRef, transcriptConsequenceSummary.aminoAcidRef) &&
        Objects.equals(this.aminoAcids, transcriptConsequenceSummary.aminoAcids) &&
        Objects.equals(this.codonChange, transcriptConsequenceSummary.codonChange) &&
        Objects.equals(this.consequenceTerms, transcriptConsequenceSummary.consequenceTerms) &&
        Objects.equals(this.entrezGeneId, transcriptConsequenceSummary.entrezGeneId) &&
        Objects.equals(this.exon, transcriptConsequenceSummary.exon) &&
        Objects.equals(this.hgvsc, transcriptConsequenceSummary.hgvsc) &&
        Objects.equals(this.hgvsp, transcriptConsequenceSummary.hgvsp) &&
        Objects.equals(this.hgvspShort, transcriptConsequenceSummary.hgvspShort) &&
        Objects.equals(this.hugoGeneSymbol, transcriptConsequenceSummary.hugoGeneSymbol) &&
        Objects.equals(this.polyphenPrediction, transcriptConsequenceSummary.polyphenPrediction) &&
        Objects.equals(this.polyphenScore, transcriptConsequenceSummary.polyphenScore) &&
        Objects.equals(this.proteinPosition, transcriptConsequenceSummary.proteinPosition) &&
        Objects.equals(this.refSeq, transcriptConsequenceSummary.refSeq) &&
        Objects.equals(this.siftPrediction, transcriptConsequenceSummary.siftPrediction) &&
        Objects.equals(this.siftScore, transcriptConsequenceSummary.siftScore) &&
        Objects.equals(this.transcriptId, transcriptConsequenceSummary.transcriptId) &&
        Objects.equals(this.variantClassification, transcriptConsequenceSummary.variantClassification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aminoAcidAlt, aminoAcidRef, aminoAcids, codonChange, consequenceTerms, entrezGeneId, exon, hgvsc, hgvsp, hgvspShort, hugoGeneSymbol, polyphenPrediction, polyphenScore, proteinPosition, refSeq, siftPrediction, siftScore, transcriptId, variantClassification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptConsequenceSummary {\n");
    
    sb.append("    aminoAcidAlt: ").append(toIndentedString(aminoAcidAlt)).append("\n");
    sb.append("    aminoAcidRef: ").append(toIndentedString(aminoAcidRef)).append("\n");
    sb.append("    aminoAcids: ").append(toIndentedString(aminoAcids)).append("\n");
    sb.append("    codonChange: ").append(toIndentedString(codonChange)).append("\n");
    sb.append("    consequenceTerms: ").append(toIndentedString(consequenceTerms)).append("\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    exon: ").append(toIndentedString(exon)).append("\n");
    sb.append("    hgvsc: ").append(toIndentedString(hgvsc)).append("\n");
    sb.append("    hgvsp: ").append(toIndentedString(hgvsp)).append("\n");
    sb.append("    hgvspShort: ").append(toIndentedString(hgvspShort)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
    sb.append("    polyphenPrediction: ").append(toIndentedString(polyphenPrediction)).append("\n");
    sb.append("    polyphenScore: ").append(toIndentedString(polyphenScore)).append("\n");
    sb.append("    proteinPosition: ").append(toIndentedString(proteinPosition)).append("\n");
    sb.append("    refSeq: ").append(toIndentedString(refSeq)).append("\n");
    sb.append("    siftPrediction: ").append(toIndentedString(siftPrediction)).append("\n");
    sb.append("    siftScore: ").append(toIndentedString(siftScore)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    variantClassification: ").append(toIndentedString(variantClassification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

