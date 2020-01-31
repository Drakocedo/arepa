/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

/**
 *
 * @author david.caycedo
 */
public class URLreader {
    
    public static void main(String[] args) throws Exception {
    FileWriter writer = new FileWriter("report.html");    
    PrintWriter salida = new PrintWriter(writer);
    Console console = System.console();
    String input = console.readLine("Enter input:");
 
    URL google;
        google = new URL(input);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null){
             writer.write(inputLine);
       
      
        }
        writer.flush();
        
    }   
}

