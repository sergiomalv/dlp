package ast.types;

import ast.AstNode;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP tp) {
        return v.visit(this, tp);
    }

    @Override
    public Type dot(String name, AstNode node) {
        for (FieldType field : fields){
            if (field.getName().equals(name)){
                return field.getType();
            }
        }
        return super.dot(name, node);
    }

    /**
     * Checks the fields of the constructor
     * @param fields
     */
    private void checkParams(List<FieldType> fields){
        if (fields == null){
            throw new IllegalArgumentException("The list of fields shouldn't be null");
        }

    }

    @Override
    public int numberOfBytes() {
        int total = 0;
        for (Type type : fields){
            total += type.numberOfBytes();
        }
        return  total;
    }

    public FieldType getField(String id){
        for (int i = 0; i < fields.size(); i++){
            if (fields.get(i).name.equals(id)){
                return fields.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "struct {\n" + fields.toString() + "\n}";
    }

    public List<FieldType> getFields() {
        return fields;
    }
}
