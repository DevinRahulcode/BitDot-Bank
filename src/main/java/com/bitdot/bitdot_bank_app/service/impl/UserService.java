package com.bitdot.bitdot_bank_app.service.impl;

import com.bitdot.bitdot_bank_app.dto.BankResponse;
import com.bitdot.bitdot_bank_app.dto.EnquiryRequest;
import com.bitdot.bitdot_bank_app.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
}
