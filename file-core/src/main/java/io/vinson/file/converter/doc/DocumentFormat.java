package io.vinson.file.converter.doc;

import io.vinson.file.converter.util.DocumentFamily;

import java.util.HashMap;
import java.util.Map;

public class DocumentFormat {

    private String name;
    private String extension;
    private String mediaType;
    private DocumentFamily inputFamily;
    private Map<String,?> loadProperties;
    private Map<DocumentFamily,Map<String,?>> storePropertiesByFamily;

    public DocumentFormat() {
    }

    public DocumentFormat(String name, String extension, String mediaType) {
        this.name = name;
        this.extension = extension;
        this.mediaType = mediaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public DocumentFamily getInputFamily() {
        return inputFamily;
    }

    public void setInputFamily(DocumentFamily documentFamily) {
        this.inputFamily = documentFamily;
    }

    public Map<String, ?> getLoadProperties() {
        return loadProperties;
    }

    public void setLoadProperties(Map<String, ?> loadProperties) {
        this.loadProperties = loadProperties;
    }

    public Map<DocumentFamily, Map<String, ?>> getStorePropertiesByFamily() {
        return storePropertiesByFamily;
    }

    public void setStorePropertiesByFamily(Map<DocumentFamily, Map<String, ?>> storePropertiesByFamily) {
        this.storePropertiesByFamily = storePropertiesByFamily;
    }

    public void setStoreProperties(DocumentFamily family, Map<String, ?> storeProperties) {
        if (storePropertiesByFamily == null) {
            storePropertiesByFamily = new HashMap<DocumentFamily,Map<String,?>>();
        }
        storePropertiesByFamily.put(family, storeProperties);
    }

    public Map<String,?> getStoreProperties(DocumentFamily family) {
        if (storePropertiesByFamily == null) {
            return null;
        }
        return storePropertiesByFamily.get(family);
    }

}
