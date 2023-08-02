
package com.demo.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dt",
    "main",
    "weather",
    "clouds",
    "wind",
    "sys",
    "dt_txt",
    "rain"
})
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class List {

    @JsonProperty("dt")
    public Integer dt;
    @JsonProperty("main")
    public Main main;
    @JsonProperty("weather")
    public java.util.List<Weather> weather;
    @JsonProperty("clouds")
    public Clouds clouds;
    @JsonProperty("wind")
    public Wind wind;
    @JsonProperty("sys")
    public Sys sys;
    @JsonProperty("dt_txt")
    public String dtTxt;
    @JsonProperty("rain")
    public Rain rain;

}
