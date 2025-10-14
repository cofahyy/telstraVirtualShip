package au.com.telstra.simcardactivator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Sucess(Boolean sucess, Acutate vals) {}