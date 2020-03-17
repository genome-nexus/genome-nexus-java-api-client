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
import org.genome_nexus.client.Hg19;

/**
 * Mutdb
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-17T16:29:55.091-04:00")
public class Mutdb {
  @SerializedName("alt")
  private String alt = null;

  @SerializedName("chrom")
  private String chrom = null;

  @SerializedName("cosmicId")
  private String cosmicId = null;

  @SerializedName("hg19")
  private Hg19 hg19 = null;

  @SerializedName("mutpredScore")
  private Double mutpredScore = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("rsid")
  private String rsid = null;

  @SerializedName("uniprotId")
  private String uniprotId = null;

  public Mutdb alt(String alt) {
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

  public Mutdb chrom(String chrom) {
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

  public Mutdb cosmicId(String cosmicId) {
    this.cosmicId = cosmicId;
    return this;
  }

   /**
   * cosmic_id
   * @return cosmicId
  **/
  @ApiModelProperty(value = "cosmic_id")
  public String getCosmicId() {
    return cosmicId;
  }

  public void setCosmicId(String cosmicId) {
    this.cosmicId = cosmicId;
  }

  public Mutdb hg19(Hg19 hg19) {
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

  public Mutdb mutpredScore(Double mutpredScore) {
    this.mutpredScore = mutpredScore;
    return this;
  }

   /**
   * mutpred_score
   * @return mutpredScore
  **/
  @ApiModelProperty(value = "mutpred_score")
  public Double getMutpredScore() {
    return mutpredScore;
  }

  public void setMutpredScore(Double mutpredScore) {
    this.mutpredScore = mutpredScore;
  }

  public Mutdb ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * ref
   * @return ref
  **/
  @ApiModelProperty(value = "ref")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public Mutdb rsid(String rsid) {
    this.rsid = rsid;
    return this;
  }

   /**
   * rsid
   * @return rsid
  **/
  @ApiModelProperty(value = "rsid")
  public String getRsid() {
    return rsid;
  }

  public void setRsid(String rsid) {
    this.rsid = rsid;
  }

  public Mutdb uniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
    return this;
  }

   /**
   * uniprot_id
   * @return uniprotId
  **/
  @ApiModelProperty(value = "uniprot_id")
  public String getUniprotId() {
    return uniprotId;
  }

  public void setUniprotId(String uniprotId) {
    this.uniprotId = uniprotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mutdb mutdb = (Mutdb) o;
    return Objects.equals(this.alt, mutdb.alt) &&
        Objects.equals(this.chrom, mutdb.chrom) &&
        Objects.equals(this.cosmicId, mutdb.cosmicId) &&
        Objects.equals(this.hg19, mutdb.hg19) &&
        Objects.equals(this.mutpredScore, mutdb.mutpredScore) &&
        Objects.equals(this.ref, mutdb.ref) &&
        Objects.equals(this.rsid, mutdb.rsid) &&
        Objects.equals(this.uniprotId, mutdb.uniprotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, chrom, cosmicId, hg19, mutpredScore, ref, rsid, uniprotId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mutdb {\n");
    
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    chrom: ").append(toIndentedString(chrom)).append("\n");
    sb.append("    cosmicId: ").append(toIndentedString(cosmicId)).append("\n");
    sb.append("    hg19: ").append(toIndentedString(hg19)).append("\n");
    sb.append("    mutpredScore: ").append(toIndentedString(mutpredScore)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    rsid: ").append(toIndentedString(rsid)).append("\n");
    sb.append("    uniprotId: ").append(toIndentedString(uniprotId)).append("\n");
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

