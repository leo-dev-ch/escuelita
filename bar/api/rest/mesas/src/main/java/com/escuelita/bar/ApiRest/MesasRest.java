/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escuelita.bar.ApiRest;

import com.escuelita.bar.Utils.Response;
import com.escuelita.bar.controller.MesaController;
import com.escuelita.bar.model.Mesa;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author lgaray
 */
@RestController
@RequestMapping("/api")
public class MesasRest {

    MesaController mesaController;

    public MesasRest() {
        if (this.mesaController == null) {
            this.mesaController = new MesaController();
        }

    }

    @RequestMapping(value = "/mesas")
    public ResponseEntity<List<Mesa>> listAll() {
        Response response = new Response();
        ArrayList<Mesa> mesas = MesaController.getAll();

        if (mesas.isEmpty()) {
            response.setMsg("No existen registros");
            response.setStatus("205");
            return new ResponseEntity(response, HttpStatus.OK);
        }
        response.setStatus("200");
        response.setData(mesas);
        response.setMsg("success");
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/mesas", method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Mesa mesa, UriComponentsBuilder ucBuilder) {
        Response response = new Response();
        try {
            this.mesaController.save(mesa);
            response.setData("success");
            response.setMsg("Se creado con exito el evento");
            response.setStatus("200");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            response.setMsg("Error guardando el evento Catch");
            response.setStatus("201");
            return new ResponseEntity(response, HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/mesas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        Response response = new Response();
        try {
            Boolean result = this.mesaController.delete(Integer.parseInt(id));

            if (!result) {
                response.setMsg("Error eliminar");
                response.setStatus("201");
                return new ResponseEntity(response, HttpStatus.CONFLICT);
            }
            response.setData("success");
            response.setMsg("Se elimino con exito");
            response.setStatus("200");
            return new ResponseEntity(response, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            response.setMsg("Error eliminar Catch");
            response.setStatus("201");
            return new ResponseEntity(response, HttpStatus.CONFLICT);
        }
    }

}
