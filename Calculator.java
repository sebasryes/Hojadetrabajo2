/**
 * Defines all the methods that a Calculator should have
 * @author Pedro Marroquín 21801, Sebastian Reyes 21139 & Roberto Ríos 20979
 * @version 1.0
 * @since 30/01/2022
 */
public interface Calculator {
    /**
     * Calculates an entire operation.
     * @param operation String containing the operation to be calculated.
     * @return double with the result of the operation
     */
    public Double calculate(String operation) throws Exception;
}
