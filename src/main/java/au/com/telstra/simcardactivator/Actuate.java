package au.com.telstra.simcardactivator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Actuate(String iccid, String customerEmail) { }