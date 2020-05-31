package com.common.txnintegration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TxnModel {
    String accountNumber;
    String txnAmount;
    String description;
    String txnDate;
    String txnTime;
    String customerId;
}
