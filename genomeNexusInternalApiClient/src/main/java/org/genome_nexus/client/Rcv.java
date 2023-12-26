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
 * Rcv
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:07.493659809-05:00[America/New_York]")
public class Rcv {
  public static final String SERIALIZED_NAME_ACCESSION = "accession";
  @SerializedName(SERIALIZED_NAME_ACCESSION)
  private String accession;

  public static final String SERIALIZED_NAME_CLINICAL_SIGNIFICANCE = "clinicalSignificance";
  @SerializedName(SERIALIZED_NAME_CLINICAL_SIGNIFICANCE)
  private String clinicalSignificance;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferredName";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  private String preferredName;

  public Rcv() {
  }

  public Rcv accession(String accession) {
    this.accession = accession;
    return this;
  }

   /**
   * accession
   * @return accession
  **/
  @javax.annotation.Nullable
  public String getAccession() {
    return accession;
  }

  public void setAccession(String accession) {
    this.accession = accession;
  }


  public Rcv clinicalSignificance(String clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
    return this;
  }

   /**
   * clinical_significance
   * @return clinicalSignificance
  **/
  @javax.annotation.Nullable
  public String getClinicalSignificance() {
    return clinicalSignificance;
  }

  public void setClinicalSignificance(String clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
  }


  public Rcv origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * origin
   * @return origin
  **/
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public Rcv preferredName(String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

   /**
   * preferred_name
   * @return preferredName
  **/
  @javax.annotation.Nullable
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rcv rcv = (Rcv) o;
    return Objects.equals(this.accession, rcv.accession) &&
        Objects.equals(this.clinicalSignificance, rcv.clinicalSignificance) &&
        Objects.equals(this.origin, rcv.origin) &&
        Objects.equals(this.preferredName, rcv.preferredName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accession, clinicalSignificance, origin, preferredName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rcv {\n");
    sb.append("    accession: ").append(toIndentedString(accession)).append("\n");
    sb.append("    clinicalSignificance: ").append(toIndentedString(clinicalSignificance)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
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
    openapiFields.add("accession");
    openapiFields.add("clinicalSignificance");
    openapiFields.add("origin");
    openapiFields.add("preferredName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Rcv
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rcv.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rcv is not found in the empty JSON string", Rcv.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Rcv.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rcv` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accession") != null && !jsonObj.get("accession").isJsonNull()) && !jsonObj.get("accession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accession").toString()));
      }
      if ((jsonObj.get("clinicalSignificance") != null && !jsonObj.get("clinicalSignificance").isJsonNull()) && !jsonObj.get("clinicalSignificance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clinicalSignificance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clinicalSignificance").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("preferredName") != null && !jsonObj.get("preferredName").isJsonNull()) && !jsonObj.get("preferredName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preferredName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preferredName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Rcv.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rcv' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rcv> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rcv.class));

       return (TypeAdapter<T>) new TypeAdapter<Rcv>() {
           @Override
           public void write(JsonWriter out, Rcv value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rcv read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Rcv given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Rcv
  * @throws IOException if the JSON string is invalid with respect to Rcv
  */
  public static Rcv fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rcv.class);
  }

 /**
  * Convert an instance of Rcv to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

