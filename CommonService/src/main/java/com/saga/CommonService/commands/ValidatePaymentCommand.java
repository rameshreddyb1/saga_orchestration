package com.saga.CommonService.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import com.saga.CommonService.model.CardDetails;

@Data
@Builder
public class ValidatePaymentCommand {

    @TargetAggregateIdentifier
    private String paymentId;
    private String orderId;
    private CardDetails cardDetails;
}
