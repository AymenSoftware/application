package com.schb.application.document;

import com.schb.application.helper.Indices;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Document(indexName = Indices.configdescriptors_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class ConfigDescriptors {
    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String draft_name;

    @Field(type = FieldType.Text)
    private String maintainer;

    @Field(type = FieldType.Text)
    private String description;

    @Field(type = FieldType.Text)
    private String scope;

    @Field(type = FieldType.Text)
    private String version;

    @Field(type = FieldType.Text)
    private String service;

    @Field(type = FieldType.Text)
    private String system;

    @Field(type = FieldType.Text)
    private String key;

    @Field(type = FieldType.Text)
    private String doc;

    @Field(type = FieldType.Text)
    private String values;

    @Field(type = FieldType.Text)
    private String defaultValue;

    @Field(type = FieldType.Text)
    private String nature;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDraft_name() {
        return draft_name;
    }

    public void setDraft_name(String draft_name) {
        this.draft_name = draft_name;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
