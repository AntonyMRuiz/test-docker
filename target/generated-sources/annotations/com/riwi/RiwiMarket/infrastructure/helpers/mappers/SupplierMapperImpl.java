package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import com.riwi.RiwiMarket.api.dtos.requests.SupplierRequest;
import com.riwi.RiwiMarket.api.dtos.responses.SupplierResponse;
import com.riwi.RiwiMarket.domain.entities.Supplier;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T13:08:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class SupplierMapperImpl implements SupplierMapper {

    @Override
    public Supplier toEntity(SupplierRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        Supplier.SupplierBuilder supplier = Supplier.builder();

        supplier.address( userRequest.getAddress() );
        supplier.contact( userRequest.getContact() );
        supplier.name( userRequest.getName() );
        supplier.schedule( userRequest.getSchedule() );

        return supplier.build();
    }

    @Override
    public SupplierResponse toResponse(Supplier userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        SupplierResponse.SupplierResponseBuilder supplierResponse = SupplierResponse.builder();

        supplierResponse.address( userEntity.getAddress() );
        supplierResponse.contact( userEntity.getContact() );
        if ( userEntity.getId() != null ) {
            supplierResponse.id( userEntity.getId().intValue() );
        }
        supplierResponse.name( userEntity.getName() );
        supplierResponse.schedule( userEntity.getSchedule() );
        supplierResponse.status( userEntity.getStatus() );

        return supplierResponse.build();
    }
}
