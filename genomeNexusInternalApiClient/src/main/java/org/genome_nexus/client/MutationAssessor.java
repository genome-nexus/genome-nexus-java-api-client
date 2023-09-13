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

/**
 * MutationAssessor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T14:14:23.202-04:00")
public class MutationAssessor {
  @SerializedName("codonStartPosition")
  private String codonStartPosition = null;

  @SerializedName("cosmicCount")
  private Integer cosmicCount = null;

  @SerializedName("functionalImpact")
  private String functionalImpact = null;

  @SerializedName("functionalImpactScore")
  private Double functionalImpactScore = null;

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("mappingIssue")
  private String mappingIssue = null;

  @SerializedName("msaGaps")
  private Double msaGaps = null;

  @SerializedName("msaHeight")
  private Integer msaHeight = null;

  @SerializedName("msaLink")
  private String msaLink = null;

  @SerializedName("pdbLink")
  private String pdbLink = null;

  @SerializedName("referenceGenomeVariant")
  private String referenceGenomeVariant = null;

  @SerializedName("referenceGenomeVariantType")
  private String referenceGenomeVariantType = null;

  @SerializedName("refseqId")
  private String refseqId = null;

  @SerializedName("refseqPosition")
  private Integer refseqPosition = null;

  @SerializedName("refseqResidue")
  private String refseqResidue = null;

  @SerializedName("snpCount")
  private Integer snpCount = null;

  @SerializedName("uniprotId")
  private String uniprotId = null;

  @SerializedName("uniprotPosition")
  private Integer uniprotPosition = null;

  @SerializedName("uniprotResidue")
  private String uniprotResidue = null;

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("variantConservationScore")
  private Double variantConservationScore = null;

  @SerializedName("variantSpecificityScore")
  private Double variantSpecificityScore = null;

  public MutationAssessor codonStartPosition(String codonStartPosition) {
    this.codonStartPosition = codonStartPosition;
    return this;
  }

   /**
   * Codon start position
   * @return codonStartPosition
  **/
  @ApiModelProperty(value = "Codon start position")
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
  @ApiModelProperty(value = "Number of mutations in COSMIC for this protein")
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
  @ApiModelProperty(value = "Functional impact")
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
  @ApiModelProperty(value = "Functional impact score")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "Hugo gene symbol")
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
  @ApiModelProperty(required = true, value = "User-input variants")
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
  @ApiModelProperty(value = "Mapping issue info")
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
  @ApiModelProperty(value = "Portion of gaps in variant position in multiple sequence alignment")
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
  @ApiModelProperty(value = "Number of diverse sequences in multiple sequence alignment (identical or highly similar sequences filtered out)")
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
  @ApiModelProperty(value = "Link to multiple sequence alignment")
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
  @ApiModelProperty(value = "Link to 3d structure browser")
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
  @ApiModelProperty(value = "Reference genome variant")
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
  @ApiModelProperty(value = "Reference genome variant type")
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
  @ApiModelProperty(value = "Refseq protein ID")
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
  @ApiModelProperty(value = "Variant position in Refseq protein, can be different from the one in Uniprot")
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
  @ApiModelProperty(value = "Reference residue in Refseq protein, can be different from the one in Uniprot")
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
  @ApiModelProperty(value = "Number of SNPs in dbSNP for this protein")
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
  @ApiModelProperty(value = "Uniprot protein accession ID")
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
  @ApiModelProperty(value = "Variant position in Uniprot protein, can be different from the one in Refseq")
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
  @ApiModelProperty(value = "Reference residue in Uniprot protein, can be different from the one in Refseq")
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
  @ApiModelProperty(value = "Amino acid substitution")
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
  @ApiModelProperty(value = "Variant conservation score")
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
  @ApiModelProperty(value = "Variant specificity score")
  public Double getVariantSpecificityScore() {
    return variantSpecificityScore;
  }

  public void setVariantSpecificityScore(Double variantSpecificityScore) {
    this.variantSpecificityScore = variantSpecificityScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

