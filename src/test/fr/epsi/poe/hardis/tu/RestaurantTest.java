package fr.epsi.poe.hardis.tu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jerome on 28/02/17.
 */
class RestaurantTest {
    public static final String VALID_PHONE_NUMBER = "+33999999999";
    public static final String INVALID_PHONE_NUMBER = "0102030405";
    private Restaurant restaurant;


    @BeforeEach
    public void setupRestaurant() {
        restaurant = new Restaurant();
        restaurant.setTelephone(VALID_PHONE_NUMBER);
    }

    @Test
    public void testThatRestaurantIsOpenByDefault() {
        // Arrange
        Restaurant resto;
        //Act
        resto = new Restaurant();
        // Assert
        assertTrue(resto.isOuvert(), "Le restaurant n'est pas ouvert par défaut.");
    }

    @Test
    public void testThatInvalidPhoneNumberIsNotSavedInModel() {
        // Arrange : créer le contexte d'exécution
        String tel = INVALID_PHONE_NUMBER; // <-- Mauvais format de numéro de téléphone
        // Act : action sur l'objet
        restaurant.setTelephone(tel);
        // Assert
        assertNotEquals(tel, restaurant.getTelephone(), "Un mauvais format de téléphone à été enregistré.");
    }

    @Test
    public void testThatValidPhoneNumberIsSavedInModel() {
        // Arrange
        String tel = VALID_PHONE_NUMBER;
        //Act
        restaurant.setTelephone(tel);
        // Assert
        assertEquals(tel, restaurant.getTelephone(), "Un numéro de téléphone au bon format n'a pas été sauvegardé.");
    }

    @Test
    public void testThatAddressContainsFrance() {
        // Arrange
        //Act
        restaurant.setAdresse("12, rue du Moulin Saint-Bernard");
        //Assert
        assertTrue(restaurant.getAdresse().contains("FRANCE"));
    }
}