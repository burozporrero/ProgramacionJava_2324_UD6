package teoria;

public class OperadorDeBits {
    public static void main(String[] args) {
        // Definimos dos números enteros
        int num1 = 10;  // Representación binaria: 1010
        int num2 = 6;   // Representación binaria: 0110

        System.out.println("Num1: " + 10 + " (" + Integer.toBinaryString(10) + ")" );
        System.out.println("Num1: " + 6 + " (" + Integer.toBinaryString(6) + ")" );

        // Operador AND a nivel de bit: &
        int resultAnd = num1 & num2; // Resultado: 2 (binario: 0010)
        System.out.println("Resultado de num1 & num2: " + resultAnd + " (" + Integer.toBinaryString(resultAnd) + ")");

        // Operador OR a nivel de bit: |
        int resultOr = num1 | num2; // Resultado: 14 (binario: 1110)
        System.out.println("Resultado de num1 | num2: " + resultOr + " (" + Integer.toBinaryString(resultOr) + ")");

        // Operador XOR a nivel de bit: ^
        int resultXor = num1 ^ num2; // Resultado: 12 (binario: 1100)
        System.out.println("Resultado de num1 ^ num2: " + resultXor + " (" + Integer.toBinaryString(resultXor) + ")");

        // Operador de desplazamiento a la izquierda: <<
        int resultLeftShift = num1 << 2; // Resultado: 40 (binario: 101000)
        System.out.println("Resultado de num1 << 2: " + resultLeftShift + " (" + Integer.toBinaryString(resultLeftShift) + ")");

        // Operador de desplazamiento a la derecha: >>
        int resultRightShift = num2 >> 1; // Resultado: 3 (binario: 11)
        System.out.println("Resultado de num2 >> 1: " + resultRightShift + " (" + Integer.toBinaryString(resultRightShift) + ")");

        StringBuilder s = new StringBuilder();


    }
}
