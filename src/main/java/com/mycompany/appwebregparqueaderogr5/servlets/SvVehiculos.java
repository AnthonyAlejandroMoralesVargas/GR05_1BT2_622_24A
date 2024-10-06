
package com.mycompany.appwebregparqueaderogr5.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Vehiculo;

@WebServlet(name = "SvVehiculos", urlPatterns = {"/SvVehiculos"})
public class SvVehiculos extends HttpServlet {
    Controladora control = new Controladora();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Vehiculo> listaVehiculos = control.traerVehiculos();
        HttpSession misession = request.getSession();
        misession.setAttribute("listaVehiculos", listaVehiculos);
        response.sendRedirect("MostrarVehiculos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los datos del JSP
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        String modelo = request.getParameter("modelo");
        String color = request.getParameter("color");

        // Crear el objeto Vehiculo
        Vehiculo veh = new Vehiculo();
        veh.setPlaca(placa);
        veh.setMarca(marca);
        veh.setModelo(modelo);
        veh.setColor(color);

        // Enviar a la lógica de control
        control.crearVehiculo(veh);
        
        // Redireccionar o mostrar una vista de éxito
        response.sendRedirect("index.jsp");
    }
}