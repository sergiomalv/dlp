package ast.types;

import java.util.List;
import java.util.Objects;

/**
 * Represents a Field
 * @author Sergio
 */
public class FieldType extends AbstractType{

    // Variables of the class
    public String name;    //Name that identifies a field
    private Type type;            // Type of the field

    /**
     * Constructor of a field
     * @param line
     * @param column
     * @param name, identifier
     * @param type, type of the field
     */
    public FieldType(int line, int column, String name, Type type) {
        super(line, column);
        //checkParams(name, type);
        this.name = name;
        this.type = type;
    }

    /**
     * Check the params of the constructor
     * @param name, identifier of the field
     * @param type, type of the field
     */
    private void checkParams(String name, Type type){
        if (name.trim().isEmpty() || name == null){
            throw new IllegalArgumentException("Invalid name");
        }
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }

    @Override
    public String toString() {
        return name + ": " + type;
    }

    /**
     * Equals method, you only need to check that they have the same name
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldType fieldType = (FieldType) o;
        return Objects.equals(name, fieldType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
