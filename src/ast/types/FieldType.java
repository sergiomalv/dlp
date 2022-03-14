package ast.types;

import java.util.List;

/**
 * Represents a Field
 * @author Sergio
 */
public class FieldType extends AbstractType{

    // Variables of the class
    private List<String> name;    //Name that identifies a field
    private Type type;            // Type of the field

    /**
     * Constructor of a field
     * @param line
     * @param column
     * @param name, identifier
     * @param type, type of the field
     */
    public FieldType(int line, int column, List<String> name, Type type) {
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
        String result = "";
        int counter = 0;

        for (String n : name){
            if (counter == name.size() -1){
                result += n + ": " + type.toString();
            } else {
                result += n + ", ";
            }
        }

        return result;
    }
}
