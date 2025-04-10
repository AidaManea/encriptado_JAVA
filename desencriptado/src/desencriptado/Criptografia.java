package desencriptado;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Criptografia
{
    private int clave;
    
    public Criptografia (int clave)
    {
        this.clave = clave;
    }
    
    public void encriptar (String fileNameOrigen, String fileNameDestino) throws IOException
    {
        FileReader entrada = new FileReader(fileNameOrigen);
        FileWriter salida = new  FileWriter(fileNameDestino);
        int c;
        
        while ((c = entrada.read())!=-1)
        {
            salida.write((char)c + clave);
        }
        
        entrada.close();
        salida.close();
        
    }
    public void desencriptar (String fileNameOrigen, String fileNameDestino) throws IOException
    {
        FileReader entrada = new FileReader(fileNameOrigen);
        FileWriter salida = new  FileWriter(fileNameDestino);
        int c;
        
        while ((c = entrada.read())!=-1)
        {
            salida.write((char)c - clave);
        }
        
        entrada.close();
        salida.close();
        
    }
}