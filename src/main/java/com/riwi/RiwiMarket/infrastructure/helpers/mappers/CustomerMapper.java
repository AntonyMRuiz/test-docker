package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.riwi.RiwiMarket.api.dtos.requests.CustomerRequest;
import com.riwi.RiwiMarket.api.dtos.responses.CustomerResponse;
import com.riwi.RiwiMarket.domain.entities.Customer;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper extends GenericMapper<CustomerRequest, CustomerResponse, Customer> {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "sales", ignore = true)
    Customer toEntity(CustomerRequest customerResponse);

}
