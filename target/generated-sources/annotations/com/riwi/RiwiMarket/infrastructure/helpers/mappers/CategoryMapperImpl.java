package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import com.riwi.RiwiMarket.api.dtos.requests.CategoryRequest;
import com.riwi.RiwiMarket.api.dtos.responses.CategoryResponse;
import com.riwi.RiwiMarket.domain.entities.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T13:08:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toEntity(CategoryRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.name( userRequest.getName() );
        category.status( userRequest.isStatus() );

        return category.build();
    }

    @Override
    public CategoryResponse toResponse(Category userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.name( userEntity.getName() );
        if ( userEntity.getStatus() != null ) {
            categoryResponse.status( userEntity.getStatus() );
        }

        return categoryResponse.build();
    }
}
