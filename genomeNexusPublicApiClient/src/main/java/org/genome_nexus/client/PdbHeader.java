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
 * PdbHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T11:53:02.948968527-05:00[America/New_York]")
public class PdbHeader {
  public static final String SERIALIZED_NAME_COMPOUND = "compound";
  @SerializedName(SERIALIZED_NAME_COMPOUND)
  private Object compound;

  public static final String SERIALIZED_NAME_PDB_ID = "pdbId";
  @SerializedName(SERIALIZED_NAME_PDB_ID)
  private String pdbId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Object source;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public PdbHeader() {
  }

  public PdbHeader compound(Object compound) {
    this.compound = compound;
    return this;
  }

   /**
   * Get compound
   * @return compound
  **/
  @javax.annotation.Nullable
  public Object getCompound() {
    return compound;
  }

  public void setCompound(Object compound) {
    this.compound = compound;
  }


  public PdbHeader pdbId(String pdbId) {
    this.pdbId = pdbId;
    return this;
  }

   /**
   * PDB id
   * @return pdbId
  **/
  @javax.annotation.Nonnull
  public String getPdbId() {
    return pdbId;
  }

  public void setPdbId(String pdbId) {
    this.pdbId = pdbId;
  }


  public PdbHeader source(Object source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public Object getSource() {
    return source;
  }

  public void setSource(Object source) {
    this.source = source;
  }


  public PdbHeader title(String title) {
    this.title = title;
    return this;
  }

   /**
   * PDB description
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdbHeader pdbHeader = (PdbHeader) o;
    return Objects.equals(this.compound, pdbHeader.compound) &&
        Objects.equals(this.pdbId, pdbHeader.pdbId) &&
        Objects.equals(this.source, pdbHeader.source) &&
        Objects.equals(this.title, pdbHeader.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compound, pdbId, source, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdbHeader {\n");
    sb.append("    compound: ").append(toIndentedString(compound)).append("\n");
    sb.append("    pdbId: ").append(toIndentedString(pdbId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("compound");
    openapiFields.add("pdbId");
    openapiFields.add("source");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pdbId");
    openapiRequiredFields.add("title");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PdbHeader
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PdbHeader.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PdbHeader is not found in the empty JSON string", PdbHeader.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PdbHeader.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PdbHeader` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PdbHeader.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pdbId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pdbId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pdbId").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PdbHeader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PdbHeader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PdbHeader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PdbHeader.class));

       return (TypeAdapter<T>) new TypeAdapter<PdbHeader>() {
           @Override
           public void write(JsonWriter out, PdbHeader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PdbHeader read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PdbHeader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PdbHeader
  * @throws IOException if the JSON string is invalid with respect to PdbHeader
  */
  public static PdbHeader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PdbHeader.class);
  }

 /**
  * Convert an instance of PdbHeader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

