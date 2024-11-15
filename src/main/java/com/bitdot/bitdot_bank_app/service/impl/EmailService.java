package com.bitdot.bitdot_bank_app.service.impl;

import com.bitdot.bitdot_bank_app.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
