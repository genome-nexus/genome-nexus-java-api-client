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
 * AlleleNumber
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:43:13.566-05:00")
public class AlleleNumber {
  @SerializedName("an")
  private Integer an = null;

  @SerializedName("an_afr")
  private Integer anAfr = null;

  @SerializedName("an_amr")
  private Integer anAmr = null;

  @SerializedName("an_asj")
  private Integer anAsj = null;

  @SerializedName("an_eas")
  private Integer anEas = null;

  @SerializedName("an_fin")
  private Integer anFin = null;

  @SerializedName("an_nfe")
  private Integer anNfe = null;

  @SerializedName("an_oth")
  private Integer anOth = null;

  @SerializedName("an_sas")
  private Integer anSas = null;

  public AlleleNumber an(Integer an) {
    this.an = an;
    return this;
  }

   /**
   * Get an
   * @return an
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAn() {
    return an;
  }

  public void setAn(Integer an) {
    this.an = an;
  }

  public AlleleNumber anAfr(Integer anAfr) {
    this.anAfr = anAfr;
    return this;
  }

   /**
   * Get anAfr
   * @return anAfr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnAfr() {
    return anAfr;
  }

  public void setAnAfr(Integer anAfr) {
    this.anAfr = anAfr;
  }

  public AlleleNumber anAmr(Integer anAmr) {
    this.anAmr = anAmr;
    return this;
  }

   /**
   * Get anAmr
   * @return anAmr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnAmr() {
    return anAmr;
  }

  public void setAnAmr(Integer anAmr) {
    this.anAmr = anAmr;
  }

  public AlleleNumber anAsj(Integer anAsj) {
    this.anAsj = anAsj;
    return this;
  }

   /**
   * Get anAsj
   * @return anAsj
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnAsj() {
    return anAsj;
  }

  public void setAnAsj(Integer anAsj) {
    this.anAsj = anAsj;
  }

  public AlleleNumber anEas(Integer anEas) {
    this.anEas = anEas;
    return this;
  }

   /**
   * Get anEas
   * @return anEas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnEas() {
    return anEas;
  }

  public void setAnEas(Integer anEas) {
    this.anEas = anEas;
  }

  public AlleleNumber anFin(Integer anFin) {
    this.anFin = anFin;
    return this;
  }

   /**
   * Get anFin
   * @return anFin
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnFin() {
    return anFin;
  }

  public void setAnFin(Integer anFin) {
    this.anFin = anFin;
  }

  public AlleleNumber anNfe(Integer anNfe) {
    this.anNfe = anNfe;
    return this;
  }

   /**
   * Get anNfe
   * @return anNfe
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnNfe() {
    return anNfe;
  }

  public void setAnNfe(Integer anNfe) {
    this.anNfe = anNfe;
  }

  public AlleleNumber anOth(Integer anOth) {
    this.anOth = anOth;
    return this;
  }

   /**
   * Get anOth
   * @return anOth
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnOth() {
    return anOth;
  }

  public void setAnOth(Integer anOth) {
    this.anOth = anOth;
  }

  public AlleleNumber anSas(Integer anSas) {
    this.anSas = anSas;
    return this;
  }

   /**
   * Get anSas
   * @return anSas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAnSas() {
    return anSas;
  }

  public void setAnSas(Integer anSas) {
    this.anSas = anSas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleNumber alleleNumber = (AlleleNumber) o;
    return Objects.equals(this.an, alleleNumber.an) &&
        Objects.equals(this.anAfr, alleleNumber.anAfr) &&
        Objects.equals(this.anAmr, alleleNumber.anAmr) &&
        Objects.equals(this.anAsj, alleleNumber.anAsj) &&
        Objects.equals(this.anEas, alleleNumber.anEas) &&
        Objects.equals(this.anFin, alleleNumber.anFin) &&
        Objects.equals(this.anNfe, alleleNumber.anNfe) &&
        Objects.equals(this.anOth, alleleNumber.anOth) &&
        Objects.equals(this.anSas, alleleNumber.anSas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(an, anAfr, anAmr, anAsj, anEas, anFin, anNfe, anOth, anSas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleNumber {\n");
    
    sb.append("    an: ").append(toIndentedString(an)).append("\n");
    sb.append("    anAfr: ").append(toIndentedString(anAfr)).append("\n");
    sb.append("    anAmr: ").append(toIndentedString(anAmr)).append("\n");
    sb.append("    anAsj: ").append(toIndentedString(anAsj)).append("\n");
    sb.append("    anEas: ").append(toIndentedString(anEas)).append("\n");
    sb.append("    anFin: ").append(toIndentedString(anFin)).append("\n");
    sb.append("    anNfe: ").append(toIndentedString(anNfe)).append("\n");
    sb.append("    anOth: ").append(toIndentedString(anOth)).append("\n");
    sb.append("    anSas: ").append(toIndentedString(anSas)).append("\n");
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

