package com.common.txnintegration.req;

import lombok.Data;

import java.util.Date;

@Data
public class TxnReq {
    String accountNumber;
    String txnAmount;
    String description;
    String txnDate;
    String txnTime;
    Long customerId;
}
