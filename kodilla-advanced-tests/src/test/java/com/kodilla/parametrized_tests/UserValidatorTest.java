package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {
    UserValidator validator = new UserValidator();
    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "f7"})
    public void shouldReturnFalseWhenUsernameBelowThreeChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Agn#s", "b2d,,,9f&7"})
    public void shouldReturnFalseWhenUsernameContainsForbiddenChars(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user", "USER", "User111", "User_111", "234", "uSeR-911", "UsER.111", "-._"})
    public void shouldReturnTrueWhenUsernameContainsAnyPermittedChars(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseWhenEmailNull(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"use@r1@yah.oo.com", "us.er1@ya@h.oo.c.om"})
    public void shouldReturnFalseWhenForbiddenChars(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"u$er!@gm21l.com", "us%+@h0,,-.org"})
    public void shouldReturnFalseIfContainsForbiddenChars(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"user123@gmail.", "user345@gmail.comcomco"})
    public void shouldReturnFalseIfDomainEmptyOrTooManyChars(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Us3r-9.g8@outlook.COM", "tH1s_is_g3n3r4ted@yahoo9.com", "FluffCandy97@soc-ial.io"})
    public void shouldReturnTrueIfContainsAllPermittedChars(String email) {
        assertTrue(validator.validateEmail(email));
    }
}
