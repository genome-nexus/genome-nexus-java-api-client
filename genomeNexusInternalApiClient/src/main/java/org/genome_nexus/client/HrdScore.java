/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.genome_nexus.JSON;

/**
 * HrdScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:07.493659809-05:00[America/New_York]")
public class HrdScore {
  public static final String SERIALIZED_NAME_FRACTION_LOH = "fractionLoh";
  @SerializedName(SERIALIZED_NAME_FRACTION_LOH)
  private Double fractionLoh;

  public static final String SERIALIZED_NAME_LST = "lst";
  @SerializedName(SERIALIZED_NAME_LST)
  private Double lst;

  public static final String SERIALIZED_NAME_NTELOMERIC_AI = "ntelomericAi";
  @SerializedName(SERIALIZED_NAME_NTELOMERIC_AI)
  private Double ntelomericAi;

  public HrdScore() {
  }

  public HrdScore fractionLoh(Double fractionLoh) {
    this.fractionLoh = fractionLoh;
    return this;
  }

   /**
   * Median HRD Fraction LOH
   * @return fractionLoh
  **/
  @javax.annotation.Nullable
  public Double getFractionLoh() {
    return fractionLoh;
  }

  public void setFractionLoh(Double fractionLoh) {
    this.fractionLoh = fractionLoh;
  }


  public HrdScore lst(Double lst) {
    this.lst = lst;
    return this;
  }

   /**
   * Median HRD LST
   * @return lst
  **/
  @javax.annotation.Nullable
  public Double getLst() {
    return lst;
  }

  public void setLst(Double lst) {
    this.lst = lst;
  }


  public HrdScore ntelomericAi(Double ntelomericAi) {
    this.ntelomericAi = ntelomericAi;
    return this;
  }

   /**
   * Median HRD ntelomeric AI
   * @return ntelomericAi
  **/
  @javax.annotation.Nullable
  public Double getNtelomericAi() {
    return ntelomericAi;
  }

  public void setNtelomericAi(Double ntelomericAi) {
    this.ntelomericAi = ntelomericAi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HrdScore hrdScore = (HrdScore) o;
    return Objects.equals(this.fractionLoh, hrdScore.fractionLoh) &&
        Objects.equals(this.lst, hrdScore.lst) &&
        Objects.equals(this.ntelomericAi, hrdScore.ntelomericAi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fractionLoh, lst, ntelomericAi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HrdScore {\n");
    sb.append("    fractionLoh: ").append(toIndentedString(fractionLoh)).append("\n");
    sb.append("    lst: ").append(toIndentedString(lst)).append("\n");
    sb.append("    ntelomericAi: ").append(toIndentedString(ntelomericAi)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("fractionLoh");
    openapiFields.add("lst");
    openapiFields.add("ntelomericAi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HrdScore
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HrdScore.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HrdScore is not found in the empty JSON string", HrdScore.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HrdScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HrdScore` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HrdScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HrdScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HrdScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HrdScore.class));

       return (TypeAdapter<T>) new TypeAdapter<HrdScore>() {
           @Override
           public void write(JsonWriter out, HrdScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HrdScore read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HrdScore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HrdScore
  * @throws IOException if the JSON string is invalid with respect to HrdScore
  */
  public static HrdScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HrdScore.class);
  }

 /**
  * Convert an instance of HrdScore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

