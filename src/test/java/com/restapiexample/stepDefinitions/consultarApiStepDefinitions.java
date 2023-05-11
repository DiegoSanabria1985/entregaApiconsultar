package com.restapiexample.stepDefinitions;

import com.restapiexample.model.consulta;
import com.restapiexample.model.crear;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class consultarApiStepDefinitions {

    @Cuando("^envia la siguiente informacion de usuario al servicio \"([^\"]*)\"$")
    public void envia_la_siguiente_informacion_de_usuario_al_servicio(String url, List<consulta> litaConsulta) {


        String cuerpo= "\t\n" +
                "{\n" +
                "\"status\": \""+litaConsulta.get(0).getStatus()+"\",\n" +
                "\"data\": [\n" +
                "\t{\n" +
                "\t\"id\": \""+litaConsulta.get(0).getId()+"\",\n" +
                "\t\"employee_name\": \""+litaConsulta.get(0).getEmployee_name()+"\",\n" +
                "\t\"employee_salary\": \""+litaConsulta.get(0).getEmployee_salary()+"\",\n" +
                "\t\"employee_age\": \""+litaConsulta.get(0).getEmployee_age()+"\",\n" +
                "\t\"profile_image\": \"\"\n" +
                "\t},\n" +
                "\t....\n" +
                "\t]\n" +
                "}";
        SerenityRest.given().baseUri(url).header("Content-Encoding","application/json").body(cuerpo).post();
    }

    @Entonces("^el usuario valida el codigo de estatus sea (\\d+)$")
    public void el_usuario_valida_el_codigo_de_estatus_sea(int status) {

        SerenityRest.lastResponse()
                .then().statusCode(status);
    }



}
