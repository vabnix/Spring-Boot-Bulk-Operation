package com.bulk.save.demo.data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkResponse {
    private List<Response> responses;

    public List<Response> getResponses() {
        if (responses == null) {
            responses = new ArrayList<>();
        }
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public void add(Response response) {
        getResponses().add(response);
    }
}
