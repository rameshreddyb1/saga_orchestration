package com.saga.UserService.projection;

import com.saga.CommonService.model.CardDetails;
import com.saga.CommonService.model.User;
import com.saga.CommonService.queries.GetUserPaymentDetailsQuery;

import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

@Component
public class UserProjection {

    @QueryHandler
    public User getUserPaymentDetails(GetUserPaymentDetailsQuery query) {
        //Ideally Get the details from the DB
        CardDetails cardDetails
                = CardDetails.builder()
                .name("Ramesh Reddy")
                .validUntilYear(2022)
                .validUntilMonth(01)
                .cardNumber("123456789")
                .cvv(111)
                .build();

        return User.builder()
                .userId(query.getUserId())
                .firstName("Ramesh")
                .lastName("Reddy")
                .cardDetails(cardDetails)
                .build();
    }
}
