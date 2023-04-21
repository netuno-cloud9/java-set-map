/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author instrutor
 */
public class Teste {
    
    public static void main(String[] args) {
        //Map<String,String> pessoas = new HashMap<>();
        //Map<String,String> pessoas = new TreeMap<>();
        Map<String,String> pessoas = new LinkedHashMap<>();
        pessoas.put("03059803654", "Ryan");
        pessoas.put("93758830324", "Segundo");
        pessoas.put("93575089432", "Ícaro");
        System.out.println(pessoas.get("03059803654"));
    }
    
}
