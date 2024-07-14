package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import com.riwi.RiwiMarket.api.dtos.requests.SubcategoryRequest;
import com.riwi.RiwiMarket.api.dtos.responses.CategoryResponse;
import com.riwi.RiwiMarket.api.dtos.responses.SubcategoryResponse;
import com.riwi.RiwiMarket.domain.entities.Category;
import com.riwi.RiwiMarket.domain.entities.Subcategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T13:08:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class SubcategoryMapperImpl implements SubcategoryMapper {

    @Override
    public Subcategory toEntity(SubcategoryRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        Subcategory.SubcategoryBuilder subcategory = Subcategory.builder();

        subcategory.name( userRequest.getName() );
        subcategory.status( userRequest.getStatus() );

        return subcategory.build();
    }

    @Override
    public SubcategoryResponse toResponse(Subcategory userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        SubcategoryResponse.SubcategoryResponseBuilder<?, ?> subcategoryResponse = SubcategoryResponse.builder();

        subcategoryResponse.category( categoryToCategoryResponse( userEntity.getCategory() ) );
        subcategoryResponse.id( userEntity.getId() );
        subcategoryResponse.name( userEntity.getName() );
        subcategoryResponse.status( userEntity.getStatus() );

        return subcategoryResponse.build();
    }

    @Override
    public SubcategoryResponse toSubcategoryResponse(Subcategory subcategory) {
        if ( subcategory == null ) {
            return null;
        }

        SubcategoryResponse.SubcategoryResponseBuilder<?, ?> subcategoryResponse = SubcategoryResponse.builder();

        subcategoryResponse.category( categoryToCategoryResponse( subcategory.getCategory() ) );
        subcategoryResponse.id( subcategory.getId() );
        subcategoryResponse.name( subcategory.getName() );
        subcategoryResponse.status( subcategory.getStatus() );

        return subcategoryResponse.build();
    }

    protected CategoryResponse categoryToCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.name( category.getName() );
        if ( category.getStatus() != null ) {
            categoryResponse.status( category.getStatus() );
        }

        return categoryResponse.build();
    }
}
