package ua.com.alevel.nullable;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 20/10/2020 - 9:17 PM
 */
public class Student {

    private String name;

    private Optional<String> nameOptional;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getNameOptional() {
        return nameOptional;
    }
}
