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
 * HrdScore
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:43:13.566-05:00")
public class HrdScore {
  @SerializedName("fractionLoh")
  private Double fractionLoh = null;

  @SerializedName("lst")
  private Double lst = null;

  @SerializedName("ntelomericAi")
  private Double ntelomericAi = null;

  public HrdScore fractionLoh(Double fractionLoh) {
    this.fractionLoh = fractionLoh;
    return this;
  }

   /**
   * Median HRD Fraction LOH
   * @return fractionLoh
  **/
  @ApiModelProperty(value = "Median HRD Fraction LOH")
  public Double getFractionLoh() {
    return fractionLoh;
  }

  public void setFractionLoh(Double fractionLoh) {
    this.fractionLoh = fractionLoh;
  }

  public HrdScore lst(Double lst) {
    this.lst = lst;
    return this;
  }

   /**
   * Median HRD LST
   * @return lst
  **/
  @ApiModelProperty(value = "Median HRD LST")
  public Double getLst() {
    return lst;
  }

  public void setLst(Double lst) {
    this.lst = lst;
  }

  public HrdScore ntelomericAi(Double ntelomericAi) {
    this.ntelomericAi = ntelomericAi;
    return this;
  }

   /**
   * Median HRD ntelomeric AI
   * @return ntelomericAi
  **/
  @ApiModelProperty(value = "Median HRD ntelomeric AI")
  public Double getNtelomericAi() {
    return ntelomericAi;
  }

  public void setNtelomericAi(Double ntelomericAi) {
    this.ntelomericAi = ntelomericAi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrdScore hrdScore = (HrdScore) o;
    return Objects.equals(this.fractionLoh, hrdScore.fractionLoh) &&
        Objects.equals(this.lst, hrdScore.lst) &&
        Objects.equals(this.ntelomericAi, hrdScore.ntelomericAi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fractionLoh, lst, ntelomericAi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrdScore {\n");
    
    sb.append("    fractionLoh: ").append(toIndentedString(fractionLoh)).append("\n");
    sb.append("    lst: ").append(toIndentedString(lst)).append("\n");
    sb.append("    ntelomericAi: ").append(toIndentedString(ntelomericAi)).append("\n");
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

