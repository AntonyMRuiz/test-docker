package com.riwi.RiwiMarket.api.dtos.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Request DTO for Brand entity")
public class BrandRequest
{

    @NotBlank
    @Size(max = 50)
    @Schema(description = "Brand Name", example = "Nike")
    private String name;

    @NotNull
    @Schema(description = "Brand Status", example = "True || False")
    private Boolean status;

}
