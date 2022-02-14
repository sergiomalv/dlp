package ast.types;

import java.util.List;

/**
 * Represents a struct with a list of fields
 */
public class StructType extends AbstractType {

    // Variables of the class
    private List<FieldType> fields;  // List of fields

    /**
     * Constructor of a struct
     * @param line
     * @param column
     * @param fields, fields of the struct
     */
    public StructType(int line, int column, List<FieldType> fields) {
        super(line, column);
        checkParams(fields);
        this.fields = fields;
    }

    /**
     * Checks the fields of the constructor
     * @param fields
     */
    private void checkParams(List<FieldType> fields){
        if (fields == null){
            throw new IllegalArgumentException("The list of fields shouldn't be null");
        }
        for (FieldType field : fields){
            if (field == null){
                throw new IllegalArgumentException("Field shouldn't be null");
            }
        }
    }
}
