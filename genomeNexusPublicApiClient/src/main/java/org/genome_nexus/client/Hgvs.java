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
 * Hgvs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:47:55.205-04:00")
public class Hgvs {
  @SerializedName("coding")
  private List<String> coding = null;

  @SerializedName("genomic")
  private List<String> genomic = null;

  public Hgvs coding(List<String> coding) {
    this.coding = coding;
    return this;
  }

  public Hgvs addCodingItem(String codingItem) {
    if (this.coding == null) {
      this.coding = new ArrayList<String>();
    }
    this.coding.add(codingItem);
    return this;
  }

   /**
   * Get coding
   * @return coding
  **/
  @ApiModelProperty(value = "")
  public List<String> getCoding() {
    return coding;
  }

  public void setCoding(List<String> coding) {
    this.coding = coding;
  }

  public Hgvs genomic(List<String> genomic) {
    this.genomic = genomic;
    return this;
  }

  public Hgvs addGenomicItem(String genomicItem) {
    if (this.genomic == null) {
      this.genomic = new ArrayList<String>();
    }
    this.genomic.add(genomicItem);
    return this;
  }

   /**
   * Get genomic
   * @return genomic
  **/
  @ApiModelProperty(value = "")
  public List<String> getGenomic() {
    return genomic;
  }

  public void setGenomic(List<String> genomic) {
    this.genomic = genomic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hgvs hgvs = (Hgvs) o;
    return Objects.equals(this.coding, hgvs.coding) &&
        Objects.equals(this.genomic, hgvs.genomic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coding, genomic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hgvs {\n");
    
    sb.append("    coding: ").append(toIndentedString(coding)).append("\n");
    sb.append("    genomic: ").append(toIndentedString(genomic)).append("\n");
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

