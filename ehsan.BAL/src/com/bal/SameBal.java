/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bal;

import java.sql.Timestamp;

/**
 *
 * @author HP Pavilion
 */
public class SameBal {
    public static Timestamp getTimestamp()
    {
        java.util.Date date=new java.util.Date();
        return new Timestamp(date.getTime());
    }
}
