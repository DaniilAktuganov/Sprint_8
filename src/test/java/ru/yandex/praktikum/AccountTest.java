package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    private Account account;

    @Test
    @DisplayName("Ввод валидного имени и фамилии")
    @Description("Проверка, что при вводе валидного имени и фамилии возвращается true")
    public void testValidName() {
        account = new Account("Тимоти Шаламе");
        assertTrue("Введите корректное имя", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод меньше 3 символов")
    @Description("Проверка, что при вводе меньше 3 символов возвращается false")
    public void testNameTooShort() {
        account = new Account("Ти");
        assertFalse("Имя слишком короткое", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод больше 19 символов")
    @Description("Проверка, что при вводе больше 19 символов возвращается false")
    public void testNameTooLong() {
        account = new Account("Тимофейка Шаламеевич");
        assertFalse("Имя слишком длинное", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод имени и фамилии без пробела")
    @Description("Проверка, что при отсутствии пробела возвращается false")
    public void testNameWithoutSpace() {
        account = new Account("ТимотиШаламе");
        assertFalse("Имя должно содержать один пробел", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод имени и фамилии с двумя пробелами")
    @Description("Проверка, что при вводе двух пробелов возвращается false")
    public void testNameWithTwoSpaces() {
        account = new Account("Тимоти Ша ламе");
        assertFalse("Имя должно содержать один пробел", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод имени и фамилии с пробелом в начале")
    @Description("Проверка, что при вводе пробела в начале возвращается false")
    public void testNameStartsWithSpace() {
        account = new Account(" Тимоти Шаламе");
        assertFalse("Имя не должно начинаться с пробела", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Ввод имени и фамилии с пробелом в конце")
    @Description("Проверка, что при вводе пробела в конце возвращается false")
    public void testNameEndsWithSpace() {
        account = new Account("Тимоти Шаламе ");
        assertFalse("Имя не должно заканчиваться пробелом", account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Пустой ввод")
    @Description("Проверка, что при пустом вводе возвращается false")
    public void testEmptyName() {
        account = new Account("");
        assertFalse("Введите корректное имя", account.checkNameToEmboss());
    }
}