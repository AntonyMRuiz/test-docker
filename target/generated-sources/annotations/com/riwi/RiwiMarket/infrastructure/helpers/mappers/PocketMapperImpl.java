package com.riwi.RiwiMarket.infrastructure.helpers.mappers;

import com.riwi.RiwiMarket.api.dtos.requests.PocketRequest;
import com.riwi.RiwiMarket.api.dtos.responses.PocketResponse;
import com.riwi.RiwiMarket.domain.entities.Pocket;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T13:08:13-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class PocketMapperImpl implements PocketMapper {

    @Override
    public Pocket toEntity(PocketRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        Pocket.PocketBuilder pocket = Pocket.builder();

        pocket.amount( userRequest.getAmount() );
        pocket.description( userRequest.getDescription() );
        pocket.type( userRequest.getType() );

        return pocket.build();
    }

    @Override
    public PocketResponse toResponse(Pocket userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        PocketResponse.PocketResponseBuilder pocketResponse = PocketResponse.builder();

        pocketResponse.amount( userEntity.getAmount() );
        pocketResponse.description( userEntity.getDescription() );
        pocketResponse.id( userEntity.getId() );
        pocketResponse.type( userEntity.getType() );

        return pocketResponse.build();
    }

    @Override
    public List<PocketResponse> listEntitiesToPocketResp(List<Pocket> pockets) {
        if ( pockets == null ) {
            return null;
        }

        List<PocketResponse> list = new ArrayList<PocketResponse>( pockets.size() );
        for ( Pocket pocket : pockets ) {
            list.add( toResponse( pocket ) );
        }

        return list;
    }
}
