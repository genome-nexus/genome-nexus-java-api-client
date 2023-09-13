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
 * PostTranslationalModification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T14:14:22.346-04:00")
public class PostTranslationalModification {
  @SerializedName("ensemblTranscriptIds")
  private List<String> ensemblTranscriptIds = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("pubmedIds")
  private List<String> pubmedIds = null;

  @SerializedName("sequence")
  private String sequence = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uniprotAccession")
  private String uniprotAccession = null;

  @SerializedName("uniprotEntry")
  private String uniprotEntry = null;

  public PostTranslationalModification ensemblTranscriptIds(List<String> ensemblTranscriptIds) {
    this.ensemblTranscriptIds = ensemblTranscriptIds;
    return this;
  }

  public PostTranslationalModification addEnsemblTranscriptIdsItem(String ensemblTranscriptIdsItem) {
    if (this.ensemblTranscriptIds == null) {
      this.ensemblTranscriptIds = new ArrayList<String>();
    }
    this.ensemblTranscriptIds.add(ensemblTranscriptIdsItem);
    return this;
  }

   /**
   * Get ensemblTranscriptIds
   * @return ensemblTranscriptIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getEnsemblTranscriptIds() {
    return ensemblTranscriptIds;
  }

  public void setEnsemblTranscriptIds(List<String> ensemblTranscriptIds) {
    this.ensemblTranscriptIds = ensemblTranscriptIds;
  }

  public PostTranslationalModification position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public PostTranslationalModification pubmedIds(List<String> pubmedIds) {
    this.pubmedIds = pubmedIds;
    return this;
  }

  public PostTranslationalModification addPubmedIdsItem(String pubmedIdsItem) {
    if (this.pubmedIds == null) {
      this.pubmedIds = new ArrayList<String>();
    }
    this.pubmedIds.add(pubmedIdsItem);
    return this;
  }

   /**
   * Get pubmedIds
   * @return pubmedIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getPubmedIds() {
    return pubmedIds;
  }

  public void setPubmedIds(List<String> pubmedIds) {
    this.pubmedIds = pubmedIds;
  }

  public PostTranslationalModification sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public PostTranslationalModification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PostTranslationalModification uniprotAccession(String uniprotAccession) {
    this.uniprotAccession = uniprotAccession;
    return this;
  }

   /**
   * Get uniprotAccession
   * @return uniprotAccession
  **/
  @ApiModelProperty(value = "")
  public String getUniprotAccession() {
    return uniprotAccession;
  }

  public void setUniprotAccession(String uniprotAccession) {
    this.uniprotAccession = uniprotAccession;
  }

  public PostTranslationalModification uniprotEntry(String uniprotEntry) {
    this.uniprotEntry = uniprotEntry;
    return this;
  }

   /**
   * Get uniprotEntry
   * @return uniprotEntry
  **/
  @ApiModelProperty(value = "")
  public String getUniprotEntry() {
    return uniprotEntry;
  }

  public void setUniprotEntry(String uniprotEntry) {
    this.uniprotEntry = uniprotEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTranslationalModification postTranslationalModification = (PostTranslationalModification) o;
    return Objects.equals(this.ensemblTranscriptIds, postTranslationalModification.ensemblTranscriptIds) &&
        Objects.equals(this.position, postTranslationalModification.position) &&
        Objects.equals(this.pubmedIds, postTranslationalModification.pubmedIds) &&
        Objects.equals(this.sequence, postTranslationalModification.sequence) &&
        Objects.equals(this.type, postTranslationalModification.type) &&
        Objects.equals(this.uniprotAccession, postTranslationalModification.uniprotAccession) &&
        Objects.equals(this.uniprotEntry, postTranslationalModification.uniprotEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ensemblTranscriptIds, position, pubmedIds, sequence, type, uniprotAccession, uniprotEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTranslationalModification {\n");
    
    sb.append("    ensemblTranscriptIds: ").append(toIndentedString(ensemblTranscriptIds)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    pubmedIds: ").append(toIndentedString(pubmedIds)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniprotAccession: ").append(toIndentedString(uniprotAccession)).append("\n");
    sb.append("    uniprotEntry: ").append(toIndentedString(uniprotEntry)).append("\n");
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

