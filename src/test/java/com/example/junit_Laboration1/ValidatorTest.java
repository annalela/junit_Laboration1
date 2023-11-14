package com.example.junit_Laboration1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    @DisplayName("Korrekt telnr format")
    public void givenPhoneNumberIsCorrectFormat_thenReturnTrue() {
        Validator tester = new Validator();
        assertTrue(tester.isPhoneNumberValid("0700123456"));
    }

    @Test
    @DisplayName("Fel, telnr har bokstäver")
    public void givenPhoneHasLetters_thenReturnFalse(){
        Validator tester = new Validator();
        assertFalse(tester.isPhoneNumberValid("070012345b"));
    }

    @Test
    @DisplayName("Fel, telnr är för kort")
    public void givenPhoneIsTooShort_thenReturnFalse() {
        Validator tester = new Validator();
        assertFalse(tester.isPhoneNumberValid("070"));
    }

    @Test
    @DisplayName("Rätt email format")
    public void givenEmailAdressHasKanelbullen_thenReturnTrue() {
        Validator tester = new Validator();
        assertTrue(tester.isEmailValid("anna.andersson@email.com"));
    }

    @Test
    @DisplayName("Fel email format")
    public void givenEmailAdressMissKanelbullen_thenReturnFalse() {
        Validator tester = new Validator();
        assertFalse(tester.isEmailValid("anna.andersson&email.com"));
    }

}

