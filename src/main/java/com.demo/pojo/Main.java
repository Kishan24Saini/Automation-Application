
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
    "temp",
    "temp_min",
    "temp_max",
    "pressure",
    "sea_level",
    "grnd_level",
    "humidity",
    "temp_kf"
})
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Main {

    @JsonProperty("temp")
    public Float temp;
    @JsonProperty("temp_min")
    public Float tempMin;
    @JsonProperty("temp_max")
    public Float tempMax;
    @JsonProperty("pressure")
    public Float pressure;
    @JsonProperty("sea_level")
    public Float seaLevel;
    @JsonProperty("grnd_level")
    public Float grndLevel;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("temp_kf")
    public Integer tempKf;

}
