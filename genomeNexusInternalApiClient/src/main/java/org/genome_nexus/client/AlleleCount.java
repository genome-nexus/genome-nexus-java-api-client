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
 * AlleleCount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-08T17:14:26.472-04:00")
public class AlleleCount {
  @SerializedName("ac")
  private Integer ac = null;

  @SerializedName("ac_afr")
  private Integer acAfr = null;

  @SerializedName("ac_amr")
  private Integer acAmr = null;

  @SerializedName("ac_asj")
  private Integer acAsj = null;

  @SerializedName("ac_eas")
  private Integer acEas = null;

  @SerializedName("ac_fin")
  private Integer acFin = null;

  @SerializedName("ac_nfe")
  private Integer acNfe = null;

  @SerializedName("ac_oth")
  private Integer acOth = null;

  @SerializedName("ac_sas")
  private Integer acSas = null;

  public AlleleCount ac(Integer ac) {
    this.ac = ac;
    return this;
  }

   /**
   * Get ac
   * @return ac
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAc() {
    return ac;
  }

  public void setAc(Integer ac) {
    this.ac = ac;
  }

  public AlleleCount acAfr(Integer acAfr) {
    this.acAfr = acAfr;
    return this;
  }

   /**
   * Get acAfr
   * @return acAfr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcAfr() {
    return acAfr;
  }

  public void setAcAfr(Integer acAfr) {
    this.acAfr = acAfr;
  }

  public AlleleCount acAmr(Integer acAmr) {
    this.acAmr = acAmr;
    return this;
  }

   /**
   * Get acAmr
   * @return acAmr
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcAmr() {
    return acAmr;
  }

  public void setAcAmr(Integer acAmr) {
    this.acAmr = acAmr;
  }

  public AlleleCount acAsj(Integer acAsj) {
    this.acAsj = acAsj;
    return this;
  }

   /**
   * Get acAsj
   * @return acAsj
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcAsj() {
    return acAsj;
  }

  public void setAcAsj(Integer acAsj) {
    this.acAsj = acAsj;
  }

  public AlleleCount acEas(Integer acEas) {
    this.acEas = acEas;
    return this;
  }

   /**
   * Get acEas
   * @return acEas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcEas() {
    return acEas;
  }

  public void setAcEas(Integer acEas) {
    this.acEas = acEas;
  }

  public AlleleCount acFin(Integer acFin) {
    this.acFin = acFin;
    return this;
  }

   /**
   * Get acFin
   * @return acFin
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcFin() {
    return acFin;
  }

  public void setAcFin(Integer acFin) {
    this.acFin = acFin;
  }

  public AlleleCount acNfe(Integer acNfe) {
    this.acNfe = acNfe;
    return this;
  }

   /**
   * Get acNfe
   * @return acNfe
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcNfe() {
    return acNfe;
  }

  public void setAcNfe(Integer acNfe) {
    this.acNfe = acNfe;
  }

  public AlleleCount acOth(Integer acOth) {
    this.acOth = acOth;
    return this;
  }

   /**
   * Get acOth
   * @return acOth
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcOth() {
    return acOth;
  }

  public void setAcOth(Integer acOth) {
    this.acOth = acOth;
  }

  public AlleleCount acSas(Integer acSas) {
    this.acSas = acSas;
    return this;
  }

   /**
   * Get acSas
   * @return acSas
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAcSas() {
    return acSas;
  }

  public void setAcSas(Integer acSas) {
    this.acSas = acSas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleCount alleleCount = (AlleleCount) o;
    return Objects.equals(this.ac, alleleCount.ac) &&
        Objects.equals(this.acAfr, alleleCount.acAfr) &&
        Objects.equals(this.acAmr, alleleCount.acAmr) &&
        Objects.equals(this.acAsj, alleleCount.acAsj) &&
        Objects.equals(this.acEas, alleleCount.acEas) &&
        Objects.equals(this.acFin, alleleCount.acFin) &&
        Objects.equals(this.acNfe, alleleCount.acNfe) &&
        Objects.equals(this.acOth, alleleCount.acOth) &&
        Objects.equals(this.acSas, alleleCount.acSas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, acAfr, acAmr, acAsj, acEas, acFin, acNfe, acOth, acSas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleCount {\n");
    
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    acAfr: ").append(toIndentedString(acAfr)).append("\n");
    sb.append("    acAmr: ").append(toIndentedString(acAmr)).append("\n");
    sb.append("    acAsj: ").append(toIndentedString(acAsj)).append("\n");
    sb.append("    acEas: ").append(toIndentedString(acEas)).append("\n");
    sb.append("    acFin: ").append(toIndentedString(acFin)).append("\n");
    sb.append("    acNfe: ").append(toIndentedString(acNfe)).append("\n");
    sb.append("    acOth: ").append(toIndentedString(acOth)).append("\n");
    sb.append("    acSas: ").append(toIndentedString(acSas)).append("\n");
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

