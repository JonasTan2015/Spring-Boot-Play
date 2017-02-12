package com.bookstore.service;

import com.bookstore.domain.User;
import com.bookstore.domain.security.PasswordResetToken;

public interface UserService {
	public PasswordResetToken getPasswordResetToken(final String token);
		
	void createPasswordResetToken(final User user, final String token);
}
