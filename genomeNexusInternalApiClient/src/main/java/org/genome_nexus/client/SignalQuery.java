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
 * SignalQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:43:13.566-05:00")
public class SignalQuery {
  @SerializedName("alteration")
  private String alteration = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  /**
   * Match Type
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    EXACT("EXACT"),
    
    STARTS_WITH("STARTS_WITH"),
    
    PARTIAL("PARTIAL"),
    
    NO_MATCH("NO_MATCH");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String text) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("matchType")
  private MatchTypeEnum matchType = null;

  /**
   * Query Type
   */
  @JsonAdapter(QueryTypeEnum.Adapter.class)
  public enum QueryTypeEnum {
    GENE("GENE"),
    
    ALTERATION("ALTERATION"),
    
    VARIANT("VARIANT"),
    
    REGION("REGION");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QueryTypeEnum fromValue(String text) {
      for (QueryTypeEnum b : QueryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QueryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QueryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QueryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QueryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("queryType")
  private QueryTypeEnum queryType = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("variant")
  private String variant = null;

  public SignalQuery alteration(String alteration) {
    this.alteration = alteration;
    return this;
  }

   /**
   * Matching Alteration (e.g: V600E)
   * @return alteration
  **/
  @ApiModelProperty(value = "Matching Alteration (e.g: V600E)")
  public String getAlteration() {
    return alteration;
  }

  public void setAlteration(String alteration) {
    this.alteration = alteration;
  }

  public SignalQuery description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional free-form text
   * @return description
  **/
  @ApiModelProperty(value = "Optional free-form text")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SignalQuery hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Matching Hugo Gene Symbol (e.g: BRCA2, BRAF)
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "Matching Hugo Gene Symbol (e.g: BRCA2, BRAF)")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public SignalQuery matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Match Type
   * @return matchType
  **/
  @ApiModelProperty(value = "Match Type")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  public SignalQuery queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }

   /**
   * Query Type
   * @return queryType
  **/
  @ApiModelProperty(value = "Query Type")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }

  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }

  public SignalQuery region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Matching Region (e.g: 13:32968940-32968940)
   * @return region
  **/
  @ApiModelProperty(value = "Matching Region (e.g: 13:32968940-32968940)")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public SignalQuery variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Matching HGVSG Variant (e.g: 17:g.37880220T&gt;C)
   * @return variant
  **/
  @ApiModelProperty(value = "Matching HGVSG Variant (e.g: 17:g.37880220T>C)")
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
    SignalQuery signalQuery = (SignalQuery) o;
    return Objects.equals(this.alteration, signalQuery.alteration) &&
        Objects.equals(this.description, signalQuery.description) &&
        Objects.equals(this.hugoSymbol, signalQuery.hugoSymbol) &&
        Objects.equals(this.matchType, signalQuery.matchType) &&
        Objects.equals(this.queryType, signalQuery.queryType) &&
        Objects.equals(this.region, signalQuery.region) &&
        Objects.equals(this.variant, signalQuery.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alteration, description, hugoSymbol, matchType, queryType, region, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalQuery {\n");
    
    sb.append("    alteration: ").append(toIndentedString(alteration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

