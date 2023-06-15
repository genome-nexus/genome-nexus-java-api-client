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
import org.genome_nexus.client.Implication;
import org.genome_nexus.client.IndicatorQueryTreatment;
import org.genome_nexus.client.MutationEffectResp;
import org.genome_nexus.client.Query;

/**
 * IndicatorQueryResp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:43:11.221-05:00")
public class IndicatorQueryResp {
  @SerializedName("alleleExist")
  private Boolean alleleExist = null;

  @SerializedName("dataVersion")
  private String dataVersion = null;

  @SerializedName("diagnosticImplications")
  private List<Implication> diagnosticImplications = null;

  @SerializedName("diagnosticSummary")
  private String diagnosticSummary = null;

  @SerializedName("geneExist")
  private Boolean geneExist = null;

  @SerializedName("geneSummary")
  private String geneSummary = null;

  /**
   * Gets or Sets highestDiagnosticImplicationLevel
   */
  @JsonAdapter(HighestDiagnosticImplicationLevelEnum.Adapter.class)
  public enum HighestDiagnosticImplicationLevelEnum {
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

    HighestDiagnosticImplicationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestDiagnosticImplicationLevelEnum fromValue(String text) {
      for (HighestDiagnosticImplicationLevelEnum b : HighestDiagnosticImplicationLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HighestDiagnosticImplicationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestDiagnosticImplicationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestDiagnosticImplicationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HighestDiagnosticImplicationLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("highestDiagnosticImplicationLevel")
  private HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel = null;

  /**
   * Gets or Sets highestPrognosticImplicationLevel
   */
  @JsonAdapter(HighestPrognosticImplicationLevelEnum.Adapter.class)
  public enum HighestPrognosticImplicationLevelEnum {
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

    HighestPrognosticImplicationLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestPrognosticImplicationLevelEnum fromValue(String text) {
      for (HighestPrognosticImplicationLevelEnum b : HighestPrognosticImplicationLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HighestPrognosticImplicationLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestPrognosticImplicationLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestPrognosticImplicationLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HighestPrognosticImplicationLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("highestPrognosticImplicationLevel")
  private HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel = null;

  /**
   * Gets or Sets highestResistanceLevel
   */
  @JsonAdapter(HighestResistanceLevelEnum.Adapter.class)
  public enum HighestResistanceLevelEnum {
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

    HighestResistanceLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestResistanceLevelEnum fromValue(String text) {
      for (HighestResistanceLevelEnum b : HighestResistanceLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HighestResistanceLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestResistanceLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestResistanceLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HighestResistanceLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("highestResistanceLevel")
  private HighestResistanceLevelEnum highestResistanceLevel = null;

  /**
   * Gets or Sets highestSensitiveLevel
   */
  @JsonAdapter(HighestSensitiveLevelEnum.Adapter.class)
  public enum HighestSensitiveLevelEnum {
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

    HighestSensitiveLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HighestSensitiveLevelEnum fromValue(String text) {
      for (HighestSensitiveLevelEnum b : HighestSensitiveLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HighestSensitiveLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HighestSensitiveLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HighestSensitiveLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HighestSensitiveLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("highestSensitiveLevel")
  private HighestSensitiveLevelEnum highestSensitiveLevel = null;

  @SerializedName("hotspot")
  private Boolean hotspot = null;

  @SerializedName("lastUpdate")
  private String lastUpdate = null;

  @SerializedName("mutationEffect")
  private MutationEffectResp mutationEffect = null;

  @SerializedName("oncogenic")
  private String oncogenic = null;

  /**
   * Gets or Sets otherSignificantResistanceLevels
   */
  @JsonAdapter(OtherSignificantResistanceLevelsEnum.Adapter.class)
  public enum OtherSignificantResistanceLevelsEnum {
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

    OtherSignificantResistanceLevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherSignificantResistanceLevelsEnum fromValue(String text) {
      for (OtherSignificantResistanceLevelsEnum b : OtherSignificantResistanceLevelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OtherSignificantResistanceLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherSignificantResistanceLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherSignificantResistanceLevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OtherSignificantResistanceLevelsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("otherSignificantResistanceLevels")
  private List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels = null;

  /**
   * Gets or Sets otherSignificantSensitiveLevels
   */
  @JsonAdapter(OtherSignificantSensitiveLevelsEnum.Adapter.class)
  public enum OtherSignificantSensitiveLevelsEnum {
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

    OtherSignificantSensitiveLevelsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OtherSignificantSensitiveLevelsEnum fromValue(String text) {
      for (OtherSignificantSensitiveLevelsEnum b : OtherSignificantSensitiveLevelsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OtherSignificantSensitiveLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtherSignificantSensitiveLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtherSignificantSensitiveLevelsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OtherSignificantSensitiveLevelsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("otherSignificantSensitiveLevels")
  private List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels = null;

  @SerializedName("prognosticImplications")
  private List<Implication> prognosticImplications = null;

  @SerializedName("prognosticSummary")
  private String prognosticSummary = null;

  @SerializedName("query")
  private Query query = null;

  @SerializedName("treatments")
  private List<IndicatorQueryTreatment> treatments = null;

  @SerializedName("tumorTypeSummary")
  private String tumorTypeSummary = null;

  @SerializedName("variantExist")
  private Boolean variantExist = null;

  @SerializedName("variantSummary")
  private String variantSummary = null;

  @SerializedName("vus")
  private Boolean vus = null;

  public IndicatorQueryResp alleleExist(Boolean alleleExist) {
    this.alleleExist = alleleExist;
    return this;
  }

   /**
   * Get alleleExist
   * @return alleleExist
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isAlleleExist() {
    return alleleExist;
  }

  public void setAlleleExist(Boolean alleleExist) {
    this.alleleExist = alleleExist;
  }

  public IndicatorQueryResp dataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Get dataVersion
   * @return dataVersion
  **/
  @ApiModelProperty(value = "")
  public String getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(String dataVersion) {
    this.dataVersion = dataVersion;
  }

  public IndicatorQueryResp diagnosticImplications(List<Implication> diagnosticImplications) {
    this.diagnosticImplications = diagnosticImplications;
    return this;
  }

  public IndicatorQueryResp addDiagnosticImplicationsItem(Implication diagnosticImplicationsItem) {
    if (this.diagnosticImplications == null) {
      this.diagnosticImplications = new ArrayList<Implication>();
    }
    this.diagnosticImplications.add(diagnosticImplicationsItem);
    return this;
  }

   /**
   * Get diagnosticImplications
   * @return diagnosticImplications
  **/
  @ApiModelProperty(value = "")
  public List<Implication> getDiagnosticImplications() {
    return diagnosticImplications;
  }

  public void setDiagnosticImplications(List<Implication> diagnosticImplications) {
    this.diagnosticImplications = diagnosticImplications;
  }

  public IndicatorQueryResp diagnosticSummary(String diagnosticSummary) {
    this.diagnosticSummary = diagnosticSummary;
    return this;
  }

   /**
   * Get diagnosticSummary
   * @return diagnosticSummary
  **/
  @ApiModelProperty(value = "")
  public String getDiagnosticSummary() {
    return diagnosticSummary;
  }

  public void setDiagnosticSummary(String diagnosticSummary) {
    this.diagnosticSummary = diagnosticSummary;
  }

  public IndicatorQueryResp geneExist(Boolean geneExist) {
    this.geneExist = geneExist;
    return this;
  }

   /**
   * Get geneExist
   * @return geneExist
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isGeneExist() {
    return geneExist;
  }

  public void setGeneExist(Boolean geneExist) {
    this.geneExist = geneExist;
  }

  public IndicatorQueryResp geneSummary(String geneSummary) {
    this.geneSummary = geneSummary;
    return this;
  }

   /**
   * Get geneSummary
   * @return geneSummary
  **/
  @ApiModelProperty(value = "")
  public String getGeneSummary() {
    return geneSummary;
  }

  public void setGeneSummary(String geneSummary) {
    this.geneSummary = geneSummary;
  }

  public IndicatorQueryResp highestDiagnosticImplicationLevel(HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel) {
    this.highestDiagnosticImplicationLevel = highestDiagnosticImplicationLevel;
    return this;
  }

   /**
   * Get highestDiagnosticImplicationLevel
   * @return highestDiagnosticImplicationLevel
  **/
  @ApiModelProperty(value = "")
  public HighestDiagnosticImplicationLevelEnum getHighestDiagnosticImplicationLevel() {
    return highestDiagnosticImplicationLevel;
  }

  public void setHighestDiagnosticImplicationLevel(HighestDiagnosticImplicationLevelEnum highestDiagnosticImplicationLevel) {
    this.highestDiagnosticImplicationLevel = highestDiagnosticImplicationLevel;
  }

  public IndicatorQueryResp highestPrognosticImplicationLevel(HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel) {
    this.highestPrognosticImplicationLevel = highestPrognosticImplicationLevel;
    return this;
  }

   /**
   * Get highestPrognosticImplicationLevel
   * @return highestPrognosticImplicationLevel
  **/
  @ApiModelProperty(value = "")
  public HighestPrognosticImplicationLevelEnum getHighestPrognosticImplicationLevel() {
    return highestPrognosticImplicationLevel;
  }

  public void setHighestPrognosticImplicationLevel(HighestPrognosticImplicationLevelEnum highestPrognosticImplicationLevel) {
    this.highestPrognosticImplicationLevel = highestPrognosticImplicationLevel;
  }

  public IndicatorQueryResp highestResistanceLevel(HighestResistanceLevelEnum highestResistanceLevel) {
    this.highestResistanceLevel = highestResistanceLevel;
    return this;
  }

   /**
   * Get highestResistanceLevel
   * @return highestResistanceLevel
  **/
  @ApiModelProperty(value = "")
  public HighestResistanceLevelEnum getHighestResistanceLevel() {
    return highestResistanceLevel;
  }

  public void setHighestResistanceLevel(HighestResistanceLevelEnum highestResistanceLevel) {
    this.highestResistanceLevel = highestResistanceLevel;
  }

  public IndicatorQueryResp highestSensitiveLevel(HighestSensitiveLevelEnum highestSensitiveLevel) {
    this.highestSensitiveLevel = highestSensitiveLevel;
    return this;
  }

   /**
   * Get highestSensitiveLevel
   * @return highestSensitiveLevel
  **/
  @ApiModelProperty(value = "")
  public HighestSensitiveLevelEnum getHighestSensitiveLevel() {
    return highestSensitiveLevel;
  }

  public void setHighestSensitiveLevel(HighestSensitiveLevelEnum highestSensitiveLevel) {
    this.highestSensitiveLevel = highestSensitiveLevel;
  }

  public IndicatorQueryResp hotspot(Boolean hotspot) {
    this.hotspot = hotspot;
    return this;
  }

   /**
   * Get hotspot
   * @return hotspot
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isHotspot() {
    return hotspot;
  }

  public void setHotspot(Boolean hotspot) {
    this.hotspot = hotspot;
  }

  public IndicatorQueryResp lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public IndicatorQueryResp mutationEffect(MutationEffectResp mutationEffect) {
    this.mutationEffect = mutationEffect;
    return this;
  }

   /**
   * Get mutationEffect
   * @return mutationEffect
  **/
  @ApiModelProperty(value = "")
  public MutationEffectResp getMutationEffect() {
    return mutationEffect;
  }

  public void setMutationEffect(MutationEffectResp mutationEffect) {
    this.mutationEffect = mutationEffect;
  }

  public IndicatorQueryResp oncogenic(String oncogenic) {
    this.oncogenic = oncogenic;
    return this;
  }

   /**
   * Get oncogenic
   * @return oncogenic
  **/
  @ApiModelProperty(value = "")
  public String getOncogenic() {
    return oncogenic;
  }

  public void setOncogenic(String oncogenic) {
    this.oncogenic = oncogenic;
  }

  public IndicatorQueryResp otherSignificantResistanceLevels(List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels) {
    this.otherSignificantResistanceLevels = otherSignificantResistanceLevels;
    return this;
  }

  public IndicatorQueryResp addOtherSignificantResistanceLevelsItem(OtherSignificantResistanceLevelsEnum otherSignificantResistanceLevelsItem) {
    if (this.otherSignificantResistanceLevels == null) {
      this.otherSignificantResistanceLevels = new ArrayList<OtherSignificantResistanceLevelsEnum>();
    }
    this.otherSignificantResistanceLevels.add(otherSignificantResistanceLevelsItem);
    return this;
  }

   /**
   * Get otherSignificantResistanceLevels
   * @return otherSignificantResistanceLevels
  **/
  @ApiModelProperty(value = "")
  public List<OtherSignificantResistanceLevelsEnum> getOtherSignificantResistanceLevels() {
    return otherSignificantResistanceLevels;
  }

  public void setOtherSignificantResistanceLevels(List<OtherSignificantResistanceLevelsEnum> otherSignificantResistanceLevels) {
    this.otherSignificantResistanceLevels = otherSignificantResistanceLevels;
  }

  public IndicatorQueryResp otherSignificantSensitiveLevels(List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels) {
    this.otherSignificantSensitiveLevels = otherSignificantSensitiveLevels;
    return this;
  }

  public IndicatorQueryResp addOtherSignificantSensitiveLevelsItem(OtherSignificantSensitiveLevelsEnum otherSignificantSensitiveLevelsItem) {
    if (this.otherSignificantSensitiveLevels == null) {
      this.otherSignificantSensitiveLevels = new ArrayList<OtherSignificantSensitiveLevelsEnum>();
    }
    this.otherSignificantSensitiveLevels.add(otherSignificantSensitiveLevelsItem);
    return this;
  }

   /**
   * Get otherSignificantSensitiveLevels
   * @return otherSignificantSensitiveLevels
  **/
  @ApiModelProperty(value = "")
  public List<OtherSignificantSensitiveLevelsEnum> getOtherSignificantSensitiveLevels() {
    return otherSignificantSensitiveLevels;
  }

  public void setOtherSignificantSensitiveLevels(List<OtherSignificantSensitiveLevelsEnum> otherSignificantSensitiveLevels) {
    this.otherSignificantSensitiveLevels = otherSignificantSensitiveLevels;
  }

  public IndicatorQueryResp prognosticImplications(List<Implication> prognosticImplications) {
    this.prognosticImplications = prognosticImplications;
    return this;
  }

  public IndicatorQueryResp addPrognosticImplicationsItem(Implication prognosticImplicationsItem) {
    if (this.prognosticImplications == null) {
      this.prognosticImplications = new ArrayList<Implication>();
    }
    this.prognosticImplications.add(prognosticImplicationsItem);
    return this;
  }

   /**
   * Get prognosticImplications
   * @return prognosticImplications
  **/
  @ApiModelProperty(value = "")
  public List<Implication> getPrognosticImplications() {
    return prognosticImplications;
  }

  public void setPrognosticImplications(List<Implication> prognosticImplications) {
    this.prognosticImplications = prognosticImplications;
  }

  public IndicatorQueryResp prognosticSummary(String prognosticSummary) {
    this.prognosticSummary = prognosticSummary;
    return this;
  }

   /**
   * Get prognosticSummary
   * @return prognosticSummary
  **/
  @ApiModelProperty(value = "")
  public String getPrognosticSummary() {
    return prognosticSummary;
  }

  public void setPrognosticSummary(String prognosticSummary) {
    this.prognosticSummary = prognosticSummary;
  }

  public IndicatorQueryResp query(Query query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public Query getQuery() {
    return query;
  }

  public void setQuery(Query query) {
    this.query = query;
  }

  public IndicatorQueryResp treatments(List<IndicatorQueryTreatment> treatments) {
    this.treatments = treatments;
    return this;
  }

  public IndicatorQueryResp addTreatmentsItem(IndicatorQueryTreatment treatmentsItem) {
    if (this.treatments == null) {
      this.treatments = new ArrayList<IndicatorQueryTreatment>();
    }
    this.treatments.add(treatmentsItem);
    return this;
  }

   /**
   * Get treatments
   * @return treatments
  **/
  @ApiModelProperty(value = "")
  public List<IndicatorQueryTreatment> getTreatments() {
    return treatments;
  }

  public void setTreatments(List<IndicatorQueryTreatment> treatments) {
    this.treatments = treatments;
  }

  public IndicatorQueryResp tumorTypeSummary(String tumorTypeSummary) {
    this.tumorTypeSummary = tumorTypeSummary;
    return this;
  }

   /**
   * Get tumorTypeSummary
   * @return tumorTypeSummary
  **/
  @ApiModelProperty(value = "")
  public String getTumorTypeSummary() {
    return tumorTypeSummary;
  }

  public void setTumorTypeSummary(String tumorTypeSummary) {
    this.tumorTypeSummary = tumorTypeSummary;
  }

  public IndicatorQueryResp variantExist(Boolean variantExist) {
    this.variantExist = variantExist;
    return this;
  }

   /**
   * Get variantExist
   * @return variantExist
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isVariantExist() {
    return variantExist;
  }

  public void setVariantExist(Boolean variantExist) {
    this.variantExist = variantExist;
  }

  public IndicatorQueryResp variantSummary(String variantSummary) {
    this.variantSummary = variantSummary;
    return this;
  }

   /**
   * Get variantSummary
   * @return variantSummary
  **/
  @ApiModelProperty(value = "")
  public String getVariantSummary() {
    return variantSummary;
  }

  public void setVariantSummary(String variantSummary) {
    this.variantSummary = variantSummary;
  }

  public IndicatorQueryResp vus(Boolean vus) {
    this.vus = vus;
    return this;
  }

   /**
   * Get vus
   * @return vus
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isVus() {
    return vus;
  }

  public void setVus(Boolean vus) {
    this.vus = vus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicatorQueryResp indicatorQueryResp = (IndicatorQueryResp) o;
    return Objects.equals(this.alleleExist, indicatorQueryResp.alleleExist) &&
        Objects.equals(this.dataVersion, indicatorQueryResp.dataVersion) &&
        Objects.equals(this.diagnosticImplications, indicatorQueryResp.diagnosticImplications) &&
        Objects.equals(this.diagnosticSummary, indicatorQueryResp.diagnosticSummary) &&
        Objects.equals(this.geneExist, indicatorQueryResp.geneExist) &&
        Objects.equals(this.geneSummary, indicatorQueryResp.geneSummary) &&
        Objects.equals(this.highestDiagnosticImplicationLevel, indicatorQueryResp.highestDiagnosticImplicationLevel) &&
        Objects.equals(this.highestPrognosticImplicationLevel, indicatorQueryResp.highestPrognosticImplicationLevel) &&
        Objects.equals(this.highestResistanceLevel, indicatorQueryResp.highestResistanceLevel) &&
        Objects.equals(this.highestSensitiveLevel, indicatorQueryResp.highestSensitiveLevel) &&
        Objects.equals(this.hotspot, indicatorQueryResp.hotspot) &&
        Objects.equals(this.lastUpdate, indicatorQueryResp.lastUpdate) &&
        Objects.equals(this.mutationEffect, indicatorQueryResp.mutationEffect) &&
        Objects.equals(this.oncogenic, indicatorQueryResp.oncogenic) &&
        Objects.equals(this.otherSignificantResistanceLevels, indicatorQueryResp.otherSignificantResistanceLevels) &&
        Objects.equals(this.otherSignificantSensitiveLevels, indicatorQueryResp.otherSignificantSensitiveLevels) &&
        Objects.equals(this.prognosticImplications, indicatorQueryResp.prognosticImplications) &&
        Objects.equals(this.prognosticSummary, indicatorQueryResp.prognosticSummary) &&
        Objects.equals(this.query, indicatorQueryResp.query) &&
        Objects.equals(this.treatments, indicatorQueryResp.treatments) &&
        Objects.equals(this.tumorTypeSummary, indicatorQueryResp.tumorTypeSummary) &&
        Objects.equals(this.variantExist, indicatorQueryResp.variantExist) &&
        Objects.equals(this.variantSummary, indicatorQueryResp.variantSummary) &&
        Objects.equals(this.vus, indicatorQueryResp.vus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alleleExist, dataVersion, diagnosticImplications, diagnosticSummary, geneExist, geneSummary, highestDiagnosticImplicationLevel, highestPrognosticImplicationLevel, highestResistanceLevel, highestSensitiveLevel, hotspot, lastUpdate, mutationEffect, oncogenic, otherSignificantResistanceLevels, otherSignificantSensitiveLevels, prognosticImplications, prognosticSummary, query, treatments, tumorTypeSummary, variantExist, variantSummary, vus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicatorQueryResp {\n");
    
    sb.append("    alleleExist: ").append(toIndentedString(alleleExist)).append("\n");
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
    sb.append("    diagnosticImplications: ").append(toIndentedString(diagnosticImplications)).append("\n");
    sb.append("    diagnosticSummary: ").append(toIndentedString(diagnosticSummary)).append("\n");
    sb.append("    geneExist: ").append(toIndentedString(geneExist)).append("\n");
    sb.append("    geneSummary: ").append(toIndentedString(geneSummary)).append("\n");
    sb.append("    highestDiagnosticImplicationLevel: ").append(toIndentedString(highestDiagnosticImplicationLevel)).append("\n");
    sb.append("    highestPrognosticImplicationLevel: ").append(toIndentedString(highestPrognosticImplicationLevel)).append("\n");
    sb.append("    highestResistanceLevel: ").append(toIndentedString(highestResistanceLevel)).append("\n");
    sb.append("    highestSensitiveLevel: ").append(toIndentedString(highestSensitiveLevel)).append("\n");
    sb.append("    hotspot: ").append(toIndentedString(hotspot)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    mutationEffect: ").append(toIndentedString(mutationEffect)).append("\n");
    sb.append("    oncogenic: ").append(toIndentedString(oncogenic)).append("\n");
    sb.append("    otherSignificantResistanceLevels: ").append(toIndentedString(otherSignificantResistanceLevels)).append("\n");
    sb.append("    otherSignificantSensitiveLevels: ").append(toIndentedString(otherSignificantSensitiveLevels)).append("\n");
    sb.append("    prognosticImplications: ").append(toIndentedString(prognosticImplications)).append("\n");
    sb.append("    prognosticSummary: ").append(toIndentedString(prognosticSummary)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    treatments: ").append(toIndentedString(treatments)).append("\n");
    sb.append("    tumorTypeSummary: ").append(toIndentedString(tumorTypeSummary)).append("\n");
    sb.append("    variantExist: ").append(toIndentedString(variantExist)).append("\n");
    sb.append("    variantSummary: ").append(toIndentedString(variantSummary)).append("\n");
    sb.append("    vus: ").append(toIndentedString(vus)).append("\n");
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

