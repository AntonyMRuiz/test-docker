package com.riwi.RiwiMarket.api.dtos.requests;



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
public class SubcategoryRequest {
    @NotBlank(message= "The subcategory name is required")
    @Size(max=50, message = "The subcategory name lenght is 50")
    private String name;
    private Boolean status;
    @NotNull(message = "The category id in subcategory is required")
    private Long categoryId;
}
