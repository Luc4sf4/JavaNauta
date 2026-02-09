public class ConversaoDeTipos {
    public static void main(String[] args) {
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.00;
        String numeroDoubleString = numeroInteger.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);

        String numeroStringDouble = "123.4";
        Double numeroConvertidoDouble = Double.parseDouble(numeroStringDouble);

        Long numeroLong = 10L;
        String numeroLongString = Long.toString(numeroLong);



        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " -> " + numeroString);
        System.out.println(numeroStringDois + " -> " + numeroConvertido);

        System.out.println(numeroDouble + " -> " + numeroDoubleString);
        System.out.println(numeroStringDouble + " -> " + numeroConvertidoDouble);

        System.out.println(numeroLong + " -> " + numeroConvertidoDouble);
    }
}
