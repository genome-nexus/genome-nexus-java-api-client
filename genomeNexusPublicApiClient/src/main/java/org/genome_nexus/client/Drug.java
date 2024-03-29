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
 * Drug
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-08T09:03:57.668-08:00")
public class Drug {
  @SerializedName("drugName")
  private String drugName = null;

  @SerializedName("ncitCode")
  private String ncitCode = null;

  @SerializedName("synonyms")
  private List<String> synonyms = null;

  @SerializedName("uuid")
  private String uuid = null;

  public Drug drugName(String drugName) {
    this.drugName = drugName;
    return this;
  }

   /**
   * Get drugName
   * @return drugName
  **/
  @ApiModelProperty(value = "")
  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(String drugName) {
    this.drugName = drugName;
  }

  public Drug ncitCode(String ncitCode) {
    this.ncitCode = ncitCode;
    return this;
  }

   /**
   * Get ncitCode
   * @return ncitCode
  **/
  @ApiModelProperty(value = "")
  public String getNcitCode() {
    return ncitCode;
  }

  public void setNcitCode(String ncitCode) {
    this.ncitCode = ncitCode;
  }

  public Drug synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Drug addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<String>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Get synonyms
   * @return synonyms
  **/
  @ApiModelProperty(value = "")
  public List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public Drug uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.drugName, drug.drugName) &&
        Objects.equals(this.ncitCode, drug.ncitCode) &&
        Objects.equals(this.synonyms, drug.synonyms) &&
        Objects.equals(this.uuid, drug.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drugName, ncitCode, synonyms, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    
    sb.append("    drugName: ").append(toIndentedString(drugName)).append("\n");
    sb.append("    ncitCode: ").append(toIndentedString(ncitCode)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

