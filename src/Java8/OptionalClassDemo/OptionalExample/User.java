package Java8.OptionalClassDemo.OptionalExample;

import java.util.Optional;

public class User {
    private String name;
    private Optional<Address> address;

    public User(String name, Address address) {
        this.name = name;
        this.address = Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
