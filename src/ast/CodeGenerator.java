package ast;

import ast.types.Type;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {

    // Variables of the class
    PrintWriter out;

    public CodeGenerator(String output, String input){
        try {
            out = new PrintWriter(output);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }

    public void pushBP(){
        out.println("\tpush\tbp");
        out.flush();
    }

    public void push(char c){
        out.println("\tpushb\t" + c);
        out.flush();
    }

    public void push(int i){
        out.println("\tpushi\t" + i);
        out.flush();
    }

    public void push(double d){
        out.println("\tpushd\t" + d);
        out.flush();
    }

    public void pusha(int i){
        out.println("\tpusha\t" + i);
        out.flush();
    }

    public void store(Type type){
        out.println("\tstore\t" + type.suffix());
        out.flush();
    }

    public void add(Type type){
        out.println("\tadd" + type.suffix());
        out.flush();
    }

    public void load(Type type){
        out.println("\tload" + type.suffix());
        out.flush();
    }

    public void sub(Type type){
        out.println("\tsub" + type.suffix());
        out.flush();
    }

    public void mul(Type type){
        out.println("\tmul" + type.suffix());
        out.flush();
    }

    public void div(Type type){
        out.println("\tdiv" + type.suffix());
        out.flush();
    }

    public void mod(Type type){
        out.println("\tmod" + type.suffix());
        out.flush();
    }

    public void pop(Type type){
        out.println("\tpop" + type.suffix());
        out.flush();
    }

    public void dup(Type type){
        out.println("\tdup" + type.suffix());
        out.flush();
    }

    public void gt(Type type){
        out.println("\tgt" + type.suffix());
        out.flush();
    }

    public void lt(Type type){
        out.println("\tlt" + type.suffix());
        out.flush();
    }

    public void ge(Type type){
        out.println("\tge" + type.suffix());
        out.flush();
    }

    public void le(Type type){
        out.println("\tle" + type.suffix());
        out.flush();
    }

    public void eq(Type type){
        out.println("\teq" + type.suffix());
        out.flush();
    }

    public void ne(Type type){
        out.println("\tne" + type.suffix());
        out.flush();
    }

    public void or(){
        out.println("\tor");
        out.flush();
    }

    public void not(){
        out.println("\tnot");
        out.flush();
    }

    public void and(){
        out.println("\tand");
        out.flush();
    }

    public void out(Type type){
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void in(Type type){
        out.println("\tin" + type.suffix());
        out.flush();
    }

    public void b2i(){
        out.println("\tb2i");
        out.flush();
    }

    public void i2f(){
        out.println("\ti2f");
        out.flush();
    }

    public void f2i(){
        out.println("\tf2i");
        out.flush();
    }

    public void i2b(){
        out.println("\ti2b");
        out.flush();
    }

    public void label(String label){
        out.println(label+":");
        out.flush();
    }

    public void jmp(String label){
        out.println("\tjmp\t" + label);
        out.flush();
    }

    public void jz(String label){
        out.println("\tjz\t" + label);
        out.flush();
    }

    public void jnz(String label){
        out.println("\tjnz\t" + label);
        out.flush();
    }

    public void call(String label){
        out.println("\tcall\t" + label);
        out.flush();
    }

    public void enter(int constant){
        out.println("\tenter\t" + constant);
        out.flush();
    }

    public void ret(int constant, int l, int p){
        out.println("\tret\t" + constant + "," + l + "," + p);
        out.flush();
    }

    public void halt(){
        out.println("halt");
        out.flush();
    }

    public void source(String constant){
        out.println("#source\t" + constant);
        out.flush();
    }

    public void line(String constant){
        out.println("#line\t" + constant);
        out.flush();
    }
}
