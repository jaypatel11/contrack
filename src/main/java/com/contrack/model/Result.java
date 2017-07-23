
package com.contrack.model;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;

import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    private final Map<String, String> parameters;

    @JsonCreator
    public Result(@JsonProperty("parameters") Map<String, String> parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("parameters")
    public Map<String, String> getParameters() {
        return parameters;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Result that = (Result) obj;
        return Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.parameters);

    }

    @Override
    public String toString() {

        return MoreObjects.toStringHelper(this)
                .add("parameters", this.parameters)
                .toString();

    }
}
