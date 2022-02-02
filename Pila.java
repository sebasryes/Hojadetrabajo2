
import java.util.Vector;

public class Pila implements Calculator, Stack<Double>{
    // atributos o propiedades
    Vector<Double> vector = new Vector<Double>(10,5); //vector inicial de 10 posicion y aumenta en 5
    double resultado=0; //resultado esperado para el usuario
    

    @Override
    public void add(Double item) {
        // TODO Auto-generated method stub
        vector.add(item);
    }

    @Override
    public Double remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Double peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public double calculate(String operation) {
        for (int i = 0; i < operation.length(); i++) {
            if(isOperator(operation.substring(i, i+1))) {
                // llamada de operate
                operate(operation.substring(i, i+1));
            } else {
                if (isNumber(operation.substring(i,i+1))) {
                    //vec.add(Double.parseDouble(operation.substring(i, i+1))); // agrega el elemento como un numero usando stack                 
                }
            }            
        }
        return resultado;
    }   
    
    /**
     * Valida si el char es un operador 
     * @param c
     * @return
     */
    private boolean isOperator(String c){
        return (c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"));
    }

    /**
     * Valida si el char es un numero
     * @param c
     * @return
     */
    private boolean isNumber(String c) {
        return ("1".equals(c)||"2".equals(c)||"3".equals(c)||"4".equals(c)||"5".equals(c)||"6".equals(c)||"7".equals(c)||"8".equals(c)||"9".equals(c)||"0".equals(c));
    }

    /**
     * Realiza las operaciones basicas requeridas 
     * @param operador Indica la operacion 
     */
    private void operate(String operador) {
        // Double b = vector.remove();
        // Double a = vector.remove();
        switch(operador) {
            case "+":
            break;
            case "-":
            break;
            case "*":
            break;
            case "/":
            break;
            default:
            break;
        }

        vector.add(resultado); // agrega el resultado al stack de Vector
    }
}
