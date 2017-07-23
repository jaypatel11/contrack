
package com.contrack.model;

import com.fasterxml.jackson.annotation.*;
import com.google.common.base.MoreObjects;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiAiRequest {

    private final String id;
    private final String timestamp;
    private final Result result;
    private final Status status;
    private final String sessionId;
    private final Object originalRequest;

    @JsonCreator
    public ApiAiRequest(@JsonProperty("id") String id,
                        @JsonProperty("timestamp") String timestamp,
                        @JsonProperty("result") Result result,
                        @JsonProperty("status") Status status,
                        @JsonProperty("sessionId") String sessionId,
                        @JsonProperty("originalRequest") Object originalRequest) {
        this.id = id;
        this.timestamp = timestamp;
        this.result = result;
        this.status = status;
        this.sessionId = sessionId;
        this.originalRequest = originalRequest;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("originalRequest")
    public Object getOriginalRequest() {
        return originalRequest;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final ApiAiRequest that = (ApiAiRequest) obj;
        return  Objects.equals(this.id, that.id) &&
                Objects.equals(this.timestamp, that.timestamp) &&
                Objects.equals(this.result, that.result) &&
                Objects.equals(this.status, that.status) &&
                Objects.equals(this.sessionId, that.sessionId) &&
                Objects.equals(this.originalRequest, that.originalRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.timestamp,
                this.result,
                this.status,
                this.sessionId,
                this.originalRequest);

    }

    @Override
    public String toString() {

        return MoreObjects.toStringHelper(this)
                .add("id", this.id)
                .add("timestamp", this.timestamp)
                .add("result", this.result)
                .add("status", this.status)
                .add("sessionId", this.sessionId)
                .add("originalRequest", this.originalRequest)
                .toString();

    }
}
