/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelita.bar.controller;

import com.escuelita.bar.model.Mesa;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.stereotype.Controller;

/**
 *
 * @author lgaray
 */
@Controller
public class MesaController {

    private static ArrayList<Mesa> mesas;

    public MesaController() {
        mesas = new ArrayList();
    }

    public Boolean addMesa(Mesa mesa) {
        try {
            this.mesas.add(mesa);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ArrayList getAll() {
        return MesaController.mesas;
    }

    public void save(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public Boolean delete(Integer id) {
        Boolean result=false;
        for (Iterator iterator = this.mesas.iterator(); iterator.hasNext();) {
            Mesa item = (Mesa) iterator.next();
            if (item.getId() == id) {
                this.mesas.remove(item);
                result = true;
            }
        }
        return result;
    }

}
