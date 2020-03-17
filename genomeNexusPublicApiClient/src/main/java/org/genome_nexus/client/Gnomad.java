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
import org.genome_nexus.client.AlleleCount;
import org.genome_nexus.client.AlleleFrequency;
import org.genome_nexus.client.AlleleNumber;
import org.genome_nexus.client.Homozygotes;

/**
 * Gnomad
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-17T16:29:55.091-04:00")
public class Gnomad {
  @SerializedName("alleleCount")
  private AlleleCount alleleCount = null;

  @SerializedName("alleleFrequency")
  private AlleleFrequency alleleFrequency = null;

  @SerializedName("alleleNumber")
  private AlleleNumber alleleNumber = null;

  @SerializedName("homozygotes")
  private Homozygotes homozygotes = null;

  public Gnomad alleleCount(AlleleCount alleleCount) {
    this.alleleCount = alleleCount;
    return this;
  }

   /**
   * ac
   * @return alleleCount
  **/
  @ApiModelProperty(value = "ac")
  public AlleleCount getAlleleCount() {
    return alleleCount;
  }

  public void setAlleleCount(AlleleCount alleleCount) {
    this.alleleCount = alleleCount;
  }

  public Gnomad alleleFrequency(AlleleFrequency alleleFrequency) {
    this.alleleFrequency = alleleFrequency;
    return this;
  }

   /**
   * af
   * @return alleleFrequency
  **/
  @ApiModelProperty(value = "af")
  public AlleleFrequency getAlleleFrequency() {
    return alleleFrequency;
  }

  public void setAlleleFrequency(AlleleFrequency alleleFrequency) {
    this.alleleFrequency = alleleFrequency;
  }

  public Gnomad alleleNumber(AlleleNumber alleleNumber) {
    this.alleleNumber = alleleNumber;
    return this;
  }

   /**
   * an
   * @return alleleNumber
  **/
  @ApiModelProperty(value = "an")
  public AlleleNumber getAlleleNumber() {
    return alleleNumber;
  }

  public void setAlleleNumber(AlleleNumber alleleNumber) {
    this.alleleNumber = alleleNumber;
  }

  public Gnomad homozygotes(Homozygotes homozygotes) {
    this.homozygotes = homozygotes;
    return this;
  }

   /**
   * hom
   * @return homozygotes
  **/
  @ApiModelProperty(value = "hom")
  public Homozygotes getHomozygotes() {
    return homozygotes;
  }

  public void setHomozygotes(Homozygotes homozygotes) {
    this.homozygotes = homozygotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gnomad gnomad = (Gnomad) o;
    return Objects.equals(this.alleleCount, gnomad.alleleCount) &&
        Objects.equals(this.alleleFrequency, gnomad.alleleFrequency) &&
        Objects.equals(this.alleleNumber, gnomad.alleleNumber) &&
        Objects.equals(this.homozygotes, gnomad.homozygotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alleleCount, alleleFrequency, alleleNumber, homozygotes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gnomad {\n");
    
    sb.append("    alleleCount: ").append(toIndentedString(alleleCount)).append("\n");
    sb.append("    alleleFrequency: ").append(toIndentedString(alleleFrequency)).append("\n");
    sb.append("    alleleNumber: ").append(toIndentedString(alleleNumber)).append("\n");
    sb.append("    homozygotes: ").append(toIndentedString(homozygotes)).append("\n");
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

