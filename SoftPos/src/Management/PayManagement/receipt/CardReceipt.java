/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management.PayManagement.receipt;

import File.*;
import Management.PayManagement.payment.*;
import com.google.gson.*;
import java.util.*;

import Management.PayManagement.payment.*;
/**
 *
 * @author USER
 */

public class CardReceipt {
    public ArrayList<Payment> rlist;
    public Payment pay;
    
    public CardReceipt(){
        rlist = new ArrayList<Payment>();
        pay = new Payment();
    }
    
    public void saveCardReceipt(ArrayList<Payment> payinfo) {
        // JSON으로 변환할 때 날짜 형식 지정
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        
        new Save_ReceiptData(payinfo);
        
        String json = gson.toJson(payinfo);
        System.out.println(json);
        
        System.out.println("complete");
    }
}
