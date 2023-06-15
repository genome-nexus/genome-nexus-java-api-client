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
import org.genome_nexus.client.ArticleAbstract;
import org.genome_nexus.client.Drug;
import org.genome_nexus.client.TumorType;

/**
 * IndicatorQueryTreatment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:43:11.221-05:00")
public class IndicatorQueryTreatment {
  @SerializedName("abstracts")
  private List<ArticleAbstract> abstracts = null;

  @SerializedName("alterations")
  private List<String> alterations = null;

  @SerializedName("approvedIndications")
  private List<String> approvedIndications = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("drugs")
  private List<Drug> drugs = null;

  @SerializedName("fdaApproved")
  private Boolean fdaApproved = null;

  /**
   * Gets or Sets level
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    LEVEL_0("LEVEL_0"),
    
    LEVEL_1("LEVEL_1"),
    
    LEVEL_2("LEVEL_2"),
    
    LEVEL_2A("LEVEL_2A"),
    
    LEVEL_2B("LEVEL_2B"),
    
    LEVEL_3A("LEVEL_3A"),
    
    LEVEL_3B("LEVEL_3B"),
    
    LEVEL_4("LEVEL_4"),
    
    LEVEL_R1("LEVEL_R1"),
    
    LEVEL_R2("LEVEL_R2"),
    
    LEVEL_R3("LEVEL_R3"),
    
    LEVEL_PX1("LEVEL_Px1"),
    
    LEVEL_PX2("LEVEL_Px2"),
    
    LEVEL_PX3("LEVEL_Px3"),
    
    LEVEL_DX1("LEVEL_Dx1"),
    
    LEVEL_DX2("LEVEL_Dx2"),
    
    LEVEL_DX3("LEVEL_Dx3"),
    
    NO("NO");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LevelEnum fromValue(String text) {
      for (LevelEnum b : LevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("level")
  private LevelEnum level = null;

  @SerializedName("levelAssociatedCancerType")
  private TumorType levelAssociatedCancerType = null;

  @SerializedName("pmids")
  private List<String> pmids = null;

  public IndicatorQueryTreatment abstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
    return this;
  }

  public IndicatorQueryTreatment addAbstractsItem(ArticleAbstract abstractsItem) {
    if (this.abstracts == null) {
      this.abstracts = new ArrayList<ArticleAbstract>();
    }
    this.abstracts.add(abstractsItem);
    return this;
  }

   /**
   * Get abstracts
   * @return abstracts
  **/
  @ApiModelProperty(value = "")
  public List<ArticleAbstract> getAbstracts() {
    return abstracts;
  }

  public void setAbstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
  }

  public IndicatorQueryTreatment alterations(List<String> alterations) {
    this.alterations = alterations;
    return this;
  }

  public IndicatorQueryTreatment addAlterationsItem(String alterationsItem) {
    if (this.alterations == null) {
      this.alterations = new ArrayList<String>();
    }
    this.alterations.add(alterationsItem);
    return this;
  }

   /**
   * Get alterations
   * @return alterations
  **/
  @ApiModelProperty(value = "")
  public List<String> getAlterations() {
    return alterations;
  }

  public void setAlterations(List<String> alterations) {
    this.alterations = alterations;
  }

  public IndicatorQueryTreatment approvedIndications(List<String> approvedIndications) {
    this.approvedIndications = approvedIndications;
    return this;
  }

  public IndicatorQueryTreatment addApprovedIndicationsItem(String approvedIndicationsItem) {
    if (this.approvedIndications == null) {
      this.approvedIndications = new ArrayList<String>();
    }
    this.approvedIndications.add(approvedIndicationsItem);
    return this;
  }

   /**
   * Get approvedIndications
   * @return approvedIndications
  **/
  @ApiModelProperty(value = "")
  public List<String> getApprovedIndications() {
    return approvedIndications;
  }

  public void setApprovedIndications(List<String> approvedIndications) {
    this.approvedIndications = approvedIndications;
  }

  public IndicatorQueryTreatment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IndicatorQueryTreatment drugs(List<Drug> drugs) {
    this.drugs = drugs;
    return this;
  }

  public IndicatorQueryTreatment addDrugsItem(Drug drugsItem) {
    if (this.drugs == null) {
      this.drugs = new ArrayList<Drug>();
    }
    this.drugs.add(drugsItem);
    return this;
  }

   /**
   * Get drugs
   * @return drugs
  **/
  @ApiModelProperty(value = "")
  public List<Drug> getDrugs() {
    return drugs;
  }

  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }

  public IndicatorQueryTreatment fdaApproved(Boolean fdaApproved) {
    this.fdaApproved = fdaApproved;
    return this;
  }

   /**
   * Get fdaApproved
   * @return fdaApproved
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isFdaApproved() {
    return fdaApproved;
  }

  public void setFdaApproved(Boolean fdaApproved) {
    this.fdaApproved = fdaApproved;
  }

  public IndicatorQueryTreatment level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public IndicatorQueryTreatment levelAssociatedCancerType(TumorType levelAssociatedCancerType) {
    this.levelAssociatedCancerType = levelAssociatedCancerType;
    return this;
  }

   /**
   * Get levelAssociatedCancerType
   * @return levelAssociatedCancerType
  **/
  @ApiModelProperty(value = "")
  public TumorType getLevelAssociatedCancerType() {
    return levelAssociatedCancerType;
  }

  public void setLevelAssociatedCancerType(TumorType levelAssociatedCancerType) {
    this.levelAssociatedCancerType = levelAssociatedCancerType;
  }

  public IndicatorQueryTreatment pmids(List<String> pmids) {
    this.pmids = pmids;
    return this;
  }

  public IndicatorQueryTreatment addPmidsItem(String pmidsItem) {
    if (this.pmids == null) {
      this.pmids = new ArrayList<String>();
    }
    this.pmids.add(pmidsItem);
    return this;
  }

   /**
   * Get pmids
   * @return pmids
  **/
  @ApiModelProperty(value = "")
  public List<String> getPmids() {
    return pmids;
  }

  public void setPmids(List<String> pmids) {
    this.pmids = pmids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorQueryTreatment indicatorQueryTreatment = (IndicatorQueryTreatment) o;
    return Objects.equals(this.abstracts, indicatorQueryTreatment.abstracts) &&
        Objects.equals(this.alterations, indicatorQueryTreatment.alterations) &&
        Objects.equals(this.approvedIndications, indicatorQueryTreatment.approvedIndications) &&
        Objects.equals(this.description, indicatorQueryTreatment.description) &&
        Objects.equals(this.drugs, indicatorQueryTreatment.drugs) &&
        Objects.equals(this.fdaApproved, indicatorQueryTreatment.fdaApproved) &&
        Objects.equals(this.level, indicatorQueryTreatment.level) &&
        Objects.equals(this.levelAssociatedCancerType, indicatorQueryTreatment.levelAssociatedCancerType) &&
        Objects.equals(this.pmids, indicatorQueryTreatment.pmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, alterations, approvedIndications, description, drugs, fdaApproved, level, levelAssociatedCancerType, pmids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorQueryTreatment {\n");
    
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
    sb.append("    approvedIndications: ").append(toIndentedString(approvedIndications)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    drugs: ").append(toIndentedString(drugs)).append("\n");
    sb.append("    fdaApproved: ").append(toIndentedString(fdaApproved)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    levelAssociatedCancerType: ").append(toIndentedString(levelAssociatedCancerType)).append("\n");
    sb.append("    pmids: ").append(toIndentedString(pmids)).append("\n");
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

