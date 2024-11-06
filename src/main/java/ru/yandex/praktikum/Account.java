package ru.yandex.praktikum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isValidLength = name.length() >= 3 && name.length() <= 19;
        boolean hasSpace = name.length() - name.replace(" ", "").length() == 1;
        boolean startsOrEndsWithSpace = name.startsWith(" ") || name.endsWith(" ");

        return isValidLength && hasSpace && !startsOrEndsWithSpace;
    }
}