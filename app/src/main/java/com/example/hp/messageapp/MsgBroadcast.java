package com.example.hp.messageapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by hp on 2/21/2018.
 */

public class MsgBroadcast extends BroadcastReceiver{
  
    boolean con=false;
    String senderNumber ="+923088337790";
    String msg="";

    @Override
    public void onReceive(Context context, Intent intent) {


        Bundle bundlePDUS = intent.getExtras();
        Object[] pdus = (Object[]) bundlePDUS.get("pdus");
        SmsMessage message = SmsMessage.createFromPdu((byte[]) pdus[0]);

        String reciverNumber = message.getDisplayOriginatingAddress();
        if (senderNumber.equals(reciverNumber)) {
            msg=message.getMessageBody();
            if (msg.equals("ok")) {

                Toast.makeText(context, "SMS RECEIVED " + reciverNumber, Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(context, "Wrong Message", Toast.LENGTH_SHORT).show();
            }

        }
    }

    }
