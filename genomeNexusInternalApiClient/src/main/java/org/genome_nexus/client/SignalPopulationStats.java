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
 * SignalPopulationStats
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-08T09:04:00.294-08:00")
public class SignalPopulationStats {
  @SerializedName("afr")
  private Double afr = null;

  @SerializedName("asj")
  private Double asj = null;

  @SerializedName("asn")
  private Double asn = null;

  @SerializedName("eur")
  private Double eur = null;

  @SerializedName("impact")
  private Double impact = null;

  @SerializedName("oth")
  private Double oth = null;

  public SignalPopulationStats afr(Double afr) {
    this.afr = afr;
    return this;
  }

   /**
   * African/African American
   * @return afr
  **/
  @ApiModelProperty(value = "African/African American")
  public Double getAfr() {
    return afr;
  }

  public void setAfr(Double afr) {
    this.afr = afr;
  }

  public SignalPopulationStats asj(Double asj) {
    this.asj = asj;
    return this;
  }

   /**
   * Ashkenazi Jewish
   * @return asj
  **/
  @ApiModelProperty(value = "Ashkenazi Jewish")
  public Double getAsj() {
    return asj;
  }

  public void setAsj(Double asj) {
    this.asj = asj;
  }

  public SignalPopulationStats asn(Double asn) {
    this.asn = asn;
    return this;
  }

   /**
   * Asian
   * @return asn
  **/
  @ApiModelProperty(value = "Asian")
  public Double getAsn() {
    return asn;
  }

  public void setAsn(Double asn) {
    this.asn = asn;
  }

  public SignalPopulationStats eur(Double eur) {
    this.eur = eur;
    return this;
  }

   /**
   * European
   * @return eur
  **/
  @ApiModelProperty(value = "European")
  public Double getEur() {
    return eur;
  }

  public void setEur(Double eur) {
    this.eur = eur;
  }

  public SignalPopulationStats impact(Double impact) {
    this.impact = impact;
    return this;
  }

   /**
   * Impact
   * @return impact
  **/
  @ApiModelProperty(value = "Impact")
  public Double getImpact() {
    return impact;
  }

  public void setImpact(Double impact) {
    this.impact = impact;
  }

  public SignalPopulationStats oth(Double oth) {
    this.oth = oth;
    return this;
  }

   /**
   * Other
   * @return oth
  **/
  @ApiModelProperty(value = "Other")
  public Double getOth() {
    return oth;
  }

  public void setOth(Double oth) {
    this.oth = oth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalPopulationStats signalPopulationStats = (SignalPopulationStats) o;
    return Objects.equals(this.afr, signalPopulationStats.afr) &&
        Objects.equals(this.asj, signalPopulationStats.asj) &&
        Objects.equals(this.asn, signalPopulationStats.asn) &&
        Objects.equals(this.eur, signalPopulationStats.eur) &&
        Objects.equals(this.impact, signalPopulationStats.impact) &&
        Objects.equals(this.oth, signalPopulationStats.oth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afr, asj, asn, eur, impact, oth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalPopulationStats {\n");
    
    sb.append("    afr: ").append(toIndentedString(afr)).append("\n");
    sb.append("    asj: ").append(toIndentedString(asj)).append("\n");
    sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
    sb.append("    eur: ").append(toIndentedString(eur)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    oth: ").append(toIndentedString(oth)).append("\n");
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

