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

/**
 * CuriousCases
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T14:14:23.202-04:00")
public class CuriousCases {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("genomicLocation")
  private String genomicLocation = null;

  @SerializedName("hugoGeneSymbol")
  private String hugoGeneSymbol = null;

  @SerializedName("pubmedIds")
  private List<Integer> pubmedIds = null;

  public CuriousCases comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public CuriousCases genomicLocation(String genomicLocation) {
    this.genomicLocation = genomicLocation;
    return this;
  }

   /**
   * Get genomicLocation
   * @return genomicLocation
  **/
  @ApiModelProperty(value = "")
  public String getGenomicLocation() {
    return genomicLocation;
  }

  public void setGenomicLocation(String genomicLocation) {
    this.genomicLocation = genomicLocation;
  }

  public CuriousCases hugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
    return this;
  }

   /**
   * Get hugoGeneSymbol
   * @return hugoGeneSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoGeneSymbol() {
    return hugoGeneSymbol;
  }

  public void setHugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
  }

  public CuriousCases pubmedIds(List<Integer> pubmedIds) {
    this.pubmedIds = pubmedIds;
    return this;
  }

  public CuriousCases addPubmedIdsItem(Integer pubmedIdsItem) {
    if (this.pubmedIds == null) {
      this.pubmedIds = new ArrayList<Integer>();
    }
    this.pubmedIds.add(pubmedIdsItem);
    return this;
  }

   /**
   * Get pubmedIds
   * @return pubmedIds
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getPubmedIds() {
    return pubmedIds;
  }

  public void setPubmedIds(List<Integer> pubmedIds) {
    this.pubmedIds = pubmedIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CuriousCases curiousCases = (CuriousCases) o;
    return Objects.equals(this.comment, curiousCases.comment) &&
        Objects.equals(this.genomicLocation, curiousCases.genomicLocation) &&
        Objects.equals(this.hugoGeneSymbol, curiousCases.hugoGeneSymbol) &&
        Objects.equals(this.pubmedIds, curiousCases.pubmedIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, genomicLocation, hugoGeneSymbol, pubmedIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CuriousCases {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    genomicLocation: ").append(toIndentedString(genomicLocation)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
    sb.append("    pubmedIds: ").append(toIndentedString(pubmedIds)).append("\n");
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

