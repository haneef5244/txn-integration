package com.common.txnintegration.resp;

import lombok.Data;

import java.util.Date;

@Data
public class TxnResp {
    String accountNumber;
    String txnAmount;
    String description;
    Date txnDate;
    String txnTime;
    Long customerId;
}
