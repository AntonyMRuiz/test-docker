package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import com.riwi.RiwiMarket.api.dtos.requests.CustomerRequest;
import com.riwi.RiwiMarket.api.dtos.responses.CustomerResponse;
import com.riwi.RiwiMarket.domain.entities.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T13:08:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerResponse toResponse(Customer userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        CustomerResponse.CustomerResponseBuilder customerResponse = CustomerResponse.builder();

        customerResponse.address( userEntity.getAddress() );
        customerResponse.document( userEntity.getDocument() );
        customerResponse.email( userEntity.getEmail() );
        customerResponse.id( userEntity.getId() );
        customerResponse.name( userEntity.getName() );
        customerResponse.phone( userEntity.getPhone() );

        return customerResponse.build();
    }

    @Override
    public Customer toEntity(CustomerRequest customerResponse) {
        if ( customerResponse == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.address( customerResponse.getAddress() );
        customer.document( customerResponse.getDocument() );
        customer.email( customerResponse.getEmail() );
        customer.name( customerResponse.getName() );
        customer.phone( customerResponse.getPhone() );

        return customer.build();
    }
}
