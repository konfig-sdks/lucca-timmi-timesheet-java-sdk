/*
 * Timmi Timesheet API
 * Welcome on the documentation for the Timmi Timesheet API. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developers@lucca.fr
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TimesheetOwner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ## Definitions  Timesheets are TimeEntries containers. A timesheet belongs to a single user &#x60;owner&#x60; and ranges over several days &#x60;[startsOn - endsOn[&#x60; (endsOn excluded). Its range depends on the submission frequency set up in Timmi Timesheet (weekly / monthly).  A timesheet purpose is to ease the approval workflow: rather than approving each TimeEntry individually, they are approved in a weekly / monthly batch.  The approval workflow looks like this:  ![Timmi Timesheet - Approval workflow](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/xfjxCP2RUa4)  Thus, a timesheet: - is created upon submission ; - is \&quot;pending approval\&quot; (&#x60;status: 1&#x60;) as long as all approvers have not approved it ; - is \&quot;approved\&quot; (&#x60;status: 2&#x60;) once all approvers have approved it ; - may become \&quot;rejected\&quot; (&#x60;status: 3&#x60;) whenever:   - the submitter cancels the submission, which is possible as long as the timesheet is not fully approved ;   - one of the approvers denies the timesheet ;   - an administrator invalidates the timesheet, which is only possible once the timesheet is fully approved.  Once a timesheet is rejected, a new one has to be submitted and the workflow starts again.  ## Fields
 */
@ApiModel(description = "## Definitions  Timesheets are TimeEntries containers. A timesheet belongs to a single user `owner` and ranges over several days `[startsOn - endsOn[` (endsOn excluded). Its range depends on the submission frequency set up in Timmi Timesheet (weekly / monthly).  A timesheet purpose is to ease the approval workflow: rather than approving each TimeEntry individually, they are approved in a weekly / monthly batch.  The approval workflow looks like this:  ![Timmi Timesheet - Approval workflow](https://stoplight.io/api/v1/projects/cHJqOjEwNjgxNg/images/xfjxCP2RUa4)  Thus, a timesheet: - is created upon submission ; - is \"pending approval\" (`status: 1`) as long as all approvers have not approved it ; - is \"approved\" (`status: 2`) once all approvers have approved it ; - may become \"rejected\" (`status: 3`) whenever:   - the submitter cancels the submission, which is possible as long as the timesheet is not fully approved ;   - one of the approvers denies the timesheet ;   - an administrator invalidates the timesheet, which is only possible once the timesheet is fully approved.  Once a timesheet is rejected, a new one has to be submitted and the workflow starts again.  ## Fields")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Timesheet {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * - 0: the timesheet is yet to be submitted - 1: the timesheet has been submitted and approval is still pending - 2: the timesheet has been submitted and approved. - 3: the timesheet has been rejected (cancelled after submission, denied upon approval or invalidated after having been approved) 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(Integer value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STARTS_ON = "startsOn";
  @SerializedName(SERIALIZED_NAME_STARTS_ON)
  private LocalDate startsOn;

  public static final String SERIALIZED_NAME_ENDS_ON = "endsOn";
  @SerializedName(SERIALIZED_NAME_ENDS_ON)
  private String endsOn;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private Integer ownerId;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private TimesheetOwner owner;

  public static final String SERIALIZED_NAME_STATUTE_ID = "statuteId";
  @SerializedName(SERIALIZED_NAME_STATUTE_ID)
  private Integer statuteId;

  public Timesheet() {
  }

  public Timesheet id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Timesheet status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * - 0: the timesheet is yet to be submitted - 1: the timesheet has been submitted and approval is still pending - 2: the timesheet has been submitted and approved. - 3: the timesheet has been rejected (cancelled after submission, denied upon approval or invalidated after having been approved) 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "- 0: the timesheet is yet to be submitted - 1: the timesheet has been submitted and approval is still pending - 2: the timesheet has been submitted and approved. - 3: the timesheet has been rejected (cancelled after submission, denied upon approval or invalidated after having been approved) ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public Timesheet startsOn(LocalDate startsOn) {
    
    
    
    
    this.startsOn = startsOn;
    return this;
  }

   /**
   * Get startsOn
   * @return startsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStartsOn() {
    return startsOn;
  }


  public void setStartsOn(LocalDate startsOn) {
    
    
    
    this.startsOn = startsOn;
  }


  public Timesheet endsOn(String endsOn) {
    
    
    
    
    this.endsOn = endsOn;
    return this;
  }

   /**
   * Get endsOn
   * @return endsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndsOn() {
    return endsOn;
  }


  public void setEndsOn(String endsOn) {
    
    
    
    this.endsOn = endsOn;
  }


  public Timesheet ownerId(Integer ownerId) {
    if (ownerId != null && ownerId < 1) {
      throw new IllegalArgumentException("Invalid value for ownerId. Must be greater than or equal to 1.");
    }
    
    
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * minimum: 1
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(Integer ownerId) {
    if (ownerId != null && ownerId < 1) {
      throw new IllegalArgumentException("Invalid value for ownerId. Must be greater than or equal to 1.");
    }
    
    
    this.ownerId = ownerId;
  }


  public Timesheet owner(TimesheetOwner owner) {
    
    
    
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimesheetOwner getOwner() {
    return owner;
  }


  public void setOwner(TimesheetOwner owner) {
    
    
    
    this.owner = owner;
  }


  public Timesheet statuteId(Integer statuteId) {
    
    
    
    
    this.statuteId = statuteId;
    return this;
  }

   /**
   * Identifier of the applicable \&quot;statute\&quot; (configuration).
   * @return statuteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the applicable \"statute\" (configuration).")

  public Integer getStatuteId() {
    return statuteId;
  }


  public void setStatuteId(Integer statuteId) {
    
    
    
    this.statuteId = statuteId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Timesheet instance itself
   */
  public Timesheet putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.id, timesheet.id) &&
        Objects.equals(this.status, timesheet.status) &&
        Objects.equals(this.startsOn, timesheet.startsOn) &&
        Objects.equals(this.endsOn, timesheet.endsOn) &&
        Objects.equals(this.ownerId, timesheet.ownerId) &&
        Objects.equals(this.owner, timesheet.owner) &&
        Objects.equals(this.statuteId, timesheet.statuteId)&&
        Objects.equals(this.additionalProperties, timesheet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, startsOn, endsOn, ownerId, owner, statuteId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startsOn: ").append(toIndentedString(startsOn)).append("\n");
    sb.append("    endsOn: ").append(toIndentedString(endsOn)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    statuteId: ").append(toIndentedString(statuteId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("startsOn");
    openapiFields.add("endsOn");
    openapiFields.add("ownerId");
    openapiFields.add("owner");
    openapiFields.add("statuteId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timesheet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Timesheet.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timesheet is not found in the empty JSON string", Timesheet.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("endsOn") != null && !jsonObj.get("endsOn").isJsonNull()) && !jsonObj.get("endsOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endsOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endsOn").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        TimesheetOwner.validateJsonObject(jsonObj.getAsJsonObject("owner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timesheet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timesheet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timesheet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timesheet.class));

       return (TypeAdapter<T>) new TypeAdapter<Timesheet>() {
           @Override
           public void write(JsonWriter out, Timesheet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Timesheet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Timesheet instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Timesheet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timesheet
  * @throws IOException if the JSON string is invalid with respect to Timesheet
  */
  public static Timesheet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timesheet.class);
  }

 /**
  * Convert an instance of Timesheet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

