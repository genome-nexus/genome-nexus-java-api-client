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
import org.genome_nexus.client.GenomicLocation;
import org.genome_nexus.client.Hotspot;
import org.genome_nexus.client.ProteinLocation;

/**
 * AggregatedHotspots
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:48:04.268-04:00")
public class AggregatedHotspots {
  @SerializedName("genomicLocation")
  private GenomicLocation genomicLocation = null;

  @SerializedName("hotspots")
  private List<Hotspot> hotspots = new ArrayList<Hotspot>();

  @SerializedName("proteinLocation")
  private ProteinLocation proteinLocation = null;

  @SerializedName("transcriptId")
  private String transcriptId = null;

  @SerializedName("variant")
  private String variant = null;

  public AggregatedHotspots genomicLocation(GenomicLocation genomicLocation) {
    this.genomicLocation = genomicLocation;
    return this;
  }

   /**
   * Genomic Location
   * @return genomicLocation
  **/
  @ApiModelProperty(required = true, value = "Genomic Location")
  public GenomicLocation getGenomicLocation() {
    return genomicLocation;
  }

  public void setGenomicLocation(GenomicLocation genomicLocation) {
    this.genomicLocation = genomicLocation;
  }

  public AggregatedHotspots hotspots(List<Hotspot> hotspots) {
    this.hotspots = hotspots;
    return this;
  }

  public AggregatedHotspots addHotspotsItem(Hotspot hotspotsItem) {
    this.hotspots.add(hotspotsItem);
    return this;
  }

   /**
   * Hotspots
   * @return hotspots
  **/
  @ApiModelProperty(required = true, value = "Hotspots")
  public List<Hotspot> getHotspots() {
    return hotspots;
  }

  public void setHotspots(List<Hotspot> hotspots) {
    this.hotspots = hotspots;
  }

  public AggregatedHotspots proteinLocation(ProteinLocation proteinLocation) {
    this.proteinLocation = proteinLocation;
    return this;
  }

   /**
   * Get proteinLocation
   * @return proteinLocation
  **/
  @ApiModelProperty(value = "")
  public ProteinLocation getProteinLocation() {
    return proteinLocation;
  }

  public void setProteinLocation(ProteinLocation proteinLocation) {
    this.proteinLocation = proteinLocation;
  }

  public AggregatedHotspots transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Get transcriptId
   * @return transcriptId
  **/
  @ApiModelProperty(value = "")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public AggregatedHotspots variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * HGVS notation
   * @return variant
  **/
  @ApiModelProperty(required = true, value = "HGVS notation")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedHotspots aggregatedHotspots = (AggregatedHotspots) o;
    return Objects.equals(this.genomicLocation, aggregatedHotspots.genomicLocation) &&
        Objects.equals(this.hotspots, aggregatedHotspots.hotspots) &&
        Objects.equals(this.proteinLocation, aggregatedHotspots.proteinLocation) &&
        Objects.equals(this.transcriptId, aggregatedHotspots.transcriptId) &&
        Objects.equals(this.variant, aggregatedHotspots.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genomicLocation, hotspots, proteinLocation, transcriptId, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedHotspots {\n");
    
    sb.append("    genomicLocation: ").append(toIndentedString(genomicLocation)).append("\n");
    sb.append("    hotspots: ").append(toIndentedString(hotspots)).append("\n");
    sb.append("    proteinLocation: ").append(toIndentedString(proteinLocation)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

