public class Main {

    //Sesion de la 4.

    //-----Operadores a nivel de bits----
    public static void main(String[] args) {
        //Tipos de operandos, byte char short int long, con resultados en int o long.
        //El ~ complemento a 1, & And, | Or, ^ XOR, << Corrimiento con signo x numero de veces, al igual con >>. Tambien esta el >>> es sin signo un numero x de veces.
        int b1 = 0b10_1000,b2 =0b11_0000;
        //Normal dando 40 y 28
        System.out.println(b1 + "," + b2);
        //Negando a complemento 1
        System.out.println((~b1) + "," + (~b2));
        //Usando el &
        System.out.println(b1 & b2);
        //Usando el OR |
        System.out.println(b1 | b2);
        //Usando el XOR
        System.out.println(b1 ^ b2);
        //Usando el <<
        System.out.println(b1 << 2);
        //Usando el >>
        System.out.println(b1 >> 2);
        //Usando el ~>>
        System.out.println(~b1 >> 2);
        //Usanndo el >>>
        System.out.println(b1 >>> 2);

    }
}