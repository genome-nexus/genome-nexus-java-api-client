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
import java.util.ArrayList;
import java.util.List;
import org.genome_nexus.client.Gene;
import org.genome_nexus.client.Hg19;
import org.genome_nexus.client.Hg38;
import org.genome_nexus.client.Hgvs;
import org.genome_nexus.client.Rcv;

/**
 * ClinVar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:47:55.205-04:00")
public class ClinVar {
  @SerializedName("alleleId")
  private Integer alleleId = null;

  @SerializedName("alt")
  private String alt = null;

  @SerializedName("chrom")
  private String chrom = null;

  @SerializedName("cytogenic")
  private String cytogenic = null;

  @SerializedName("gene")
  private Gene gene = null;

  @SerializedName("hg19")
  private Hg19 hg19 = null;

  @SerializedName("hg38")
  private Hg38 hg38 = null;

  @SerializedName("hgvs")
  private Hgvs hgvs = null;

  @SerializedName("license")
  private String license = null;

  @SerializedName("rcv")
  private List<Rcv> rcv = null;

  @SerializedName("variantId")
  private Integer variantId = null;

  public ClinVar alleleId(Integer alleleId) {
    this.alleleId = alleleId;
    return this;
  }

   /**
   * allele_id
   * @return alleleId
  **/
  @ApiModelProperty(value = "allele_id")
  public Integer getAlleleId() {
    return alleleId;
  }

  public void setAlleleId(Integer alleleId) {
    this.alleleId = alleleId;
  }

  public ClinVar alt(String alt) {
    this.alt = alt;
    return this;
  }

   /**
   * alt
   * @return alt
  **/
  @ApiModelProperty(value = "alt")
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public ClinVar chrom(String chrom) {
    this.chrom = chrom;
    return this;
  }

   /**
   * chrom
   * @return chrom
  **/
  @ApiModelProperty(value = "chrom")
  public String getChrom() {
    return chrom;
  }

  public void setChrom(String chrom) {
    this.chrom = chrom;
  }

  public ClinVar cytogenic(String cytogenic) {
    this.cytogenic = cytogenic;
    return this;
  }

   /**
   * cytogenic
   * @return cytogenic
  **/
  @ApiModelProperty(value = "cytogenic")
  public String getCytogenic() {
    return cytogenic;
  }

  public void setCytogenic(String cytogenic) {
    this.cytogenic = cytogenic;
  }

  public ClinVar gene(Gene gene) {
    this.gene = gene;
    return this;
  }

   /**
   * gene
   * @return gene
  **/
  @ApiModelProperty(value = "gene")
  public Gene getGene() {
    return gene;
  }

  public void setGene(Gene gene) {
    this.gene = gene;
  }

  public ClinVar hg19(Hg19 hg19) {
    this.hg19 = hg19;
    return this;
  }

   /**
   * hg19
   * @return hg19
  **/
  @ApiModelProperty(value = "hg19")
  public Hg19 getHg19() {
    return hg19;
  }

  public void setHg19(Hg19 hg19) {
    this.hg19 = hg19;
  }

  public ClinVar hg38(Hg38 hg38) {
    this.hg38 = hg38;
    return this;
  }

   /**
   * hg38
   * @return hg38
  **/
  @ApiModelProperty(value = "hg38")
  public Hg38 getHg38() {
    return hg38;
  }

  public void setHg38(Hg38 hg38) {
    this.hg38 = hg38;
  }

  public ClinVar hgvs(Hgvs hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "hgvs")
  public Hgvs getHgvs() {
    return hgvs;
  }

  public void setHgvs(Hgvs hgvs) {
    this.hgvs = hgvs;
  }

  public ClinVar license(String license) {
    this.license = license;
    return this;
  }

   /**
   * license
   * @return license
  **/
  @ApiModelProperty(value = "license")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public ClinVar rcv(List<Rcv> rcv) {
    this.rcv = rcv;
    return this;
  }

  public ClinVar addRcvItem(Rcv rcvItem) {
    if (this.rcv == null) {
      this.rcv = new ArrayList<Rcv>();
    }
    this.rcv.add(rcvItem);
    return this;
  }

   /**
   * Get rcv
   * @return rcv
  **/
  @ApiModelProperty(value = "")
  public List<Rcv> getRcv() {
    return rcv;
  }

  public void setRcv(List<Rcv> rcv) {
    this.rcv = rcv;
  }

  public ClinVar variantId(Integer variantId) {
    this.variantId = variantId;
    return this;
  }

   /**
   * variant_id
   * @return variantId
  **/
  @ApiModelProperty(value = "variant_id")
  public Integer getVariantId() {
    return variantId;
  }

  public void setVariantId(Integer variantId) {
    this.variantId = variantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClinVar clinVar = (ClinVar) o;
    return Objects.equals(this.alleleId, clinVar.alleleId) &&
        Objects.equals(this.alt, clinVar.alt) &&
        Objects.equals(this.chrom, clinVar.chrom) &&
        Objects.equals(this.cytogenic, clinVar.cytogenic) &&
        Objects.equals(this.gene, clinVar.gene) &&
        Objects.equals(this.hg19, clinVar.hg19) &&
        Objects.equals(this.hg38, clinVar.hg38) &&
        Objects.equals(this.hgvs, clinVar.hgvs) &&
        Objects.equals(this.license, clinVar.license) &&
        Objects.equals(this.rcv, clinVar.rcv) &&
        Objects.equals(this.variantId, clinVar.variantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alleleId, alt, chrom, cytogenic, gene, hg19, hg38, hgvs, license, rcv, variantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClinVar {\n");
    
    sb.append("    alleleId: ").append(toIndentedString(alleleId)).append("\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    chrom: ").append(toIndentedString(chrom)).append("\n");
    sb.append("    cytogenic: ").append(toIndentedString(cytogenic)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    hg19: ").append(toIndentedString(hg19)).append("\n");
    sb.append("    hg38: ").append(toIndentedString(hg38)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    rcv: ").append(toIndentedString(rcv)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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

