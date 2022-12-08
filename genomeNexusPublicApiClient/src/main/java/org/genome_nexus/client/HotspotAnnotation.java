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
import org.genome_nexus.client.Hotspot;

/**
 * HotspotAnnotation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-08T09:03:57.668-08:00")
public class HotspotAnnotation {
  @SerializedName("annotation")
  private List<List<Hotspot>> annotation = null;

  @SerializedName("license")
  private String license = null;

  public HotspotAnnotation annotation(List<List<Hotspot>> annotation) {
    this.annotation = annotation;
    return this;
  }

  public HotspotAnnotation addAnnotationItem(List<Hotspot> annotationItem) {
    if (this.annotation == null) {
      this.annotation = new ArrayList<List<Hotspot>>();
    }
    this.annotation.add(annotationItem);
    return this;
  }

   /**
   * Get annotation
   * @return annotation
  **/
  @ApiModelProperty(value = "")
  public List<List<Hotspot>> getAnnotation() {
    return annotation;
  }

  public void setAnnotation(List<List<Hotspot>> annotation) {
    this.annotation = annotation;
  }

  public HotspotAnnotation license(String license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotspotAnnotation hotspotAnnotation = (HotspotAnnotation) o;
    return Objects.equals(this.annotation, hotspotAnnotation.annotation) &&
        Objects.equals(this.license, hotspotAnnotation.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, license);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotspotAnnotation {\n");
    
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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

