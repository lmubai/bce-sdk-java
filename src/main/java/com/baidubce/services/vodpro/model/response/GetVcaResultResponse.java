package com.baidubce.services.vodpro.model.response;

import com.baidubce.model.AbstractBceResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created on 17/8/24
 *
 * @author liumin08
 */
public class GetVcaResultResponse extends AbstractBceResponse {
    private String source;

    private List<Item> results;
    private String status;

    private String preset;

    private Error error;

    private String createTime;

    private String publishTime;

    private Integer durationInSecond;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Item {
        private String type;

        private List<Result> result;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<Result> getResult() {
            return result;
        }

        public void setResult(List<Result> result) {
            this.result = result;
        }

        @Override
        public String toString() {
            return "Item{"
                    + "type='" + type + '\''
                    + ", result=" + result
                    + '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        private String attribute;
        private Double confidence;
        private String source;

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public Double getConfidence() {
            return confidence;
        }

        public void setConfidence(Double confidence) {
            this.confidence = confidence;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        @Override
        public String toString() {
            return "Result{"
                    + "attribute='" + attribute + '\''
                    + ", confidence=" + confidence
                    + ", source='" + source + '\''
                    + '}';
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Error {
        private String code;

        private String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Error{"
                    + "code='" + code + '\''
                    + ", message='" + message + '\''
                    + '}';
        }
    }

    @Override
    public String toString() {
        return "GetVcaResultResponse{"
                + "source='" + source + '\''
                + ", results=" + results
                + ", status='" + status + '\''
                + ", preset='" + preset + '\''
                + ", error=" + error
                + ", createTime='" + createTime + '\''
                + ", publishTime='" + publishTime + '\''
                + ", durationInSecond=" + durationInSecond
                + '}';
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Item> getResults() {
        return results;
    }

    public void setResults(List<Item> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getDurationInSecond() {
        return durationInSecond;
    }

    public void setDurationInSecond(Integer durationInSecond) {
        this.durationInSecond = durationInSecond;
    }
}
