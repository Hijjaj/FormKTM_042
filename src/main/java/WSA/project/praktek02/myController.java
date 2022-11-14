/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WSA.project.praktek02;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author LENOVO
 */

@Controller
public class myController {
    
   @RequestMapping("/alo")
   @ResponseBody
   public String getData(@RequestParam("nama") String text,
           @RequestParam("gambar") MultipartFile gambar,
           @RequestParam("nim") String nim,
           @RequestParam("jurusan") String jurusan
           
           //@RequestParam("tanggal") @DateTimeFormat(pattern="yyyy-MM-dd") Date date
   ) throws IOException{
       
       /*SimpleDateFormat newTanggal = new SimpleDateFormat("EE-dd-MMM-yyyy");
       String tanggalku = newTanggal.format(date);
       text = textProcess(text);*/
       
       String blob = Base64.encodeBase64String(gambar.getBytes());
       
       
       return "<h1>KTM</h1><hr><br><br><body><p>Nama ="+text+"</p><br><br><p>NIM ="+nim+"</p><br><br><p>Jurusan ="+jurusan+"</p><br><br><img src='data:image/jpeg;base64,"+blob+" ' /></body>"/*+tanggalku;*/;
   }
   
   /*private String textProcess(String nama){
       String result ="";
       if (nama.equals("alo")) {result = nama + "too";}
       else if (nama.equals("alo2")) {result = nama + "too doo";}
       else if (nama.equals("alo3")) {result = nama + "too doo raa";}
       else {result = nama + " hola ";}
       return result;
        
   }*/
    
}
