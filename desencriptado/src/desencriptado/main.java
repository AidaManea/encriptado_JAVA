package desencriptado;

import java.io.IOException;

public class main
{

    public static void main(String[] args) throws IOException
    {
        Criptografia criptografia = new Criptografia(1);
        
        //criptografia.encriptar("saludo.txt", "saludoCript.txt");
        criptografia.desencriptar("saludoCript.txt", "saludoDesencript.txt");
        
    }

}