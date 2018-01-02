package com.systango.springboard.service.user;

import com.systango.springboard.domain.model.payment.WalletDetails;
import com.systango.springboard.domain.model.payment.WalletLevel;
import com.systango.springboard.dto.model.user.UserDto;
import com.systango.springboard.service.exception.PaymentException;
import com.systango.springboard.service.exception.UserExistsException;

/**
 * Created by Arpit Khandelwal.
 */
public interface UserService {
    /**
     * Service method to add a new user.
     *
     * @param userDto
     * @return
     * @throws UserExistsException
     */
    String addUser(UserDto userDto) throws UserExistsException;

    /**
     * Create a new wallet for the given user.
     *
     * @param userDto
     * @param walletLevel
     * @return
     */

    WalletDetails createUserWallet(UserDto userDto, WalletLevel walletLevel) throws PaymentException;
}
