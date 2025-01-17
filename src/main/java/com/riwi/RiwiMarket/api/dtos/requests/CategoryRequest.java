package com.riwi.RiwiMarket.api.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryRequest    {
    @NotBlank(message = "The name is required")
    private String name;
    @NotNull(message = "The status is required")
    private boolean status;
}
