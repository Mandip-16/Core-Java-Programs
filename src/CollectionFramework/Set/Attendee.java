package CollectionFramework.Set;

import java.util.Objects;

public class Attendee {

    int id;
    String name;

    public Attendee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same memory reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Attendee attendee = (Attendee) obj;
        return id == attendee.id && Objects.equals(name, attendee.name); // Compare ID & Name
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
