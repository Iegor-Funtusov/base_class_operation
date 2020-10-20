package ua.com.alevel.nullable;

import java.util.Optional;

/**
 * @author Iehor Funtusov, created 20/10/2020 - 9:17 PM
 */
public class Course {

    private Group group;

    private Optional<Group> optionalGroup;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Optional<Group> getOptionalGroup() {
        return optionalGroup;
    }
}
