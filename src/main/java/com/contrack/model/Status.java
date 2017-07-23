
package com.contrack.model;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;

import java.util.Objects;

public class Status {

    private final Integer code;
    private final String errorType;

    @JsonCreator
    public Status(@JsonProperty("code") Integer code,
                  @JsonProperty("errorType") String errorType) {
        this.code = code;
        this.errorType = errorType;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("errorType")
    public String getErrorType() {
        return errorType;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Status that = (Status) obj;
        return  Objects.equals(this.code, that.code) &&
                Objects.equals(this.errorType, that.errorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.errorType);

    }

    @Override
    public String toString() {

        return MoreObjects.toStringHelper(this)
                .add("code", this.code)
                .add("errorType", this.errorType)
                .toString();

    }
}
